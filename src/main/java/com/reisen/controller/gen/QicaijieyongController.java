package com.reisen.controller.gen;

import com.reisen.common.base.BaseController;
import com.reisen.common.domain.AjaxResult;
import com.reisen.common.domain.ResultTable;
import com.reisen.model.auto.Tiyuqicai;
import com.reisen.model.auto.TsysUser;
import com.reisen.model.custom.Tablepar;
import com.reisen.model.auto.Qicaijieyong;
import com.reisen.satoken.SaTokenUtil;
import com.reisen.service.QicaijieyongService;
import com.github.pagehelper.PageInfo;
import com.reisen.service.SysUserService;
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
 * 器材借用Controller
 * @ClassName: QicaijieyongController
 * @author fuce
 * @date 2024-04-11 18:05:41
 */
@Api(value = "器材借用")
@Controller
@RequestMapping("/QicaijieyongController")
public class QicaijieyongController extends BaseController{
	
	private String prefix = "gen/qicaijieyong";
	
	@Autowired
	private QicaijieyongService qicaijieyongService;

	@Autowired
	private TiyuqicaiService tiyuqicaiService;
	
	/**
	 * 器材借用页面展示
	 * @param model
	 * @return String
	 * @author fuce
	 */
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/view")
	//@SaCheckPermission("gen:qicaijieyong:view")
    public String view(ModelMap model)
    {
        return prefix + "/list";
    }
	
	/**
	 * list集合
	 * @param
	 * @param
	 * @return
	 */
	//@Log(title = "器材借用", action = "111")
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/list")
	//@SaCheckPermission("gen:qicaijieyong:list")
	@ResponseBody
	public ResultTable list(Tablepar tablepar,Qicaijieyong qicaijieyong){
		PageInfo<Qicaijieyong> page=qicaijieyongService.list(tablepar,qicaijieyong) ; 
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
		String role = sysUserService.getRole();
		modelMap.put("role",role);
        return prefix + "/add";
    }
	
    /**
     * 新增保存
     * @param 
     * @return
     */
	//@Log(title = "器材借用新增", action = "111")
	@ApiOperation(value = "新增", notes = "新增")
	@PostMapping("/add")
	//@SaCheckPermission("gen:qicaijieyong:add")
	@ResponseBody
	public AjaxResult add(Qicaijieyong qicaijieyong){
		Tiyuqicai tiyuqicai = tiyuqicaiService.selectByPrimaryKey(qicaijieyong.getQicaimingcheng());
		tiyuqicai.setShuliang(tiyuqicai.getShuliang()-qicaijieyong.getShuliang());
		if (tiyuqicai.getShuliang()<0){
			return error("库存不足");
		}
		int b=qicaijieyongService.insertSelective(qicaijieyong);
		if(b>0){
			tiyuqicaiService.updateByPrimaryKeySelective(tiyuqicai);
			return success();
		}else{
			return error();
		}
	}
	
	/**
	 * 器材借用删除
	 * @param ids
	 * @return
	 */
	//@Log(title = "器材借用删除", action = "111")
	@ApiOperation(value = "删除", notes = "删除")
	@DeleteMapping("/remove")
	//@SaCheckPermission("gen:qicaijieyong:remove")
	@ResponseBody
	public AjaxResult remove(String ids){
		int b=qicaijieyongService.deleteByPrimaryKey(ids);
		if(b>0){
			return success();
		}else{
			return error();
		}
	}
	
	
	/**
	 * 修改跳转
	 * @param id
	 * @param
	 * @return
	 */
	@ApiOperation(value = "修改跳转", notes = "修改跳转")
	@GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") String id, ModelMap map)
    {
        map.put("Qicaijieyong", qicaijieyongService.selectByPrimaryKey(id));
		List<Tiyuqicai> list = tiyuqicaiService.selectByExample(null);
		map.put("list",list);
		String role = sysUserService.getRole();
		map.put("role",role);
        return prefix + "/edit";
    }
	
	/**
     * 修改保存
     */
    //@Log(title = "器材借用修改", action = "111")
	@ApiOperation(value = "修改保存", notes = "修改保存")
    //@SaCheckPermission("gen:qicaijieyong:edit")
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Qicaijieyong qicaijieyong)
    {

        return toAjax(qicaijieyongService.updateByPrimaryKeySelective(qicaijieyong));
    }
    
    
    /**
	 * 修改状态
	 * @param
	 * @return
	 */
    @PutMapping("/updateVisible")
	@ResponseBody
    public AjaxResult updateVisible(@RequestBody Qicaijieyong qicaijieyong){
		int i=qicaijieyongService.updateVisible(qicaijieyong);
		return toAjax(i);
	}

    
    

	
}
