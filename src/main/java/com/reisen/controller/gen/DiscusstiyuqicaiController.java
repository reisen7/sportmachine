package com.reisen.controller.gen;

import com.reisen.common.base.BaseController;
import com.reisen.common.domain.AjaxResult;
import com.reisen.common.domain.ResultTable;
import com.reisen.mapper.auto.TSysRoleUserMapper;
import com.reisen.mapper.auto.TsysRoleMapper;
import com.reisen.model.auto.*;
import com.reisen.model.custom.Tablepar;
import com.reisen.satoken.SaTokenUtil;
import com.reisen.service.DiscusstiyuqicaiService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import cn.dev33.satoken.annotation.SaCheckPermission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

/**
 * 体育器材评论表Controller
 * @ClassName: DiscusstiyuqicaiController
 * @author fuce
 * @date 2024-04-11 18:07:21
 */
@Api(value = "体育器材评论表")
@Controller
@RequestMapping("/DiscusstiyuqicaiController")
public class DiscusstiyuqicaiController extends BaseController{
	
	private String prefix = "gen/discusstiyuqicai";
	
	@Autowired
	private DiscusstiyuqicaiService discusstiyuqicaiService;

	@Autowired
	private TSysRoleUserMapper roleUserMapper;
	
	/**
	 * 体育器材评论表页面展示
	 * @param model
	 * @return String
	 * @author fuce
	 */
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/view")
	//@SaCheckPermission("gen:discusstiyuqicai:view")
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
	//@Log(title = "体育器材评论表", action = "111")
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/list")
	//@SaCheckPermission("gen:discusstiyuqicai:list")
	@ResponseBody
	public ResultTable list(Tablepar tablepar,Discusstiyuqicai discusstiyuqicai){
		PageInfo<Discusstiyuqicai> page=discusstiyuqicaiService.list(tablepar,discusstiyuqicai) ; 
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
		String id = tsysUser.getId();
		TsysRoleExample roleExample = new TsysRoleExample();
		TSysRoleUserExample tSysRoleUserExample = new TSysRoleUserExample();
		tSysRoleUserExample.createCriteria().andSysUserIdEqualTo(id);

		TsysRole role = sysRoleService.selectByPrimaryKey(roleUserMapper.selectByExample(tSysRoleUserExample).get(0).getSysRoleId());
		modelMap.put("role",role.getName());
        return prefix + "/add";
    }
	
    /**
     * 新增保存
     * @param 
     * @return
     */
	//@Log(title = "体育器材评论表新增", action = "111")
	@ApiOperation(value = "新增", notes = "新增")
	@PostMapping("/add")
	//@SaCheckPermission("gen:discusstiyuqicai:add")
	@ResponseBody
	public AjaxResult add(Discusstiyuqicai discusstiyuqicai){
		int b=discusstiyuqicaiService.insertSelective(discusstiyuqicai);
		if(b>0){
			return success();
		}else{
			return error();
		}
	}
	
	/**
	 * 体育器材评论表删除
	 * @param ids
	 * @return
	 */
	//@Log(title = "体育器材评论表删除", action = "111")
	@ApiOperation(value = "删除", notes = "删除")
	@DeleteMapping("/remove")
	//@SaCheckPermission("gen:discusstiyuqicai:remove")
	@ResponseBody
	public AjaxResult remove(String ids){
		int b=discusstiyuqicaiService.deleteByPrimaryKey(ids);
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
        map.put("Discusstiyuqicai", discusstiyuqicaiService.selectByPrimaryKey(id));

		TsysUser tsysUser = SaTokenUtil.getUser();
		String id1 = tsysUser.getId();
		TsysRoleExample roleExample = new TsysRoleExample();
		TSysRoleUserExample tSysRoleUserExample = new TSysRoleUserExample();
		tSysRoleUserExample.createCriteria().andSysUserIdEqualTo(id1);

		TsysRole role = sysRoleService.selectByPrimaryKey(roleUserMapper.selectByExample(tSysRoleUserExample).get(0).getSysRoleId());
		map.put("role",role.getName());

        return prefix + "/edit";
    }
	
	/**
     * 修改保存
     */
    //@Log(title = "体育器材评论表修改", action = "111")
	@ApiOperation(value = "修改保存", notes = "修改保存")
    //@SaCheckPermission("gen:discusstiyuqicai:edit")
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Discusstiyuqicai discusstiyuqicai)
    {
        return toAjax(discusstiyuqicaiService.updateByPrimaryKeySelective(discusstiyuqicai));
    }
    
    
    /**
	 * 修改状态
	 * @param record
	 * @return
	 */
    @PutMapping("/updateVisible")
	@ResponseBody
    public AjaxResult updateVisible(@RequestBody Discusstiyuqicai discusstiyuqicai){
		int i=discusstiyuqicaiService.updateVisible(discusstiyuqicai);
		return toAjax(i);
	}

    
    

	
}
