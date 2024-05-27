package com.reisen.controller.admin;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.model.ObjectMetadata;
import com.reisen.common.conf.oss.OssTemplate;
import com.reisen.common.domain.AjaxResult;
import com.reisen.model.auto.SysFile;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import cn.dev33.satoken.annotation.SaCheckPermission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import com.reisen.common.base.BaseController;
import com.reisen.model.custom.Tablepar;
import com.github.pagehelper.PageInfo;

import java.io.ByteArrayInputStream;
import java.util.Date;

/**
 * 文件上传controller
 * 文件上传controller
 * @author fuce
 * @date: 2024年9月16日 下午4:23:50
 */
@Api(value = "文件上传")
@Controller
@RequestMapping("/FileController")
public class FileController extends BaseController{

	//跳转页面参数
	private final String prefix = "admin/file";

	@Autowired
	private  OssTemplate template;
	
	/**
	 * 分页展示页面
	 * @param model
	 * @return
	 * @author fuce
	 * @date 2024年11月20日 下午10:18:32
	 */
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/view")
	@SaCheckPermission("system:file:view")
    public String view(ModelMap model)
    {
    	model.put("bucketURL","https://"+template.getOssProperties().getBucketName()+"."+template.getOssProperties().getEndpoint());
        return prefix + "/list";
    }
	
	/**
	 * 文件列表
	 * @param tablepar
	 * @param searchText 搜索字符
	 * @return
	 */
	@ApiOperation(value = "分页查询", notes = "分页查询")
	@GetMapping("/list")
	@SaCheckPermission("system:file:list")
	@ResponseBody
	public Object list(Tablepar tablepar,String searchText){
		PageInfo<SysFile> page=sysFileService.list(tablepar,searchText) ;
		return pageTable(page.getList(),page.getTotal());
	}
	
	/**
	 * 新增文件跳转页面
	 * @return
	 * @author fuce
	 * @date 2024年11月20日 下午10:19:03
	 */
	@ApiOperation(value = "新增跳转", notes = "新增跳转")
    @GetMapping("/add")
    public String add(ModelMap map)
    {
    	map.put("BucketName",template.getOssProperties().getBucketName());
        return prefix + "/add";
    }

	
	/**
	 * 检查文件名字
	 * @param tsysFile
	 * @return
	 */
	@ApiOperation(value = "检查Name唯一", notes = "检查Name唯一")
	@PostMapping("/checkNameUnique")
	@ResponseBody
	public int checkNameUnique(SysFile tsysFile){
		int b=sysFileService.checkNameUnique(tsysFile);
		if(b>0){
			return 1;
		}else{
			return 0;
		}
	}
	
	
	/**
	 * 修改文件
	 * @param id
	 * @param map
	 * @return
	 */
	@ApiOperation(value = "修改跳转", notes = "修改跳转")
	@GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") String id, ModelMap map)
    {
    	map.put("BucketName",template.getOssProperties().getBucketName());
        map.put("sysFile", sysFileService.selectByPrimaryKey(id));
        return prefix + "/edit";
    }
	
	
	/**
	 * 删除文件
	 * @param ids
	 * @return
	 */
	//@Log(title = "删除日志", action = "1")
	@ApiOperation(value = "删除", notes = "删除")
	@DeleteMapping("/remove")
	@SaCheckPermission("system:file:remove")
	@ResponseBody
	public AjaxResult remove(String ids){
		int b=sysFileService.deleteByPrimaryKey(ids);
		if(b>0){
			return success();
		}else{
			return error();
		}
	}

	@RequestMapping("/over/{id}")
	@ResponseBody
	public String over(@PathVariable("id") String id){


		OSS ossClient = new OSSClientBuilder().build(template.getOssProperties().getEndpoint(), template.getOssProperties().getAccessKey(), template.getOssProperties().getSecretKey());

		String fileName = id;
		ObjectMetadata objectMetadata = new ObjectMetadata();
		objectMetadata.setContentType(getcontentType(fileName.substring(fileName.lastIndexOf("."))));

		// 调用oss的方法实现长传
		// 第一个参数 bucketName
		// 第二个参数 上传到oss的文件路径和文件名称
		// 关闭OSSClient。
		// 把上传的文件路径返回 （手动拼接）
		// 这里设置图片有效时间 我设置了30年
		Date expiration = new Date(System.currentTimeMillis() + 946080000L * 1000);
        return ossClient.generatePresignedUrl(template.getOssProperties().getBucketName(), fileName, expiration).toString();
	}



	/**
	 * Description: 判断OSS服务文件上传时文件的contentType
	 *
	 * @param filenameExtension 文件后缀
	 * @return String
	 */
	public static String getcontentType(String filenameExtension) {
		if ("bmp".equalsIgnoreCase(filenameExtension)) {
			return "image/bmp";
		}
		if ("gif".equalsIgnoreCase(filenameExtension)) {
			return "image/gif";
		}
		if ("jpeg".equalsIgnoreCase(filenameExtension) || filenameExtension.equalsIgnoreCase("jpg")
				|| "png".equalsIgnoreCase(filenameExtension)) {
			return "image/jpeg";
		}
		if ("html".equalsIgnoreCase(filenameExtension)) {
			return "text/html";
		}
		if ("txt".equalsIgnoreCase(filenameExtension)) {
			return "text/plain";
		}
		if ("vsd".equalsIgnoreCase(filenameExtension)) {
			return "application/vnd.visio";
		}
		if ("pptx".equalsIgnoreCase(filenameExtension) || filenameExtension.equalsIgnoreCase("ppt")) {
			return "application/vnd.ms-powerpoint";
		}
		if ("docx".equalsIgnoreCase(filenameExtension) || filenameExtension.equalsIgnoreCase("doc")) {
			return "application/msword";
		}
		if ("xml".equalsIgnoreCase(filenameExtension)) {
			return "text/xml";
		}
		return "application/octet-stream";
	}
    
}
