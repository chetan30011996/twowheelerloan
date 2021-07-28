package com.cjc.app.tl.disbursement.main.serviceI;

import java.util.List;

import com.cjc.app.tl.disbursement.main.model.Disbursement;
import com.cjc.app.tl.disbursement.main.model.Sanction;

public interface DisbursementServiceI {
	public String saveSanctionData(Sanction s);
	
	public List<Sanction> getAllSanctionData();
	
	public Sanction getBySanctionId(int loanId);
	
	
	public String addDisburseData(Disbursement dis, int loanId);
	
	public List<Disbursement> getAllDisburseData();
	
	public Disbursement getDisburseById(int dispId);
	
	public Disbursement getDisburseByCaseNo(int caseNo);
}
