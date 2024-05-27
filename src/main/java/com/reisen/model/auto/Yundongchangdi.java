package com.reisen.model.auto;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import cn.hutool.core.date.DateUtil;
import java.util.Date;

public class Yundongchangdi implements Serializable {
    private static final long serialVersionUID = 1L;

	
	@ApiModelProperty(value = "主键")
	private Long id;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	@ApiModelProperty(value = "创建时间")
	private Date addtime;
	
	@ApiModelProperty(value = "场地编号")
	private String changdibianhao;
	
	@ApiModelProperty(value = "场地名称")
	private String changdimingcheng;
	
	@ApiModelProperty(value = "场地类型")
	private String changdileixing;
	
	@ApiModelProperty(value = "位置")
	private String weizhi;
	
	@ApiModelProperty(value = "租赁单价")
	private Integer zulindanjia;
	
	@ApiModelProperty(value = "可约时间")
	private String keyueshijian;
	
	@ApiModelProperty(value = "联系电话")
	private String lianxidianhua;
	
	@ApiModelProperty(value = "场地详情")
	private String changdixiangqing;
	
	@ApiModelProperty(value = "场地图片")
	private String changditupian;
	
	@ApiModelProperty(value = "点击次数")
	private Integer clicknum;
	
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
	@JsonProperty("changdibianhao")
	public String getChangdibianhao() {
		return changdibianhao;
	}

	public void setChangdibianhao(String changdibianhao) {
		this.changdibianhao =  changdibianhao;
	}
	@JsonProperty("changdimingcheng")
	public String getChangdimingcheng() {
		return changdimingcheng;
	}

	public void setChangdimingcheng(String changdimingcheng) {
		this.changdimingcheng =  changdimingcheng;
	}
	@JsonProperty("changdileixing")
	public String getChangdileixing() {
		return changdileixing;
	}

	public void setChangdileixing(String changdileixing) {
		this.changdileixing =  changdileixing;
	}
	@JsonProperty("weizhi")
	public String getWeizhi() {
		return weizhi;
	}

	public void setWeizhi(String weizhi) {
		this.weizhi =  weizhi;
	}
	@JsonProperty("zulindanjia")
	public Integer getZulindanjia() {
		return zulindanjia;
	}

	public void setZulindanjia(Integer zulindanjia) {
		this.zulindanjia =  zulindanjia;
	}
	@JsonProperty("keyueshijian")
	public String getKeyueshijian() {
		return keyueshijian;
	}

	public void setKeyueshijian(String keyueshijian) {
		this.keyueshijian =  keyueshijian;
	}
	@JsonProperty("lianxidianhua")
	public String getLianxidianhua() {
		return lianxidianhua;
	}

	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua =  lianxidianhua;
	}
	@JsonProperty("changdixiangqing")
	public String getChangdixiangqing() {
		return changdixiangqing;
	}

	public void setChangdixiangqing(String changdixiangqing) {
		this.changdixiangqing =  changdixiangqing;
	}
	@JsonProperty("changditupian")
	public String getChangditupian() {
		return changditupian;
	}

	public void setChangditupian(String changditupian) {
		this.changditupian =  changditupian;
	}
	@JsonProperty("clicknum")
	public Integer getClicknum() {
		return clicknum;
	}

	public void setClicknum(Integer clicknum) {
		this.clicknum =  clicknum;
	}


	public Yundongchangdi(Long id,Date addtime,String changdibianhao,String changdimingcheng,String changdileixing,String weizhi,Integer zulindanjia,String keyueshijian,String lianxidianhua,String changdixiangqing,String changditupian,Integer clicknum) {
		
		this.id = id;
		
		this.addtime = addtime;
		
		this.changdibianhao = changdibianhao;
		
		this.changdimingcheng = changdimingcheng;
		
		this.changdileixing = changdileixing;
		
		this.weizhi = weizhi;
		
		this.zulindanjia = zulindanjia;
		
		this.keyueshijian = keyueshijian;
		
		this.lianxidianhua = lianxidianhua;
		
		this.changdixiangqing = changdixiangqing;
		
		this.changditupian = changditupian;
		
		this.clicknum = clicknum;
		
	}

	public Yundongchangdi() {
	    super();
	}

	public String dateToStringConvert(Date date) {
		if(date!=null) {
			return DateUtil.format(date, "yyyy-MM-dd HH:mm:ss");
		}
		return "";
	}
	

}