package com.reisen.model.auto;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import cn.hutool.core.date.DateUtil;
import java.util.Date;

public class Discussyundongchangdi implements Serializable {
    private static final long serialVersionUID = 1L;

	
	@ApiModelProperty(value = "主键")
	private Long id;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	@ApiModelProperty(value = "创建时间")
	private Date addtime;
	
	@ApiModelProperty(value = "关联表id")
	private Long refid;
	
	@ApiModelProperty(value = "用户id")
	private Long userid;
	
	@ApiModelProperty(value = "用户名")
	private String nickname;
	
	@ApiModelProperty(value = "评论内容")
	private String content;
	
	@ApiModelProperty(value = "回复内容")
	private String reply;
	
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
	@JsonProperty("refid")
	public Long getRefid() {
		return refid;
	}

	public void setRefid(Long refid) {
		this.refid =  refid;
	}
	@JsonProperty("userid")
	public Long getUserid() {
		return userid;
	}

	public void setUserid(Long userid) {
		this.userid =  userid;
	}
	@JsonProperty("nickname")
	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname =  nickname;
	}
	@JsonProperty("content")
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content =  content;
	}
	@JsonProperty("reply")
	public String getReply() {
		return reply;
	}

	public void setReply(String reply) {
		this.reply =  reply;
	}


	public Discussyundongchangdi(Long id,Date addtime,Long refid,Long userid,String nickname,String content,String reply) {
		
		this.id = id;
		
		this.addtime = addtime;
		
		this.refid = refid;
		
		this.userid = userid;
		
		this.nickname = nickname;
		
		this.content = content;
		
		this.reply = reply;
		
	}

	public Discussyundongchangdi() {
	    super();
	}

	public String dateToStringConvert(Date date) {
		if(date!=null) {
			return DateUtil.format(date, "yyyy-MM-dd HH:mm:ss");
		}
		return "";
	}
	

}