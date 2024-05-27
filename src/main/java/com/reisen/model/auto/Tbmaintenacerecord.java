package com.reisen.model.auto;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import cn.hutool.core.date.DateUtil;
import java.util.Date;

public class Tbmaintenacerecord implements Serializable {
    private static final long serialVersionUID = 1L;

	
	@ApiModelProperty(value = "主键")
	private Integer id;
	
	@ApiModelProperty(value = "器材id")
	private Integer equipmentid;
	
	@ApiModelProperty(value = "器材名称")
	private String name;
	
	@ApiModelProperty(value = "用户id")
	private String userid;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	@ApiModelProperty(value = "维护日期")
	private Date maintenancedate;
	
	@ApiModelProperty(value = "维护内容")
	private String maintenanceContent;
	
	@ApiModelProperty(value = "维护状态")
	private String status;
	
	@ApiModelProperty(value = "用户姓名")
	private String username;
	
	@JsonProperty("id")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id =  id;
	}
	@JsonProperty("equipmentid")
	public Integer getEquipmentid() {
		return equipmentid;
	}

	public void setEquipmentid(Integer equipmentid) {
		this.equipmentid =  equipmentid;
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
	@JsonProperty("maintenancedate")
	public Date getMaintenancedate() {
		return maintenancedate;
	}

	public void setMaintenancedate(Date maintenancedate) {
		this.maintenancedate =  maintenancedate;
	}
	@JsonProperty("maintenanceContent")
	public String getMaintenanceContent() {
		return maintenanceContent;
	}

	public void setMaintenanceContent(String maintenanceContent) {
		this.maintenanceContent =  maintenanceContent;
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


	public Tbmaintenacerecord(Integer id,Integer equipmentid,String name,String userid,Date maintenancedate,String maintenanceContent,String status,String username) {
		
		this.id = id;
		
		this.equipmentid = equipmentid;
		
		this.name = name;
		
		this.userid = userid;
		
		this.maintenancedate = maintenancedate;
		
		this.maintenanceContent = maintenanceContent;
		
		this.status = status;
		
		this.username = username;
		
	}

	public Tbmaintenacerecord() {
	    super();
	}

	public String dateToStringConvert(Date date) {
		if(date!=null) {
			return DateUtil.format(date, "yyyy-MM-dd HH:mm:ss");
		}
		return "";
	}
	

}