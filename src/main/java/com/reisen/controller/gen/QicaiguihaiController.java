package com.reisen.controller.gen;

import cn.hutool.core.lang.Snowflake;
import com.reisen.common.base.BaseController;
import com.reisen.common.domain.AjaxResult;
import com.reisen.common.domain.ResultTable;
import com.reisen.model.auto.Tiyuqicai;
import com.reisen.model.auto.TsysUser;
import com.reisen.model.custom.Tablepar;
import com.reisen.model.auto.Qicaiguihai;
import com.reisen.satoken.SaTokenUtil;
import com.reisen.service.QicaiguihaiService;
import com.github.pagehelper.PageInfo;
import com.reisen.service.TiyuqicaiService;
import com.reisen.util.SnowflakeIdWorker;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import cn.dev33.satoken.annotation.SaCheckPermission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 器材归还Controller
 * @ClassName: QicaiguihaiController
 * @author fuce
 * @date 2024-04-11 18:06:09
 */
@Api(value = "器材归还")
@Controller
@RequestMapping("/QicaiguihaiController")
public class QicaiguihaiController extends BaseController{
	
	private String prefix = "gen/qicaiguihai";
	
	@Autowired
	private QicaiguihaiService qicaiguihaiService;

	@Autowired
	private TiyuqicaiService tiyuqicaiService;
	
	/**
	 * 器材归还页面展示
	 * @param model
	 * @return String
	 * @author fuce
	 */
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/view")
	//@SaCheckPermission("gen:qicaiguihai:view")
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
	//@Log(title = "器材归还", action = "111")
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/list")
	//@SaCheckPermission("gen:qicaiguihai:list")
	@ResponseBody
	public ResultTable list(Tablepar tablepar,Qicaiguihai qicaiguihai){
		PageInfo<Qicaiguihai> page=qicaiguihaiService.list(tablepar,qicaiguihai) ; 
		return pageTable(page.getList(),page.getTotal());
	}
	
	/**
     * 新增跳转
     */
	@ApiOperation(value = "新增跳转", notes = "新增跳转")
    @GetMapping("/add")
    public String add(ModelMap modelMap)
    {
		TsysUser tsysUser = SaTokenUtil.getUser();
		modelMap.put("username",tsysUser.getUsername());
		modelMap.put("nickname",tsysUser.getNickname());
		String uuid = SnowflakeIdWorker.getUUID();
		modelMap.put("uuid",uuid);
		List<Tiyuqicai> list = tiyuqicaiService.selectByExample(null);
		modelMap.put("list",list);
        return prefix + "/add";
    }
	
    /**
     * 新增保存
     * @param 
     * @return
     */
	//@Log(title = "器材归还新增", action = "111")
	@ApiOperation(value = "新增", notes = "新增")
	@PostMapping("/add")
	//@SaCheckPermission("gen:qicaiguihai:add")
	@ResponseBody
	public AjaxResult add(Qicaiguihai qicaiguihai){
		Tiyuqicai tiyuqicai = tiyuqicaiService.selectByPrimaryKey(qicaiguihai.getQicaimingcheng());
		int b=qicaiguihaiService.insertSelective(qicaiguihai);
		if(b>0){
			tiyuqicai.setShuliang(tiyuqicai.getShuliang()+qicaiguihai.getShuliang());
			tiyuqicaiService.updateByPrimaryKeySelective(tiyuqicai);
			return success();
		}else{
			return error();
		}
	}
	
	/**
	 * 器材归还删除
	 * @param ids
	 * @return
	 */
	//@Log(title = "器材归还删除", action = "111")
	@ApiOperation(value = "删除", notes = "删除")
	@DeleteMapping("/remove")
	//@SaCheckPermission("gen:qicaiguihai:remove")
	@ResponseBody
	public AjaxResult remove(String ids){
		int b=qicaiguihaiService.deleteByPrimaryKey(ids);
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
        map.put("Qicaiguihai", qicaiguihaiService.selectByPrimaryKey(id));
		List<Tiyuqicai> list = tiyuqicaiService.selectByExample(null);
		map.put("list",list);
        return prefix + "/edit";
    }
	
	/**
     * 修改保存
     */
    //@Log(title = "器材归还修改", action = "111")
	@ApiOperation(value = "修改保存", notes = "修改保存")
    //@SaCheckPermission("gen:qicaiguihai:edit")
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Qicaiguihai qicaiguihai)
    {
        return toAjax(qicaiguihaiService.updateByPrimaryKeySelective(qicaiguihai));
    }
    
    
    /**
	 * 修改状态
	 * @param record
	 * @return
	 */
    @PutMapping("/updateVisible")
	@ResponseBody
    public AjaxResult updateVisible(@RequestBody Qicaiguihai qicaiguihai){
		int i=qicaiguihaiService.updateVisible(qicaiguihai);
		return toAjax(i);
	}

    
    

	
}
