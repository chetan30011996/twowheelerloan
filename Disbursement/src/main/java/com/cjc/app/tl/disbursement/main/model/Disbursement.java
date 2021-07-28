package com.cjc.app.tl.disbursement.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Disbursement {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int disbId;
	private String dealerName;
	private String dealerBankName;
	private String dealerIFSCCode;
	private long dealerBankAccNo;
	private String dealerAccountType;
	private double payAmountToDealer;
	private String paymentMode;
	private String payAmountToDealerDate;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="loanId")
	private Sanction sac;
	
	
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int caseNo;
	
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	public Sanction getSac() {
		return sac;
	}
	public void setSac(Sanction sac) {
		this.sac = sac;
	}
	public int getDisbId() {
		return disbId;
	}
	public void setDisbId(int disbId) {
		this.disbId = disbId;
	}
	public String getDealerName() {
		return dealerName;
	}
	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
	}
	public String getDealerBankName() {
		return dealerBankName;
	}
	public void setDealerBankName(String dealerBankName) {
		this.dealerBankName = dealerBankName;
	}
	public String getDealerIFSCCode() {
		return dealerIFSCCode;
	}
	public void setDealerIFSCCode(String dealerIFSCCode) {
		this.dealerIFSCCode = dealerIFSCCode;
	}
	public long getDealerBankAccNo() {
		return dealerBankAccNo;
	}
	public void setDealerBankAccNo(long dealerBankAccNo) {
		this.dealerBankAccNo = dealerBankAccNo;
	}
	public String getDealerAccountType() {
		return dealerAccountType;
	}
	public void setDealerAccountType(String dealerAccountType) {
		this.dealerAccountType = dealerAccountType;
	}
	public double getPayAmountToDealer() {
		return payAmountToDealer;
	}
	public void setPayAmountToDealer(double payAmountToDealer) {
		this.payAmountToDealer = payAmountToDealer;
	}
	
	public String getPayAmountToDealerDate() {
		return payAmountToDealerDate;
	}
	public void setPayAmountToDealerDate(String payAmountToDealerDate) {
		this.payAmountToDealerDate = payAmountToDealerDate;
	}
	
	public int getCaseNo() {
		return caseNo;
	}
	public void setCaseNo(int caseNo) {
		this.caseNo = caseNo;
	}


}
