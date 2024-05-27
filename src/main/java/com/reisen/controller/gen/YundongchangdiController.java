package com.reisen.controller.gen;

import com.reisen.common.base.BaseController;
import com.reisen.common.domain.AjaxResult;
import com.reisen.common.domain.ResultTable;
import com.reisen.model.custom.Tablepar;
import com.reisen.model.auto.Yundongchangdi;
import com.reisen.service.YundongchangdiService;
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
 * 运动场地Controller
 * @ClassName: YundongchangdiController
 * @author fuce
 * @date 2024-04-11 17:53:56
 */
@Api(value = "运动场地")
@Controller
@RequestMapping("/YundongchangdiController")
public class YundongchangdiController extends BaseController{
	
	private String prefix = "gen/yundongchangdi";
	
	@Autowired
	private YundongchangdiService yundongchangdiService;
	
	
	/**
	 * 运动场地页面展示
	 * @param model
	 * @return String
	 * @author fuce
	 */
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/view")
	//@SaCheckPermission("gen:yundongchangdi:view")
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
	//@Log(title = "运动场地", action = "111")
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/list")
	//@SaCheckPermission("gen:yundongchangdi:list")
	@ResponseBody
	public ResultTable list(Tablepar tablepar,Yundongchangdi yundongchangdi){
		PageInfo<Yundongchangdi> page=yundongchangdiService.list(tablepar,yundongchangdi) ; 
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
	//@Log(title = "运动场地新增", action = "111")
	@ApiOperation(value = "新增", notes = "新增")
	@PostMapping("/add")
	//@SaCheckPermission("gen:yundongchangdi:add")
	@ResponseBody
	public AjaxResult add(Yundongchangdi yundongchangdi){
		int b=yundongchangdiService.insertSelective(yundongchangdi);
		if(b>0){
			return success();
		}else{
			return error();
		}
	}
	
	/**
	 * 运动场地删除
	 * @param ids
	 * @return
	 */
	//@Log(title = "运动场地删除", action = "111")
	@ApiOperation(value = "删除", notes = "删除")
	@DeleteMapping("/remove")
	//@SaCheckPermission("gen:yundongchangdi:remove")
	@ResponseBody
	public AjaxResult remove(String ids){
		int b=yundongchangdiService.deleteByPrimaryKey(ids);
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
        map.put("Yundongchangdi", yundongchangdiService.selectByPrimaryKey(id));

        return prefix + "/edit";
    }
	
	/**
     * 修改保存
     */
    //@Log(title = "运动场地修改", action = "111")
	@ApiOperation(value = "修改保存", notes = "修改保存")
    //@SaCheckPermission("gen:yundongchangdi:edit")
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Yundongchangdi yundongchangdi)
    {
        return toAjax(yundongchangdiService.updateByPrimaryKeySelective(yundongchangdi));
    }
    
    
    /**
	 * 修改状态
	 * @param record
	 * @return
	 */
    @PutMapping("/updateVisible")
	@ResponseBody
    public AjaxResult updateVisible(@RequestBody Yundongchangdi yundongchangdi){
		int i=yundongchangdiService.updateVisible(yundongchangdi);
		return toAjax(i);
	}

    
    

	
}
