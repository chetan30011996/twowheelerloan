package com.cjc.app.tl.disbursement.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Sanction {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int loanId;
	private int customerId;
	private String customerDetailName;
	private long customerDetailMobile;
	private String customerDetailAddress;
	private String vehicleDetailMake;
	private String vehicleDetailModel;
	private String vehicleDetailColor;
	private Double loanDetailLoanAmount;
	private float loanDetailRoi;
	private int loanDetailTenure;
	private double loanDetailProcessingCharge;
	private double loanDetailMonthlyEmi;
	private double loanDetailPayToBank;
	private String remark;
	private int generatedBy;
	private String generatedDate;
	private String uploadedDocument;
	private String uploadedDocumentDate;
	
	private String statusDesc;

	public String getStatusDesc() {
		return statusDesc;
	}

	public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
	}

	public int getLoanId() {
		return loanId;
	}

	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerDetailName() {
		return customerDetailName;
	}

	public void setCustomerDetailName(String customerDetailName) {
		this.customerDetailName = customerDetailName;
	}

	public long getCustomerDetailMobile() {
		return customerDetailMobile;
	}

	public void setCustomerDetailMobile(long customerDetailMobile) {
		this.customerDetailMobile = customerDetailMobile;
	}

	public String getCustomerDetailAddress() {
		return customerDetailAddress;
	}

	public void setCustomerDetailAddress(String customerDetailAddress) {
		this.customerDetailAddress = customerDetailAddress;
	}

	public String getVehicleDetailMake() {
		return vehicleDetailMake;
	}

	public void setVehicleDetailMake(String vehicleDetailMake) {
		this.vehicleDetailMake = vehicleDetailMake;
	}

	public String getVehicleDetailModel() {
		return vehicleDetailModel;
	}

	public void setVehicleDetailModel(String vehicleDetailModel) {
		this.vehicleDetailModel = vehicleDetailModel;
	}

	public String getVehicleDetailColor() {
		return vehicleDetailColor;
	}

	public void setVehicleDetailColor(String vehicleDetailColor) {
		this.vehicleDetailColor = vehicleDetailColor;
	}

	public Double getLoanDetailLoanAmount() {
		return loanDetailLoanAmount;
	}

	public void setLoanDetailLoanAmount(Double loanDetailLoanAmount) {
		this.loanDetailLoanAmount = loanDetailLoanAmount;
	}

	public float getLoanDetailRoi() {
		return loanDetailRoi;
	}

	public void setLoanDetailRoi(float loanDetailRoi) {
		this.loanDetailRoi = loanDetailRoi;
	}

	public int getLoanDetailTenure() {
		return loanDetailTenure;
	}

	public void setLoanDetailTenure(int loanDetailTenure) {
		this.loanDetailTenure = loanDetailTenure;
	}

	public double getLoanDetailProcessingCharge() {
		return loanDetailProcessingCharge;
	}

	public void setLoanDetailProcessingCharge(double loanDetailProcessingCharge) {
		this.loanDetailProcessingCharge = loanDetailProcessingCharge;
	}

	public double getLoanDetailMonthlyEmi() {
		return loanDetailMonthlyEmi;
	}

	public void setLoanDetailMonthlyEmi(double loanDetailMonthlyEmi) {
		this.loanDetailMonthlyEmi = loanDetailMonthlyEmi;
	}


	public double getLoanDetailPayToBank() {
		return loanDetailPayToBank;
	}

	public void setLoanDetailPayToBank(double loanDetailPayToBank) {
		this.loanDetailPayToBank = loanDetailPayToBank;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public int getGeneratedBy() {
		return generatedBy;
	}

	public void setGeneratedBy(int generatedBy) {
		this.generatedBy = generatedBy;
	}

	public String getGeneratedDate() {
		return generatedDate;
	}

	public void setGeneratedDate(String generatedDate) {
		this.generatedDate = generatedDate;
	}

	public String getUploadedDocument() {
		return uploadedDocument;
	}

	public void setUploadedDocument(String uploadedDocument) {
		this.uploadedDocument = uploadedDocument;
	}

	public String getUploadedDocumentDate() {
		return uploadedDocumentDate;
	}

	public void setUploadedDocumentDate(String uploadedDocumentDate) {
		this.uploadedDocumentDate = uploadedDocumentDate;
	}

	
}
