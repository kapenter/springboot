package com.jackson.springboot.module;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 *
 * 用户表
 *
 */
@TableName(value = "t_user")
public class User implements Serializable {

	@TableField(exist = false)
	private static final long serialVersionUID = 1L;

	/**  */
	@TableId
	private Long id;

	/** 用户名 */
	private String username;

	/** 姓名 */
	private String realName;

	/** 邮箱 */
	private String email;

	/** 手机号码 */
	private String mobile;

	/** 密码 */
	private String pwd;

	/** 部门ID */
	private Long orgId;

	/** 商户编号 */
	private String merchantId;

	/** 帐号状态: 0: 无效1：有效 2：冻结 */
	private Integer accountState;

	/** 密码状态: 0: 需要修改 1: 正常使用 */
	private Integer pwdState;

	/** 状态 1： 有效 0 无效 */
	private Integer state;

	/**  */
	private Date createTime;

	/**  */
	private Date modTime;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getRealName() {
		return this.realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPwd() {
		return this.pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public Long getOrgId() {
		return this.orgId;
	}

	public void setOrgId(Long orgId) {
		this.orgId = orgId;
	}

	public String getMerchantId() {
		return this.merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public Integer getAccountState() {
		return this.accountState;
	}

	public void setAccountState(Integer accountState) {
		this.accountState = accountState;
	}

	public Integer getPwdState() {
		return this.pwdState;
	}

	public void setPwdState(Integer pwdState) {
		this.pwdState = pwdState;
	}

	public Integer getState() {
		return this.state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getModTime() {
		return this.modTime;
	}

	public void setModTime(Date modTime) {
		this.modTime = modTime;
	}

}
