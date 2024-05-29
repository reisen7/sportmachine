package com.reisen.controller.admin;

import cn.dev33.satoken.annotation.SaCheckPermission;
import com.alibaba.fastjson.JSONObject;
import com.reisen.common.domain.AjaxResult;
import com.reisen.model.auto.Qicaiguihai;
import com.reisen.model.auto.Qicaijieyong;
import com.reisen.model.auto.Tiyuqicai;
import com.reisen.service.QicaiguihaiService;
import com.reisen.service.QicaijieyongService;
import com.reisen.service.TiyuqicaiService;
import io.swagger.annotations.Api;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("/EchartsController")
@SaCheckPermission("gen:echarts:view")
public class EchartsController {

    @Autowired
    private TiyuqicaiService tiyuqicaiService;

    @Autowired
    private QicaiguihaiService qicaiguihaiService;

    @Autowired
    private QicaijieyongService qicaijieyongService;


    @RequestMapping("/view")
    public String view(){

        return "admin/echarts/list";
    }


    @PostMapping("/equipmentQuantity")
    @ResponseBody
    public AjaxResult getEQuantity(){

        List<String> xData = new ArrayList<>();
        List<String> yData = new ArrayList<>();

        List<Tiyuqicai> tiyuqicaiList = tiyuqicaiService.selectByExample(null);
        tiyuqicaiList.forEach(x-> {
            xData.add(x.getQicaimingcheng());
            if (x.getShuliang()!=null) yData.add(x.getShuliang()+"");
            else yData.add("0");

        });
        JSONObject object = new JSONObject();
        object.put("xData",xData);
        object.put("yData",yData);
        return AjaxResult.successData(200,object);
    }



    @RequestMapping("/borrowedQuantity")
    @ResponseBody
    public AjaxResult  getBQuantity(){

        List<String> xData = new ArrayList<>();
        List<String> yData = new ArrayList<>();

        List<Qicaijieyong> qicaijieyongList = qicaijieyongService.selectByExample(null);
        qicaijieyongList.forEach(x->{
            xData.add(tiyuqicaiService.selectByPrimaryKey(x.getQicaimingcheng()).getQicaimingcheng());
            if (x.getShuliang()!=null) yData.add(x.getShuliang()+"");
            else yData.add("0");
        });
        JSONObject object = new JSONObject();
        object.put("xData",xData);
        object.put("yData",yData);
        return AjaxResult.successData(200,object);
    }



    @RequestMapping("/returnQuantity")
    @ResponseBody
    public AjaxResult  getRQuantity(){

        List<String> xData = new ArrayList<>();
        List<String> yData = new ArrayList<>();

        List<Qicaiguihai> qicaiguihaiList = qicaiguihaiService.selectByExample(null);
        qicaiguihaiList.forEach(x-> {
            xData.add(tiyuqicaiService.selectByPrimaryKey(x.getQicaimingcheng()).getQicaimingcheng());
            if (x.getShuliang()!=null) yData.add(x.getShuliang()+"");
            else yData.add("0");
        });
        JSONObject object = new JSONObject();
        object.put("xData",xData);
        object.put("yData",yData);
        return AjaxResult.successData(200,object);
    }


}
