package com.reisen.model.auto;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import cn.hutool.core.date.DateUtil;
import java.util.Date;

public class Changdiyuyue implements Serializable {
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
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	@ApiModelProperty(value = "预约时间")
	private Date yuyueshijian;
	
	@ApiModelProperty(value = "租赁单价")
	private Integer zulindanjia;
	
	@ApiModelProperty(value = "租用时长")
	private Integer zuyongshizhang;
	
	@ApiModelProperty(value = "费用")
	private Integer feiyong;
	
	@ApiModelProperty(value = "联系电话")
	private String lianxidianhua;
	
	@ApiModelProperty(value = "账号")
	private String zhanghao;
	
	@ApiModelProperty(value = "姓名")
	private String xingming;
	
	@ApiModelProperty(value = "手机")
	private String shouji;
	
	@ApiModelProperty(value = "身份证")
	private String shenfenzheng;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	@ApiModelProperty(value = "登记时间")
	private Date dengjishijian;
	
	@ApiModelProperty(value = "状态")
	private String zhuangtai;
	
	@ApiModelProperty(value = "是否支付")
	private String ispay;
	
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
	@JsonProperty("yuyueshijian")
	public Date getYuyueshijian() {
		return yuyueshijian;
	}

	public void setYuyueshijian(Date yuyueshijian) {
		this.yuyueshijian =  yuyueshijian;
	}
	@JsonProperty("zulindanjia")
	public Integer getZulindanjia() {
		return zulindanjia;
	}

	public void setZulindanjia(Integer zulindanjia) {
		this.zulindanjia =  zulindanjia;
	}
	@JsonProperty("zuyongshizhang")
	public Integer getZuyongshizhang() {
		return zuyongshizhang;
	}

	public void setZuyongshizhang(Integer zuyongshizhang) {
		this.zuyongshizhang =  zuyongshizhang;
	}
	@JsonProperty("feiyong")
	public Integer getFeiyong() {
		return feiyong;
	}

	public void setFeiyong(Integer feiyong) {
		this.feiyong =  feiyong;
	}
	@JsonProperty("lianxidianhua")
	public String getLianxidianhua() {
		return lianxidianhua;
	}

	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua =  lianxidianhua;
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
	@JsonProperty("shenfenzheng")
	public String getShenfenzheng() {
		return shenfenzheng;
	}

	public void setShenfenzheng(String shenfenzheng) {
		this.shenfenzheng =  shenfenzheng;
	}
	@JsonProperty("dengjishijian")
	public Date getDengjishijian() {
		return dengjishijian;
	}

	public void setDengjishijian(Date dengjishijian) {
		this.dengjishijian =  dengjishijian;
	}
	@JsonProperty("zhuangtai")
	public String getZhuangtai() {
		return zhuangtai;
	}

	public void setZhuangtai(String zhuangtai) {
		this.zhuangtai =  zhuangtai;
	}
	@JsonProperty("ispay")
	public String getIspay() {
		return ispay;
	}

	public void setIspay(String ispay) {
		this.ispay =  ispay;
	}


	public Changdiyuyue(Long id,Date addtime,String changdibianhao,String changdimingcheng,String changdileixing,String weizhi,Date yuyueshijian,Integer zulindanjia,Integer zuyongshizhang,Integer feiyong,String lianxidianhua,String zhanghao,String xingming,String shouji,String shenfenzheng,Date dengjishijian,String zhuangtai,String ispay) {
		
		this.id = id;
		
		this.addtime = addtime;
		
		this.changdibianhao = changdibianhao;
		
		this.changdimingcheng = changdimingcheng;
		
		this.changdileixing = changdileixing;
		
		this.weizhi = weizhi;
		
		this.yuyueshijian = yuyueshijian;
		
		this.zulindanjia = zulindanjia;
		
		this.zuyongshizhang = zuyongshizhang;
		
		this.feiyong = feiyong;
		
		this.lianxidianhua = lianxidianhua;
		
		this.zhanghao = zhanghao;
		
		this.xingming = xingming;
		
		this.shouji = shouji;
		
		this.shenfenzheng = shenfenzheng;
		
		this.dengjishijian = dengjishijian;
		
		this.zhuangtai = zhuangtai;
		
		this.ispay = ispay;
		
	}

	public Changdiyuyue() {
	    super();
	}

	public String dateToStringConvert(Date date) {
		if(date!=null) {
			return DateUtil.format(date, "yyyy-MM-dd HH:mm:ss");
		}
		return "";
	}
	

}