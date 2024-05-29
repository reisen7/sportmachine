package com.reisen.controller;

import com.alibaba.fastjson.JSONObject;
import com.reisen.common.domain.AjaxResult;
import com.reisen.model.auto.Changdiyuyue;
import com.reisen.model.auto.ChangdiyuyueExample;
import com.reisen.model.auto.Tiyuqicai;
import com.reisen.service.ChangdiyuyueService;
import com.reisen.service.TiyuqicaiService;
import com.reisen.util.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.reisen.util.DateUtils.format;

@Controller
public class EchartController {

    @Autowired
    private ChangdiyuyueService changdiyuyueService;

    @Autowired
    private TiyuqicaiService tiyuqicaiService;

    @PostMapping("/echart")
    @ResponseBody
    public AjaxResult getData(){

        ChangdiyuyueExample example = new ChangdiyuyueExample();
        example.setOrderByClause("addtime");
        List<Changdiyuyue> list =  changdiyuyueService.selectByExample(example);

        List<String> xData = new ArrayList<>();
        List<String> yData = new ArrayList<>();

        Map<String,Integer> map = new HashMap<>();
        list.forEach(x->{
            String str = format(x.getAddtime(),DateUtils.DATE_PATTERN);
            if (map.containsKey(str)){
                map.put(str,map.get(str)+1);
            }else{
                map.put(str,1);
            }
        });
        for(String key : map.keySet()){
            xData.add(key);
            yData.add(map.get(key).toString());
        }
        JSONObject object = new JSONObject();
        object.put("xData",xData);
        object.put("yData",yData);

        return AjaxResult.successData(200,object);

    }
}
