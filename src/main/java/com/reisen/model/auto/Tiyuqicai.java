package com.reisen.model.auto;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import cn.hutool.core.date.DateUtil;
import java.util.Date;

public class Tiyuqicai implements Serializable {
    private static final long serialVersionUID = 1L;

	
	@ApiModelProperty(value = "主键")
	private Long id;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	@ApiModelProperty(value = "创建时间")
	private Date addtime;
	
	@ApiModelProperty(value = "器材名称")
	private String qicaimingcheng;
	
	@ApiModelProperty(value = "器材类型")
	private String qicaileixing;
	
	@ApiModelProperty(value = "规格")
	private String guige;
	
	@ApiModelProperty(value = "数量")
	private Integer shuliang;
	
	@ApiModelProperty(value = "注意事项")
	private String zhuyishixiang;
	
	@ApiModelProperty(value = "器材详情")
	private String qicaixiangqing;
	
	@ApiModelProperty(value = "封面")
	private String fengmian;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	@ApiModelProperty(value = "发布时间")
	private Date fabushijian;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	@ApiModelProperty(value = "最近点击时间")
	private Date clicktime;
	
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
	@JsonProperty("qicaimingcheng")
	public String getQicaimingcheng() {
		return qicaimingcheng;
	}

	public void setQicaimingcheng(String qicaimingcheng) {
		this.qicaimingcheng =  qicaimingcheng;
	}
	@JsonProperty("qicaileixing")
	public String getQicaileixing() {
		return qicaileixing;
	}

	public void setQicaileixing(String qicaileixing) {
		this.qicaileixing =  qicaileixing;
	}
	@JsonProperty("guige")
	public String getGuige() {
		return guige;
	}

	public void setGuige(String guige) {
		this.guige =  guige;
	}
	@JsonProperty("shuliang")
	public Integer getShuliang() {
		return shuliang;
	}

	public void setShuliang(Integer shuliang) {
		this.shuliang =  shuliang;
	}
	@JsonProperty("zhuyishixiang")
	public String getZhuyishixiang() {
		return zhuyishixiang;
	}

	public void setZhuyishixiang(String zhuyishixiang) {
		this.zhuyishixiang =  zhuyishixiang;
	}
	@JsonProperty("qicaixiangqing")
	public String getQicaixiangqing() {
		return qicaixiangqing;
	}

	public void setQicaixiangqing(String qicaixiangqing) {
		this.qicaixiangqing =  qicaixiangqing;
	}
	@JsonProperty("fengmian")
	public String getFengmian() {
		return fengmian;
	}

	public void setFengmian(String fengmian) {
		this.fengmian =  fengmian;
	}
	@JsonProperty("fabushijian")
	public Date getFabushijian() {
		return fabushijian;
	}

	public void setFabushijian(Date fabushijian) {
		this.fabushijian =  fabushijian;
	}
	@JsonProperty("clicktime")
	public Date getClicktime() {
		return clicktime;
	}

	public void setClicktime(Date clicktime) {
		this.clicktime =  clicktime;
	}


	public Tiyuqicai(Long id,Date addtime,String qicaimingcheng,String qicaileixing,String guige,Integer shuliang,String zhuyishixiang,String qicaixiangqing,String fengmian,Date fabushijian,Date clicktime) {
		
		this.id = id;
		
		this.addtime = addtime;
		
		this.qicaimingcheng = qicaimingcheng;
		
		this.qicaileixing = qicaileixing;
		
		this.guige = guige;
		
		this.shuliang = shuliang;
		
		this.zhuyishixiang = zhuyishixiang;
		
		this.qicaixiangqing = qicaixiangqing;
		
		this.fengmian = fengmian;
		
		this.fabushijian = fabushijian;
		
		this.clicktime = clicktime;
		
	}

	public Tiyuqicai() {
	    super();
	}

	public String dateToStringConvert(Date date) {
		if(date!=null) {
			return DateUtil.format(date, "yyyy-MM-dd HH:mm:ss");
		}
		return "";
	}
	

}