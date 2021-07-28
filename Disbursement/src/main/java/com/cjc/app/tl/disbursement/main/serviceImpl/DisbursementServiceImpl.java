package com.cjc.app.tl.disbursement.main.serviceImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cjc.app.tl.disbursement.main.model.Disbursement;
import com.cjc.app.tl.disbursement.main.model.Sanction;
import com.cjc.app.tl.disbursement.main.repository.DisbursementRepository;
import com.cjc.app.tl.disbursement.main.repository.SanctionRepository;
import com.cjc.app.tl.disbursement.main.serviceI.DisbursementServiceI;
@Service
public class DisbursementServiceImpl implements DisbursementServiceI{

	@Autowired
	SanctionRepository sr;
	
	@Autowired
	DisbursementRepository dr;
	
	@Autowired
	RestTemplate rt;
	
	@Override
	public String saveSanctionData(Sanction s) {
		sr.save(s);
		return "Data saved in sanction successfully";
	}

	@Override
	public List<Sanction> getAllSanctionData() {
		return sr.findAll();
	}

	@Override
	public Sanction getBySanctionId(int loanId) {
		
		return sr.findById(loanId).get();
	}

	@Override
	public String addDisburseData(Disbursement dis, int loanId) {
	
		List<Disbursement> dlist=dr.findAll();
		if(dlist==null) {
			dis.setCaseNo(1);
		}
		else
		{
			List<Integer> caseNolist=new ArrayList<Integer>();
			
			for(Disbursement disburse:dlist)
			{
				caseNolist.add(disburse.getCaseNo());
			}
			int y=Collections.max(caseNolist);
			dis.setCaseNo(y+1);
		}
		
		Disbursement d1=dr.getDisbursmentByLoanId(loanId);
		if(d1==null)
		{
		Sanction s=new Sanction();
		s=sr.getById(loanId);
		s.setStatusDesc("Disbursed");
		dis.setSac(s);
		dr.save(dis);
		return "Data inserted disbursement table successfully..";
		}
		else
		{
			return "Data Loan data already prsent";
		}
	}

	@Override
	public List<Disbursement> getAllDisburseData() {
		
		return dr.findAll();
	}

	@Override
	public Disbursement getDisburseById(int dispId) {
		
		return dr.findById(dispId).get();
	}

	@Override
	public Disbursement getDisburseByCaseNo(int caseNo) {
		
		return dr.getDisbursmentByCaseNo(caseNo);
	}
		

}
