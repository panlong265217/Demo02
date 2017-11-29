package com.tc25.bean;

import java.io.Serializable;

public class User implements Serializable , Comparable<User> {
	private String userAccount;//属性;用户帐号
	private String userName;//属性:用户昵称
	private int userId;//属性:用户ID
	private String userPwd;//属性:用户密码
	private String userPwdTip;//属性:用户密码提示
	private Status userStatus;//属性:用户状态(正常|黑名单)
	//枚举,定义用户的状态   
	enum Status{
		STATUS_OK,
		STATUS_BLACK,
		STATUS_DEL;	
	} 
	//提供get和set方法
	public String getUserAccount() {
		return userAccount;
	}
	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getUserPwdTip() {
		return userPwdTip;
	}
	public void setUserPwdTip(String userPwdTip) {
		this.userPwdTip = userPwdTip;
	}
	public boolean isUserStatus() {
		return userStatus;
	}
	public void setUserStatus(boolean userStatus) {
		this.userStatus = userStatus;
	}
	//提供有参和无参构造
	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(String userAccount, String userName, String userPwd, String userPwdTip, boolean userStatus) {
		super();
		this.userAccount = userAccount;
		this.userName = userName;
		this.userPwd = userPwd;
		this.userPwdTip = userPwdTip;
		this.userStatus = userStatus;
	}
	//提供toString方法
	@Override
	public String toString() {
		return "User [userAccount=" + userAccount + ", userName=" + userName + ", userId=" + userId + ", userPwd="
				+ userPwd + ", userPwdTip=" + userPwdTip + ", userStatus=" + userStatus + "]";
	}
	
	
	

}
