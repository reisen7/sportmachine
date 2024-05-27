package com.reisen.controller.gen;

import com.reisen.common.base.BaseController;
import com.reisen.common.domain.AjaxResult;
import com.reisen.common.domain.ResultTable;
import com.reisen.model.custom.Tablepar;
import com.reisen.model.auto.Discussyundongchangdi;
import com.reisen.service.DiscussyundongchangdiService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import cn.dev33.satoken.annotation.SaCheckPermission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

/**
 * 运动场地评论表Controller
 * @ClassName: DiscussyundongchangdiController
 * @author fuce
 * @date 2024-04-11 18:07:01
 */
@Api(value = "运动场地评论表")
@Controller
@RequestMapping("/DiscussyundongchangdiController")
public class DiscussyundongchangdiController extends BaseController{
	
	private String prefix = "gen/discussyundongchangdi";
	
	@Autowired
	private DiscussyundongchangdiService discussyundongchangdiService;
	
	
	/**
	 * 运动场地评论表页面展示
	 * @param model
	 * @return String
	 * @author fuce
	 */
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/view")
	//@SaCheckPermission("gen:discussyundongchangdi:view")
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
	//@Log(title = "运动场地评论表", action = "111")
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/list")
	//@SaCheckPermission("gen:discussyundongchangdi:list")
	@ResponseBody
	public ResultTable list(Tablepar tablepar,Discussyundongchangdi discussyundongchangdi){
		PageInfo<Discussyundongchangdi> page=discussyundongchangdiService.list(tablepar,discussyundongchangdi) ; 
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
	//@Log(title = "运动场地评论表新增", action = "111")
	@ApiOperation(value = "新增", notes = "新增")
	@PostMapping("/add")
	//@SaCheckPermission("gen:discussyundongchangdi:add")
	@ResponseBody
	public AjaxResult add(Discussyundongchangdi discussyundongchangdi){
		int b=discussyundongchangdiService.insertSelective(discussyundongchangdi);
		if(b>0){
			return success();
		}else{
			return error();
		}
	}
	
	/**
	 * 运动场地评论表删除
	 * @param ids
	 * @return
	 */
	//@Log(title = "运动场地评论表删除", action = "111")
	@ApiOperation(value = "删除", notes = "删除")
	@DeleteMapping("/remove")
	//@SaCheckPermission("gen:discussyundongchangdi:remove")
	@ResponseBody
	public AjaxResult remove(String ids){
		int b=discussyundongchangdiService.deleteByPrimaryKey(ids);
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
        map.put("Discussyundongchangdi", discussyundongchangdiService.selectByPrimaryKey(id));

        return prefix + "/edit";
    }
	
	/**
     * 修改保存
     */
    //@Log(title = "运动场地评论表修改", action = "111")
	@ApiOperation(value = "修改保存", notes = "修改保存")
    //@SaCheckPermission("gen:discussyundongchangdi:edit")
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Discussyundongchangdi discussyundongchangdi)
    {
        return toAjax(discussyundongchangdiService.updateByPrimaryKeySelective(discussyundongchangdi));
    }
    
    
    /**
	 * 修改状态
	 * @param record
	 * @return
	 */
    @PutMapping("/updateVisible")
	@ResponseBody
    public AjaxResult updateVisible(@RequestBody Discussyundongchangdi discussyundongchangdi){
		int i=discussyundongchangdiService.updateVisible(discussyundongchangdi);
		return toAjax(i);
	}

    
    

	
}
