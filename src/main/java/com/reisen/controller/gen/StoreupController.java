package com.reisen.controller.gen;

import com.reisen.common.base.BaseController;
import com.reisen.common.domain.AjaxResult;
import com.reisen.common.domain.ResultTable;
import com.reisen.model.custom.Tablepar;
import com.reisen.model.auto.Storeup;
import com.reisen.service.StoreupService;
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
 * 收藏表Controller
 * @ClassName: StoreupController
 * @author fuce
 * @date 2024-04-11 18:03:42
 */
@Api(value = "收藏表")
@Controller
@RequestMapping("/StoreupController")
public class StoreupController extends BaseController{
	
	private String prefix = "gen/storeup";
	
	@Autowired
	private StoreupService storeupService;
	
	
	/**
	 * 收藏表页面展示
	 * @param model
	 * @return String
	 * @author fuce
	 */
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/view")
	//@SaCheckPermission("gen:storeup:view")
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
	//@Log(title = "收藏表", action = "111")
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/list")
	//@SaCheckPermission("gen:storeup:list")
	@ResponseBody
	public ResultTable list(Tablepar tablepar,Storeup storeup){
		PageInfo<Storeup> page=storeupService.list(tablepar,storeup) ; 
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
	//@Log(title = "收藏表新增", action = "111")
	@ApiOperation(value = "新增", notes = "新增")
	@PostMapping("/add")
	//@SaCheckPermission("gen:storeup:add")
	@ResponseBody
	public AjaxResult add(Storeup storeup){
		int b=storeupService.insertSelective(storeup);
		if(b>0){
			return success();
		}else{
			return error();
		}
	}
	
	/**
	 * 收藏表删除
	 * @param ids
	 * @return
	 */
	//@Log(title = "收藏表删除", action = "111")
	@ApiOperation(value = "删除", notes = "删除")
	@DeleteMapping("/remove")
	//@SaCheckPermission("gen:storeup:remove")
	@ResponseBody
	public AjaxResult remove(String ids){
		int b=storeupService.deleteByPrimaryKey(ids);
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
        map.put("Storeup", storeupService.selectByPrimaryKey(id));

        return prefix + "/edit";
    }
	
	/**
     * 修改保存
     */
    //@Log(title = "收藏表修改", action = "111")
	@ApiOperation(value = "修改保存", notes = "修改保存")
    //@SaCheckPermission("gen:storeup:edit")
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Storeup storeup)
    {
        return toAjax(storeupService.updateByPrimaryKeySelective(storeup));
    }
    
    
    /**
	 * 修改状态
	 * @param record
	 * @return
	 */
    @PutMapping("/updateVisible")
	@ResponseBody
    public AjaxResult updateVisible(@RequestBody Storeup storeup){
		int i=storeupService.updateVisible(storeup);
		return toAjax(i);
	}

    
    

	
}
