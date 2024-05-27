package com.reisen.controller.gen;

import com.reisen.common.base.BaseController;
import com.reisen.common.domain.AjaxResult;
import com.reisen.common.domain.ResultTable;
import com.reisen.model.custom.Tablepar;
import com.reisen.model.auto.Quxiaoyuyue;
import com.reisen.service.QuxiaoyuyueService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import cn.dev33.satoken.annotation.SaCheckPermission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

/**
 * 取消预约Controller
 * @ClassName: QuxiaoyuyueController
 * @author fuce
 * @date 2024-04-11 18:18:51
 */
@Api(value = "取消预约")
@Controller
@RequestMapping("/QuxiaoyuyueController")
public class QuxiaoyuyueController extends BaseController{
	
	private String prefix = "gen/quxiaoyuyue";
	
	@Autowired
	private QuxiaoyuyueService quxiaoyuyueService;
	
	
	/**
	 * 取消预约页面展示
	 * @param model
	 * @return String
	 * @author fuce
	 */
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/view")
	//@SaCheckPermission("gen:quxiaoyuyue:view")
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
	//@Log(title = "取消预约", action = "111")
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/list")
	//@SaCheckPermission("gen:quxiaoyuyue:list")
	@ResponseBody
	public ResultTable list(Tablepar tablepar,Quxiaoyuyue quxiaoyuyue){
		PageInfo<Quxiaoyuyue> page=quxiaoyuyueService.list(tablepar,quxiaoyuyue) ; 
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
	//@Log(title = "取消预约新增", action = "111")
	@ApiOperation(value = "新增", notes = "新增")
	@PostMapping("/add")
	//@SaCheckPermission("gen:quxiaoyuyue:add")
	@ResponseBody
	public AjaxResult add(Quxiaoyuyue quxiaoyuyue){
		int b=quxiaoyuyueService.insertSelective(quxiaoyuyue);
		if(b>0){
			return success();
		}else{
			return error();
		}
	}
	
	/**
	 * 取消预约删除
	 * @param ids
	 * @return
	 */
	//@Log(title = "取消预约删除", action = "111")
	@ApiOperation(value = "删除", notes = "删除")
	@DeleteMapping("/remove")
	//@SaCheckPermission("gen:quxiaoyuyue:remove")
	@ResponseBody
	public AjaxResult remove(String ids){
		int b=quxiaoyuyueService.deleteByPrimaryKey(ids);
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
        map.put("Quxiaoyuyue", quxiaoyuyueService.selectByPrimaryKey(id));

        return prefix + "/edit";
    }
	
	/**
     * 修改保存
     */
    //@Log(title = "取消预约修改", action = "111")
	@ApiOperation(value = "修改保存", notes = "修改保存")
    //@SaCheckPermission("gen:quxiaoyuyue:edit")
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Quxiaoyuyue quxiaoyuyue)
    {
        return toAjax(quxiaoyuyueService.updateByPrimaryKeySelective(quxiaoyuyue));
    }
    
    
    /**
	 * 修改状态
	 * @param record
	 * @return
	 */
    @PutMapping("/updateVisible")
	@ResponseBody
    public AjaxResult updateVisible(@RequestBody Quxiaoyuyue quxiaoyuyue){
		int i=quxiaoyuyueService.updateVisible(quxiaoyuyue);
		return toAjax(i);
	}

    
    

	
}
