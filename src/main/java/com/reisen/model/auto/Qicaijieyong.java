package com.reisen.model.auto;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import cn.hutool.core.date.DateUtil;
import java.util.Date;

public class Qicaijieyong implements Serializable {
    private static final long serialVersionUID = 1L;

	
	@ApiModelProperty(value = "主键")
	private Long id;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	@ApiModelProperty(value = "创建时间")
	private Date addtime;
	
	@ApiModelProperty(value = "借用编号")
	private String jieyongbianhao;
	
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
	
	@ApiModelProperty(value = "账号")
	private String zhanghao;
	
	@ApiModelProperty(value = "姓名")
	private String xingming;
	
	@ApiModelProperty(value = "手机")
	private String shouji;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	@ApiModelProperty(value = "借用时间")
	private Date jieyongshijian;
	
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
	@JsonProperty("jieyongbianhao")
	public String getJieyongbianhao() {
		return jieyongbianhao;
	}

	public void setJieyongbianhao(String jieyongbianhao) {
		this.jieyongbianhao =  jieyongbianhao;
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
	@JsonProperty("zhanghao")
	public String getZhanghao() {
		return zhanghao;
	}

	public void setZhanghao(String zhanghao) {
		this.zhanghao =  zhanghao;
	}
	@JsonProperty("xingming")
	public String getXingming() {
		return xingming;
	}

	public void setXingming(String xingming) {
		this.xingming =  xingming;
	}
	@JsonProperty("shouji")
	public String getShouji() {
		return shouji;
	}

	public void setShouji(String shouji) {
		this.shouji =  shouji;
	}
	@JsonProperty("jieyongshijian")
	public Date getJieyongshijian() {
		return jieyongshijian;
	}

	public void setJieyongshijian(Date jieyongshijian) {
		this.jieyongshijian =  jieyongshijian;
	}


	public Qicaijieyong(Long id,Date addtime,String jieyongbianhao,String qicaimingcheng,String qicaileixing,String guige,Integer shuliang,String zhuyishixiang,String zhanghao,String xingming,String shouji,Date jieyongshijian) {
		
		this.id = id;
		
		this.addtime = addtime;
		
		this.jieyongbianhao = jieyongbianhao;
		
		this.qicaimingcheng = qicaimingcheng;
		
		this.qicaileixing = qicaileixing;
		
		this.guige = guige;
		
		this.shuliang = shuliang;
		
		this.zhuyishixiang = zhuyishixiang;
		
		this.zhanghao = zhanghao;
		
		this.xingming = xingming;
		
		this.shouji = shouji;
		
		this.jieyongshijian = jieyongshijian;
		
	}

	public Qicaijieyong() {
	    super();
	}

	public String dateToStringConvert(Date date) {
		if(date!=null) {
			return DateUtil.format(date, "yyyy-MM-dd HH:mm:ss");
		}
		return "";
	}
	

}