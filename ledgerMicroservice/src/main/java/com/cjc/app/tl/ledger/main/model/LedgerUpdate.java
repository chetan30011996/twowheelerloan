package com.cjc.app.tl.ledger.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LedgerUpdate {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ledgerUpdateId;
	private int caseNo;
	private double emiAmount;
	private String emiPaidDate;
	private double totalAmountPaid;
	private double remainingAmount;
	public int getLedgerUpdateId() {
		return ledgerUpdateId;
	}
	public void setLedgerUpdateId(int ledgerUpdateId) {
		this.ledgerUpdateId = ledgerUpdateId;
	}
	public int getCaseNo() {
		return caseNo;
	}
	public void setCaseNo(int caseNo) {
		this.caseNo = caseNo;
	}
	public double getEmiAmount() {
		return emiAmount;
	}
	public void setEmiAmount(double emiAmount) {
		this.emiAmount = emiAmount;
	}
	public String getEmiPaidDate() {
		return emiPaidDate;
	}
	public void setEmiPaidDate(String emiPaidDate) {
		this.emiPaidDate = emiPaidDate;
	}
	public double getTotalAmountPaid() {
		return totalAmountPaid;
	}
	public void setTotalAmountPaid(double totalAmountPaid) {
		this.totalAmountPaid = totalAmountPaid;
	}
	public double getRemainingAmount() {
		return remainingAmount;
	}
	public void setRemainingAmount(double remainingAmount) {
		this.remainingAmount = remainingAmount;
	}

	
}
