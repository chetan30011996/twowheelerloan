package com.cjc.app.tl.ledger.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ledger {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private int ledgerId;
	private int caseNo;
	private double amountPaidToBank;
	private double totalPaidAmount;
	private double remainingPaidAmount;
	//private String bucket;
	private double emiAmount;
	private String lastEmiPaidDate;
	private long tenure;
	private long remainingTenure;
	private int defaulterCount;
	
	
	public long getTenure() {
		return tenure;
	}
	public void setTenure(long tenure) {
		this.tenure = tenure;
	}
	public int getLedgerId() {
		return ledgerId;
	}
	public void setLedgerId(int ledgerId) {
		this.ledgerId = ledgerId;
	}
	public int getCaseNo() {
		return caseNo;
	}
	public void setCaseNo(int caseNo) {
		this.caseNo = caseNo;
	}
	public double getAmountPaidToBank() {
		return amountPaidToBank;
	}
	public void setAmountPaidToBank(double amountPaidToBank) {
		this.amountPaidToBank = amountPaidToBank;
	}
	public double getTotalPaidAmount() {
		return totalPaidAmount;
	}
	public void setTotalPaidAmount(double totalPaidAmount) {
		this.totalPaidAmount = totalPaidAmount;
	}
	public double getRemainingPaidAmount() {
		return remainingPaidAmount;
	}
	public void setRemainingPaidAmount(double remainingPaidAmount) {
		this.remainingPaidAmount = remainingPaidAmount;
	}
	/*public String getBucket() {
		return bucket;
	}
	public void setBucket(String bucket) {
		this.bucket = bucket;
	}*/
	public double getEmiAmount() {
		return emiAmount;
	}
	public void setEmiAmount(double emiAmount) {
		this.emiAmount = emiAmount;
	}
	public String getLastEmiPaidDate() {
		return lastEmiPaidDate;
	}
	public void setLastEmiPaidDate(String lastEmiPaidDate) {
		this.lastEmiPaidDate = lastEmiPaidDate;
	}
	
	public long getRemainingTenure() {
		return remainingTenure;
	}
	public void setRemainingTenure(long remainingTenure) {
		this.remainingTenure = remainingTenure;
	}
	public int getDefaulterCount() {
		return defaulterCount;
	}
	public void setDefaulterCount(int defaulterCount) {
		this.defaulterCount = defaulterCount;
	}
	
	

}
