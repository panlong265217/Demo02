package com.tc25.bean;

import java.util.Date;

//ʵ����:�����¼
public class LendRecord {
	private int lrId;//����:�����¼ID
	private String lrNumber;//����:�����¼����AA+4�������+dvdId
	private int dvdId;//����:DVD��ID
	private int dvdName;//����:DVD����
	private Date lendDate;//����:���ʱ��(Ĭ���Դ�������Ȼ����)
	private Date returnDate;//����:�黹ʱ��
	private int userId;//����:����û�ID
	private boolean lrStatus;//����:�����¼��״̬,��ǰ���ŵ��ݵ�״̬
	//�ṩget��set����
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
	//�ṩ�вκ��޲ι���
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
	//�ṩtoString����
	@Override
	public String toString() {
		return "LendRecord [lrId=" + lrId + ", lrNumber=" + lrNumber + ", dvdId=" + dvdId + ", dvdName=" + dvdName
				+ ", lendDate=" + lendDate + ", returnDate=" + returnDate + ", userId=" + userId + ", lrStatus="
				+ lrStatus + "]";
	}
	
	
	
	
}
