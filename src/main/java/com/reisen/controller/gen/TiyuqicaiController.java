package com.reisen.controller.gen;

import com.reisen.common.base.BaseController;
import com.reisen.common.domain.AjaxResult;
import com.reisen.common.domain.ResultTable;
import com.reisen.model.custom.Tablepar;
import com.reisen.model.auto.Tiyuqicai;
import com.reisen.service.TiyuqicaiService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import cn.dev33.satoken.annotation.SaCheckPermission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import com.reisen.common.conf.oss.OssConfig;

/**
 * 体育器材Controller
 * @ClassName: TiyuqicaiController
 * @author fuce
 * @date 2024-04-11 18:01:05
 */
@Api(value = "体育器材")
@Controller
@RequestMapping("/TiyuqicaiController")
public class TiyuqicaiController extends BaseController{
	
	private String prefix = "gen/tiyuqicai";
	
	@Autowired
	private TiyuqicaiService tiyuqicaiService;
	
	
	/**
	 * 体育器材页面展示
	 * @param model
	 * @return String
	 * @author fuce
	 */
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/view")
	//@SaCheckPermission("gen:tiyuqicai:view")
    @OssConfig
    public String view(ModelMap model)
    {
        return prefix + "/list";
    }
	
	/**
	 * list集合
	 * @param tablepar
	 * @param searchText
	 * @return
	 */
	//@Log(title = "体育器材", action = "111")
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/list")
	//@SaCheckPermission("gen:tiyuqicai:list")
	@ResponseBody
	public ResultTable list(Tablepar tablepar,Tiyuqicai tiyuqicai){
		PageInfo<Tiyuqicai> page=tiyuqicaiService.list(tablepar,tiyuqicai) ; 
		return pageTable(page.getList(),page.getTotal());
	}
	
	/**
     * 新增跳转
     */
	@ApiOperation(value = "新增跳转", notes = "新增跳转")
    @GetMapping("/add")
    @OssConfig
    public String add(ModelMap modelMap)
    {
        return prefix + "/add";
    }
	
    /**
     * 新增保存
     * @param 
     * @return
     */
	//@Log(title = "体育器材新增", action = "111")
	@ApiOperation(value = "新增", notes = "新增")
	@PostMapping("/add")
	//@SaCheckPermission("gen:tiyuqicai:add")
	@ResponseBody
	public AjaxResult add(Tiyuqicai tiyuqicai){
		int b=tiyuqicaiService.insertSelective(tiyuqicai);
		if(b>0){
			return success();
		}else{
			return error();
		}
	}
	
	/**
	 * 体育器材删除
	 * @param ids
	 * @return
	 */
	//@Log(title = "体育器材删除", action = "111")
	@ApiOperation(value = "删除", notes = "删除")
	@DeleteMapping("/remove")
	//@SaCheckPermission("gen:tiyuqicai:remove")
	@ResponseBody
	public AjaxResult remove(String ids){
		int b=tiyuqicaiService.deleteByPrimaryKey(ids);
		if(b>0){
			return success();
		}else{
			return error();
		}
	}
	
	
	/**
	 * 修改跳转
	 * @param id
	 * @param mmap
	 * @return
	 */
	@ApiOperation(value = "修改跳转", notes = "修改跳转")
	@GetMapping("/edit/{id}")
    @OssConfig
    public String edit(@PathVariable("id") String id, ModelMap map)
    {
        map.put("Tiyuqicai", tiyuqicaiService.selectByPrimaryKey(id));

        return prefix + "/edit";
    }
	
	/**
     * 修改保存
     */
    //@Log(title = "体育器材修改", action = "111")
	@ApiOperation(value = "修改保存", notes = "修改保存")
    //@SaCheckPermission("gen:tiyuqicai:edit")
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Tiyuqicai tiyuqicai)
    {
        return toAjax(tiyuqicaiService.updateByPrimaryKeySelective(tiyuqicai));
    }
    
    
    /**
	 * 修改状态
	 * @param record
	 * @return
	 */
    @PutMapping("/updateVisible")
	@ResponseBody
    public AjaxResult updateVisible(@RequestBody Tiyuqicai tiyuqicai){
		int i=tiyuqicaiService.updateVisible(tiyuqicai);
		return toAjax(i);
	}

    
    

	
}
