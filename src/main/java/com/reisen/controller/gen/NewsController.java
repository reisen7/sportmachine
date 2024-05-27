package com.reisen.controller.gen;

import com.reisen.common.base.BaseController;
import com.reisen.common.domain.AjaxResult;
import com.reisen.common.domain.ResultTable;
import com.reisen.model.custom.Tablepar;
import com.reisen.model.auto.News;
import com.reisen.service.NewsService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import cn.dev33.satoken.annotation.SaCheckPermission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

/**
 * 体育资讯Controller
 * @ClassName: NewsController
 * @author fuce
 * @date 2024-04-11 18:08:55
 */
@Api(value = "体育资讯")
@Controller
@RequestMapping("/NewsController")
public class NewsController extends BaseController{
	
	private String prefix = "gen/news";
	
	@Autowired
	private NewsService newsService;
	
	
	/**
	 * 体育资讯页面展示
	 * @param model
	 * @return String
	 * @author fuce
	 */
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/view")
	//@SaCheckPermission("gen:news:view")
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
	//@Log(title = "体育资讯", action = "111")
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/list")
	//@SaCheckPermission("gen:news:list")
	@ResponseBody
	public ResultTable list(Tablepar tablepar,News news){
		PageInfo<News> page=newsService.list(tablepar,news) ; 
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
	//@Log(title = "体育资讯新增", action = "111")
	@ApiOperation(value = "新增", notes = "新增")
	@PostMapping("/add")
	//@SaCheckPermission("gen:news:add")
	@ResponseBody
	public AjaxResult add(News news){
		int b=newsService.insertSelective(news);
		if(b>0){
			return success();
		}else{
			return error();
		}
	}
	
	/**
	 * 体育资讯删除
	 * @param ids
	 * @return
	 */
	//@Log(title = "体育资讯删除", action = "111")
	@ApiOperation(value = "删除", notes = "删除")
	@DeleteMapping("/remove")
	//@SaCheckPermission("gen:news:remove")
	@ResponseBody
	public AjaxResult remove(String ids){
		int b=newsService.deleteByPrimaryKey(ids);
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
        map.put("News", newsService.selectByPrimaryKey(id));

        return prefix + "/edit";
    }
	
	/**
     * 修改保存
     */
    //@Log(title = "体育资讯修改", action = "111")
	@ApiOperation(value = "修改保存", notes = "修改保存")
    //@SaCheckPermission("gen:news:edit")
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(News news)
    {
        return toAjax(newsService.updateByPrimaryKeySelective(news));
    }
    
    
    /**
	 * 修改状态
	 * @param record
	 * @return
	 */
    @PutMapping("/updateVisible")
	@ResponseBody
    public AjaxResult updateVisible(@RequestBody News news){
		int i=newsService.updateVisible(news);
		return toAjax(i);
	}

    
    

	
}
