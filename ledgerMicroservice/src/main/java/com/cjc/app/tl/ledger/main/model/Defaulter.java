package com.cjc.app.tl.ledger.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Defaulter {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int defaulterId;
	
	private int caseNo;
	private String emiPaidDate;
	private String bucket;
	private String defaulterStatus;
	public int getDefaulterId() {
		return defaulterId;
	}
	public void setDefaulterId(int defaulterId) {
		this.defaulterId = defaulterId;
	}
	public int getCaseNo() {
		return caseNo;
	}
	public void setCaseNo(int caseNo) {
		this.caseNo = caseNo;
	}
	public String getEmiPaidDate() {
		return emiPaidDate;
	}
	public void setEmiPaidDate(String emiPaidDate) {
		this.emiPaidDate = emiPaidDate;
	}
	public String getBucket() {
		return bucket;
	}
	public void setBucket(String bucket) {
		this.bucket = bucket;
	}
	public String getDefaulterStatus() {
		return defaulterStatus;
	}
	public void setDefaulterStatus(String defaulterStatus) {
		this.defaulterStatus = defaulterStatus;
	}
	
	

}
