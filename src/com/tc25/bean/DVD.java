package com.tc25.bean;

import java.util.Date;

public class DVD {
	private String dvdName;//属性:DVD名称
	private int dvdID;//属性:DVD ID
	private Date dvdDate;//属性:DVD入库时间
	private int dvdStatus;//属性:DVD当前状态(1在库/2借出/3已删除)
	private int dvdLendCount;//属性:DVD借出次数(根据DVD名称统一显示)
	//所有属性提供get/set方法
	public String getDvdName(){
		return dvdName;
	}
	public void setDvdName(String dvdName){
		this.dvdName=dvdName;
	}
	public int getDvdID(){
		return dvdID;
	}
	public void setDvdID(int dvdID){
		this.dvdID=dvdID;
	}
	public Date getDvdDate(){
		return dvdDate;
	}
	public void setDvdDate(Date dvdDate){
		this.dvdDate=dvdDate;
	}
	public int getDvdStatus(){
		return dvdStatus;
	}
	public void setDvdStatus(int dvdStatus){
		this.dvdStatus=dvdStatus;
	}
	public int getDvdLendCount() {
		return dvdLendCount;
	}
	public void setDvdLendCount(int dvdLendCount) {
		this.dvdLendCount = dvdLendCount;
	}
	//提供有参和无参构造
	public DVD() {
		// TODO Auto-generated constructor stub
	}
	
	public DVD(String dvdName,Date dvdDate, int dvdStatus, int dvdLendCount) {
		super();
		this.dvdName = dvdName;
		this.dvdDate = dvdDate;
		this.dvdStatus = dvdStatus;
		this.dvdLendCount = dvdLendCount;
	}
	//提供toString方法,显示信息
	@Override
	public String toString() {
		return "DVD [dvdName=" + dvdName + ", dvdID=" + dvdID + ", dvdDate=" + dvdDate + ", dvdStatus=" + dvdStatus
				+ ", dvdLendCount=" + dvdLendCount + "]";
	}
	
	
	
	
	
	

}
