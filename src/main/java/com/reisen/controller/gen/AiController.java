package com.reisen.controller.gen;

import com.reisen.common.domain.AjaxResult;
import com.reisen.satoken.SaTokenUtil;
import com.reisen.service.ApiService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Objects;

@Api(value = "AI智能问答")
@Controller
@RequestMapping("/AiController")
public class AiController {

    private String prefix = "gen/AiController";


    @Autowired
    protected ApiService apiService;

    @PostMapping("/query")
    @ResponseBody
    public AjaxResult query(String content) {
        String result = apiService.query(content);
        return AjaxResult.success(result);
    }

    @ApiOperation(value = "新增跳转", notes = "新增跳转")
    @GetMapping("/view")
    public String add(ModelMap modelMap)
    {
        String username = Objects.requireNonNull(SaTokenUtil.getUser()).getUsername();
        modelMap.put("username",username);
        return "gen/ai";
    }
}
