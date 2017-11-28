package com.tc25.bean;

import java.util.Date;

//实体类:借出记录
public class LendRecord {
	private int lrId;//属性:借出记录ID
	private String lrNumber;//属性:借出记录单号AA+4个随机数+dvdId
	private int dvdId;//属性:DVD的ID
	private int dvdName;//属性:DVD名称
	private Date lendDate;//属性:借出时间(默认以此项做自然排序)
	private Date returnDate;//属性:归还时间
	private int userId;//属性:借出用户ID
	private boolean lrStatus;//属性:借出记录的状态,当前这张单据的状态
	//提供get和set方法
	public int getLrId() {
		return lrId;
	}
	public void setLrId(int lrId) {
		this.lrId = lrId;
	}
	public String getLrNumber() {
		return lrNumber;
	}
	public void setLrNumber(String lrNumber) {
		this.lrNumber = lrNumber;
	}
	public int getDvdId() {
		return dvdId;
	}
	public void setDvdId(int dvdId) {
		this.dvdId = dvdId;
	}
	public int getDvdName() {
		return dvdName;
	}
	public void setDvdName(int dvdName) {
		this.dvdName = dvdName;
	}
	public Date getLendDate() {
		return lendDate;
	}
	public void setLendDate(Date lendDate) {
		this.lendDate = lendDate;
	}
	public Date getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public boolean isLrStatus() {
		return lrStatus;
	}
	public void setLrStatus(boolean lrStatus) {
		this.lrStatus = lrStatus;
	}
	//提供有参和无参构造
	public LendRecord() {
		// TODO Auto-generated constructor stub
	}
	public LendRecord( String lrNumber, int dvdName, Date lendDate, Date returnDate, int userId,
			boolean lrStatus) {
		super();
		this.lrNumber = lrNumber;
		this.dvdName = dvdName;
		this.lendDate = lendDate;
		this.returnDate = returnDate;
		this.userId = userId;
		this.lrStatus = lrStatus;
	}
	//提供toString方法
	@Override
	public String toString() {
		return "LendRecord [lrId=" + lrId + ", lrNumber=" + lrNumber + ", dvdId=" + dvdId + ", dvdName=" + dvdName
				+ ", lendDate=" + lendDate + ", returnDate=" + returnDate + ", userId=" + userId + ", lrStatus="
				+ lrStatus + "]";
	}
	
	
	
	
}
