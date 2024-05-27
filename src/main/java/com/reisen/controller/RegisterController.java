package com.reisen.controller;

import com.reisen.common.base.BaseController;
import com.reisen.common.domain.AjaxResult;
import com.reisen.mapper.auto.TSysRoleUserMapper;
import com.reisen.mapper.auto.TsysRoleMapper;
import com.reisen.mapper.auto.TsysUserMapper;
import com.reisen.model.auto.*;
import com.reisen.service.SysUserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Controller
public class RegisterController extends BaseController {

    @Autowired
    private TsysUserMapper tsysUserMapper;

    @Autowired
    private TSysRoleUserMapper tSysRoleUserMapper;

    @Autowired
    private TsysRoleMapper tsysRoleMapper;

    @Autowired
    private SysUserService userService;

    @ApiOperation(value = "注册", notes = "注册")
    @GetMapping("/register")
    public String register(HttpServletRequest request, Map<String,Object> map) {


        System.out.println(1111);
        return "register";
    }


    @PostMapping("/register/add")
    @ResponseBody
    public AjaxResult add(TsysUser tsysUser){
//        int b = userService.insertSelective(tsysUser);
//        TsysUserExample tsysUserExample = new TsysUserExample();
//        tsysUserExample.createCriteria().andUsernameEqualTo(tsysUser.getUsername());
//        List<TsysUser> tsysUsers = tsysUserMapper.selectByExample(tsysUserExample);
        TsysRoleExample tsysRoleExample = new TsysRoleExample();
        tsysRoleExample.createCriteria().andNameEqualTo("学生");
        List<TsysRole> tsysRoles = sysRoleService.selectByExample(tsysRoleExample);
        int b = sysUserService.insertUserRoles(tsysUser,tsysRoles.get(0).getId());
        if(b>0){
            return success();
        }else{
            return error();
        }
    }


}
