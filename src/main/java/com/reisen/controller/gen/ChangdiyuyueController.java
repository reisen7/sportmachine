package com.reisen.controller.gen;

import com.reisen.common.base.BaseController;
import com.reisen.common.domain.AjaxResult;
import com.reisen.common.domain.ResultTable;
import com.reisen.model.custom.Tablepar;
import com.reisen.model.auto.Changdiyuyue;
import com.reisen.service.ChangdiyuyueService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import cn.dev33.satoken.annotation.SaCheckPermission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

/**
 * 场地预约Controller
 * @ClassName: ChangdiyuyueController
 * @author fuce
 * @date 2024-04-11 18:12:00
 */
@Api(value = "场地预约")
@Controller
@RequestMapping("/ChangdiyuyueController")
public class ChangdiyuyueController extends BaseController{
	
	private String prefix = "gen/changdiyuyue";
	
	@Autowired
	private ChangdiyuyueService changdiyuyueService;
	
	
	/**
	 * 场地预约页面展示
	 * @param model
	 * @return String
	 * @author fuce
	 */
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/view")
	//@SaCheckPermission("gen:changdiyuyue:view")
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
	//@Log(title = "场地预约", action = "111")
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/list")
	//@SaCheckPermission("gen:changdiyuyue:list")
	@ResponseBody
	public ResultTable list(Tablepar tablepar,Changdiyuyue changdiyuyue){
		PageInfo<Changdiyuyue> page=changdiyuyueService.list(tablepar,changdiyuyue) ; 
		return pageTable(page.getList(),page.getTotal());
	}
	
	/**
     * 新增跳转
     */
	@ApiOperation(value = "新增跳转", notes = "新增跳转")
    @GetMapping("/add")
    public String add(ModelMap modelMap)
    {
        return prefix + "/add";
    }
	
    /**
     * 新增保存
     * @param 
     * @return
     */
	//@Log(title = "场地预约新增", action = "111")
	@ApiOperation(value = "新增", notes = "新增")
	@PostMapping("/add")
	//@SaCheckPermission("gen:changdiyuyue:add")
	@ResponseBody
	public AjaxResult add(Changdiyuyue changdiyuyue){
		int b=changdiyuyueService.insertSelective(changdiyuyue);
		if(b>0){
			return success();
		}else{
			return error();
		}
	}
	
	/**
	 * 场地预约删除
	 * @param ids
	 * @return
	 */
	//@Log(title = "场地预约删除", action = "111")
	@ApiOperation(value = "删除", notes = "删除")
	@DeleteMapping("/remove")
	//@SaCheckPermission("gen:changdiyuyue:remove")
	@ResponseBody
	public AjaxResult remove(String ids){
		int b=changdiyuyueService.deleteByPrimaryKey(ids);
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
    public String edit(@PathVariable("id") String id, ModelMap map)
    {
        map.put("Changdiyuyue", changdiyuyueService.selectByPrimaryKey(id));

        return prefix + "/edit";
    }
	
	/**
     * 修改保存
     */
    //@Log(title = "场地预约修改", action = "111")
	@ApiOperation(value = "修改保存", notes = "修改保存")
    //@SaCheckPermission("gen:changdiyuyue:edit")
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Changdiyuyue changdiyuyue)
    {
        return toAjax(changdiyuyueService.updateByPrimaryKeySelective(changdiyuyue));
    }
    
    
    /**
	 * 修改状态
	 * @param record
	 * @return
	 */
    @PutMapping("/updateVisible")
	@ResponseBody
    public AjaxResult updateVisible(@RequestBody Changdiyuyue changdiyuyue){
		int i=changdiyuyueService.updateVisible(changdiyuyue);
		return toAjax(i);
	}

    
    

	
}
