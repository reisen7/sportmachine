package com.reisen.model.auto;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import cn.hutool.core.date.DateUtil;
import java.util.Date;

public class News implements Serializable {
    private static final long serialVersionUID = 1L;

	
	@ApiModelProperty(value = "主键")
	private Long id;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	@ApiModelProperty(value = "创建时间")
	private Date addtime;
	
	@ApiModelProperty(value = "标题")
	private String title;
	
	@ApiModelProperty(value = "简介")
	private String introduction;
	
	@ApiModelProperty(value = "图片")
	private String picture;
	
	@ApiModelProperty(value = "内容")
	private String content;
	
	@JsonProperty("id")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id =  id;
	}
	@JsonProperty("addtime")
	public Date getAddtime() {
		return addtime;
	}

	public void setAddtime(Date addtime) {
		this.addtime =  addtime;
	}
	@JsonProperty("title")
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title =  title;
	}
	@JsonProperty("introduction")
	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction =  introduction;
	}
	@JsonProperty("picture")
	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture =  picture;
	}
	@JsonProperty("content")
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content =  content;
	}


	public News(Long id,Date addtime,String title,String introduction,String picture,String content) {
		
		this.id = id;
		
		this.addtime = addtime;
		
		this.title = title;
		
		this.introduction = introduction;
		
		this.picture = picture;
		
		this.content = content;
		
	}

	public News() {
	    super();
	}

	public String dateToStringConvert(Date date) {
		if(date!=null) {
			return DateUtil.format(date, "yyyy-MM-dd HH:mm:ss");
		}
		return "";
	}
	

}