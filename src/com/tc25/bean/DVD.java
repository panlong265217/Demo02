package com.tc25.bean;

import java.util.Date;

public class DVD {
	private String dvdName;//����:DVD����
	private int dvdID;//����:DVD ID
	private Date dvdDate;//����:DVD���ʱ��
	private int dvdStatus;//����:DVD��ǰ״̬(1�ڿ�/2���/3��ɾ��)
	private int dvdLendCount;//����:DVD�������(����DVD����ͳһ��ʾ)
	//���������ṩget/set����
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
	//�ṩ�вκ��޲ι���
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
	//�ṩtoString����,��ʾ��Ϣ
	@Override
	public String toString() {
		return "DVD [dvdName=" + dvdName + ", dvdID=" + dvdID + ", dvdDate=" + dvdDate + ", dvdStatus=" + dvdStatus
				+ ", dvdLendCount=" + dvdLendCount + "]";
	}
	
	
	
	
	
	

}
