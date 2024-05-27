package com.reisen.controller.gen;

import com.reisen.common.base.BaseController;
import com.reisen.common.domain.AjaxResult;
import com.reisen.common.domain.ResultTable;
import com.reisen.model.auto.Tiyuqicai;
import com.reisen.model.custom.Tablepar;
import com.reisen.model.auto.Tbreportrecord;
import com.reisen.service.TbreportrecordService;
import com.github.pagehelper.PageInfo;
import com.reisen.service.TiyuqicaiService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import cn.dev33.satoken.annotation.SaCheckPermission;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * 器材保修Controller
 * @ClassName: TbreportrecordController
 * @author fuce
 * @date 2024-04-26 23:52:42
 */
@Api(value = "器材保修")
@Controller
@RequestMapping("/TbreportrecordController")
public class TbreportrecordController extends BaseController{
	
	private String prefix = "gen/tbreportrecord";
	
	@Autowired
	private TbreportrecordService tbreportrecordService;

	@Autowired
	private TiyuqicaiService tiyuqicaiService;
	
	/**
	 * 器材保修页面展示
	 * @param model
	 * @return String
	 * @author fuce
	 */
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/view")
	//@SaCheckPermission("gen:tbreportrecord:view")
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
	//@Log(title = "器材保修", action = "111")
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/list")
	//@SaCheckPermission("gen:tbreportrecord:list")
	@ResponseBody
	public ResultTable list(Tablepar tablepar,Tbreportrecord tbreportrecord){
		PageInfo<Tbreportrecord> page=tbreportrecordService.list(tablepar,tbreportrecord) ; 
		return pageTable(page.getList(),page.getTotal());
	}
	
	/**
     * 新增跳转
     */
	@ApiOperation(value = "新增跳转", notes = "新增跳转")
    @GetMapping("/add")
    public String add(ModelMap modelMap)
    {
		List<Tiyuqicai> tiyuqicaiList = tiyuqicaiService.selectByExample(null);
		modelMap.put("qicai",tiyuqicaiList);
        return prefix + "/add";
    }
	
    /**
     * 新增保存
     * @param 
     * @return
     */
	//@Log(title = "器材保修新增", action = "111")
	@ApiOperation(value = "新增", notes = "新增")
	@PostMapping("/add")
	//@SaCheckPermission("gen:tbreportrecord:add")
	@ResponseBody
	public AjaxResult add(Tbreportrecord tbreportrecord){
		int b=tbreportrecordService.insertSelective(tbreportrecord);
		if(b>0){
			return success();
		}else{
			return error();
		}
	}
	
	/**
	 * 器材保修删除
	 * @param ids
	 * @return
	 */
	//@Log(title = "器材保修删除", action = "111")
	@ApiOperation(value = "删除", notes = "删除")
	@DeleteMapping("/remove")
	//@SaCheckPermission("gen:tbreportrecord:remove")
	@ResponseBody
	public AjaxResult remove(String ids){
		int b=tbreportrecordService.deleteByPrimaryKey(ids);
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
		List<Tiyuqicai> tiyuqicaiList = tiyuqicaiService.selectByExample(null);
		map.put("qicai",tiyuqicaiList);
        map.put("Tbreportrecord", tbreportrecordService.selectByPrimaryKey(id));

        return prefix + "/edit";
    }
	
	/**
     * 修改保存
     */
    //@Log(title = "器材保修修改", action = "111")
	@ApiOperation(value = "修改保存", notes = "修改保存")
    //@SaCheckPermission("gen:tbreportrecord:edit")
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Tbreportrecord tbreportrecord)
    {
        return toAjax(tbreportrecordService.updateByPrimaryKeySelective(tbreportrecord));
    }
    
    
    /**
	 * 修改状态
	 * @param record
	 * @return
	 */
    @PutMapping("/updateVisible")
	@ResponseBody
    public AjaxResult updateVisible(@RequestBody Tbreportrecord tbreportrecord){
		int i=tbreportrecordService.updateVisible(tbreportrecord);
		return toAjax(i);
	}

    
    

	
}
