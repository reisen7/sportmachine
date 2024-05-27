package com.reisen.controller.gen;

import com.reisen.common.base.BaseController;
import com.reisen.common.domain.AjaxResult;
import com.reisen.common.domain.ResultTable;
import com.reisen.model.custom.Tablepar;
import com.reisen.model.auto.Changdileixing;
import com.reisen.service.ChangdileixingService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import cn.dev33.satoken.annotation.SaCheckPermission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

/**
 * 场地类型Controller
 * @ClassName: ChangdileixingController
 * @author fuce
 * @date 2024-04-11 18:07:38
 */
@Api(value = "场地类型")
@Controller
@RequestMapping("/ChangdileixingController")
public class ChangdileixingController extends BaseController{
	
	private String prefix = "gen/changdileixing";
	
	@Autowired
	private ChangdileixingService changdileixingService;
	
	
	/**
	 * 场地类型页面展示
	 * @param model
	 * @return String
	 * @author fuce
	 */
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/view")
	//@SaCheckPermission("gen:changdileixing:view")
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
	//@Log(title = "场地类型", action = "111")
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/list")
	//@SaCheckPermission("gen:changdileixing:list")
	@ResponseBody
	public ResultTable list(Tablepar tablepar,Changdileixing changdileixing){
		PageInfo<Changdileixing> page=changdileixingService.list(tablepar,changdileixing) ; 
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
	//@Log(title = "场地类型新增", action = "111")
	@ApiOperation(value = "新增", notes = "新增")
	@PostMapping("/add")
	//@SaCheckPermission("gen:changdileixing:add")
	@ResponseBody
	public AjaxResult add(Changdileixing changdileixing){
		int b=changdileixingService.insertSelective(changdileixing);
		if(b>0){
			return success();
		}else{
			return error();
		}
	}
	
	/**
	 * 场地类型删除
	 * @param ids
	 * @return
	 */
	//@Log(title = "场地类型删除", action = "111")
	@ApiOperation(value = "删除", notes = "删除")
	@DeleteMapping("/remove")
	//@SaCheckPermission("gen:changdileixing:remove")
	@ResponseBody
	public AjaxResult remove(String ids){
		int b=changdileixingService.deleteByPrimaryKey(ids);
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
        map.put("Changdileixing", changdileixingService.selectByPrimaryKey(id));

        return prefix + "/edit";
    }
	
	/**
     * 修改保存
     */
    //@Log(title = "场地类型修改", action = "111")
	@ApiOperation(value = "修改保存", notes = "修改保存")
    //@SaCheckPermission("gen:changdileixing:edit")
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Changdileixing changdileixing)
    {
        return toAjax(changdileixingService.updateByPrimaryKeySelective(changdileixing));
    }
    
    
    /**
	 * 修改状态
	 * @param record
	 * @return
	 */
    @PutMapping("/updateVisible")
	@ResponseBody
    public AjaxResult updateVisible(@RequestBody Changdileixing changdileixing){
		int i=changdileixingService.updateVisible(changdileixing);
		return toAjax(i);
	}

    
    

	
}
