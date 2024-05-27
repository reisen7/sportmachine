package com.reisen.model.auto;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import cn.hutool.core.date.DateUtil;
import java.util.Date;

public class Storeup implements Serializable {
    private static final long serialVersionUID = 1L;

	
	@ApiModelProperty(value = "主键")
	private Long id;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	@ApiModelProperty(value = "创建时间")
	private Date addtime;
	
	@ApiModelProperty(value = "用户id")
	private Long userid;
	
	@ApiModelProperty(value = "收藏id")
	private Long refid;
	
	@ApiModelProperty(value = "表名")
	private String tablename;
	
	@ApiModelProperty(value = "收藏名称")
	private String name;
	
	@ApiModelProperty(value = "收藏图片")
	private String picture;
	
	@ApiModelProperty(value = "类型& #40;1:收藏,21:赞,22:踩& #41;")
	private String type;
	
	@ApiModelProperty(value = "推荐类型")
	private String inteltype;
	
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
	@JsonProperty("userid")
	public Long getUserid() {
		return userid;
	}

	public void setUserid(Long userid) {
		this.userid =  userid;
	}
	@JsonProperty("refid")
	public Long getRefid() {
		return refid;
	}

	public void setRefid(Long refid) {
		this.refid =  refid;
	}
	@JsonProperty("tablename")
	public String getTablename() {
		return tablename;
	}

	public void setTablename(String tablename) {
		this.tablename =  tablename;
	}
	@JsonProperty("name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name =  name;
	}
	@JsonProperty("picture")
	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture =  picture;
	}
	@JsonProperty("type")
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type =  type;
	}
	@JsonProperty("inteltype")
	public String getInteltype() {
		return inteltype;
	}

	public void setInteltype(String inteltype) {
		this.inteltype =  inteltype;
	}


	public Storeup(Long id,Date addtime,Long userid,Long refid,String tablename,String name,String picture,String type,String inteltype) {
		
		this.id = id;
		
		this.addtime = addtime;
		
		this.userid = userid;
		
		this.refid = refid;
		
		this.tablename = tablename;
		
		this.name = name;
		
		this.picture = picture;
		
		this.type = type;
		
		this.inteltype = inteltype;
		
	}

	public Storeup() {
	    super();
	}

	public String dateToStringConvert(Date date) {
		if(date!=null) {
			return DateUtil.format(date, "yyyy-MM-dd HH:mm:ss");
		}
		return "";
	}
	

}