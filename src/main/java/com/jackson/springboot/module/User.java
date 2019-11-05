package com.jackson.springboot.module;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

/**
 *
 * 用户表
 *
 */
@TableName(value = "t_user")
@Data
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


}
