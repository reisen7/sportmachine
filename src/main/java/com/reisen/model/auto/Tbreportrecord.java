package com.reisen.model.auto;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import cn.hutool.core.date.DateUtil;
import java.util.Date;

public class Tbreportrecord implements Serializable {
    private static final long serialVersionUID = 1L;

	
	@ApiModelProperty(value = "主键")
	private Integer id;
	
	@ApiModelProperty(value = "器材")
	private Integer equimentid;
	
	@ApiModelProperty(value = "器材名称")
	private String name;
	
	@ApiModelProperty(value = "用户")
	private String userid;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	@ApiModelProperty(value = "报修日期")
	private Date reportdate;
	
	@ApiModelProperty(value = "问题描述")
	private String problemdes;
	
	@ApiModelProperty(value = "报修状态")
	private String status;
	
	@ApiModelProperty(value = "用户姓名")
	private String username;
	
	@ApiModelProperty(value = "报修单")
	private String form;
	
	@JsonProperty("id")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id =  id;
	}
	@JsonProperty("equimentid")
	public Integer getEquimentid() {
		return equimentid;
	}

	public void setEquimentid(Integer equimentid) {
		this.equimentid =  equimentid;
	}
	@JsonProperty("name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name =  name;
	}
	@JsonProperty("userid")
	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid =  userid;
	}
	@JsonProperty("reportdate")
	public Date getReportdate() {
		return reportdate;
	}

	public void setReportdate(Date reportdate) {
		this.reportdate =  reportdate;
	}
	@JsonProperty("problemdes")
	public String getProblemdes() {
		return problemdes;
	}

	public void setProblemdes(String problemdes) {
		this.problemdes =  problemdes;
	}
	@JsonProperty("status")
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status =  status;
	}
	@JsonProperty("username")
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username =  username;
	}
	@JsonProperty("form")
	public String getForm() {
		return form;
	}

	public void setForm(String form) {
		this.form =  form;
	}


	public Tbreportrecord(Integer id,Integer equimentid,String name,String userid,Date reportdate,String problemdes,String status,String username,String form) {
		
		this.id = id;
		
		this.equimentid = equimentid;
		
		this.name = name;
		
		this.userid = userid;
		
		this.reportdate = reportdate;
		
		this.problemdes = problemdes;
		
		this.status = status;
		
		this.username = username;
		
		this.form = form;
		
	}

	public Tbreportrecord() {
	    super();
	}

	public String dateToStringConvert(Date date) {
		if(date!=null) {
			return DateUtil.format(date, "yyyy-MM-dd HH:mm:ss");
		}
		return "";
	}
	

}