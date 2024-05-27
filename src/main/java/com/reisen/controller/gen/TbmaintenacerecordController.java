package com.reisen.controller.gen;

import com.reisen.common.base.BaseController;
import com.reisen.common.domain.AjaxResult;
import com.reisen.common.domain.ResultTable;
import com.reisen.model.auto.Tiyuqicai;
import com.reisen.model.custom.Tablepar;
import com.reisen.model.auto.Tbmaintenacerecord;
import com.reisen.service.TbmaintenacerecordService;
import com.github.pagehelper.PageInfo;
import com.reisen.service.TiyuqicaiService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import cn.dev33.satoken.annotation.SaCheckPermission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 器材维护Controller
 * @ClassName: TbmaintenacerecordController
 * @author fuce
 * @date 2024-04-26 23:52:58
 */
@Api(value = "器材维护")
@Controller
@RequestMapping("/TbmaintenacerecordController")
public class TbmaintenacerecordController extends BaseController{
	
	private String prefix = "gen/tbmaintenacerecord";
	
	@Autowired
	private TbmaintenacerecordService tbmaintenacerecordService;

	@Autowired
	private TiyuqicaiService tiyuqicaiService;
	
	/**
	 * 器材维护页面展示
	 * @param model
	 * @return String
	 * @author fuce
	 */
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/view")
	//@SaCheckPermission("gen:tbmaintenacerecord:view")
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
	//@Log(title = "器材维护", action = "111")
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/list")
	//@SaCheckPermission("gen:tbmaintenacerecord:list")
	@ResponseBody
	public ResultTable list(Tablepar tablepar,Tbmaintenacerecord tbmaintenacerecord){
		PageInfo<Tbmaintenacerecord> page=tbmaintenacerecordService.list(tablepar,tbmaintenacerecord) ; 
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
	//@Log(title = "器材维护新增", action = "111")
	@ApiOperation(value = "新增", notes = "新增")
	@PostMapping("/add")
	//@SaCheckPermission("gen:tbmaintenacerecord:add")
	@ResponseBody
	public AjaxResult add(Tbmaintenacerecord tbmaintenacerecord){
		int b=tbmaintenacerecordService.insertSelective(tbmaintenacerecord);
		if(b>0){
			return success();
		}else{
			return error();
		}
	}
	
	/**
	 * 器材维护删除
	 * @param ids
	 * @return
	 */
	//@Log(title = "器材维护删除", action = "111")
	@ApiOperation(value = "删除", notes = "删除")
	@DeleteMapping("/remove")
	//@SaCheckPermission("gen:tbmaintenacerecord:remove")
	@ResponseBody
	public AjaxResult remove(String ids){
		int b=tbmaintenacerecordService.deleteByPrimaryKey(ids);
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
        map.put("Tbmaintenacerecord", tbmaintenacerecordService.selectByPrimaryKey(id));

        return prefix + "/edit";
    }
	
	/**
     * 修改保存
     */
    //@Log(title = "器材维护修改", action = "111")
	@ApiOperation(value = "修改保存", notes = "修改保存")
    //@SaCheckPermission("gen:tbmaintenacerecord:edit")
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Tbmaintenacerecord tbmaintenacerecord)
    {

        return toAjax(tbmaintenacerecordService.updateByPrimaryKeySelective(tbmaintenacerecord));
    }
    
    
    /**
	 * 修改状态
	 * @param record
	 * @return
	 */
    @PutMapping("/updateVisible")
	@ResponseBody
    public AjaxResult updateVisible(@RequestBody Tbmaintenacerecord tbmaintenacerecord){
		int i=tbmaintenacerecordService.updateVisible(tbmaintenacerecord);
		return toAjax(i);
	}

    
    

	
}
