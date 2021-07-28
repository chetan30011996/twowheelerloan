package com.cjc.app.tl.disbursement.main.controller;

import java.util.List;

import javax.ws.rs.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.app.tl.disbursement.main.model.Disbursement;
import com.cjc.app.tl.disbursement.main.model.Sanction;
import com.cjc.app.tl.disbursement.main.repository.DisbursementRepository;
import com.cjc.app.tl.disbursement.main.serviceImpl.DisbursementServiceImpl;
@CrossOrigin("*")
@RestController
public class DisbursementController {
	@Autowired
	DisbursementServiceImpl ds;
	
	@PostMapping("/addsanction")
	public String addSanction(@RequestBody Sanction s)
	{
		return ds.saveSanctionData(s);
	}
	
	@GetMapping("/getallsanction")
	public List<Sanction> getAllSanction()
	{
		return ds.getAllSanctionData();
	}
	
	@GetMapping("/getbysanctionid/{loanId}")
	public Sanction getBySanctionId(@PathVariable int loanId)
	{
		return ds.getBySanctionId(loanId);
	}
	
	
	@PostMapping("/adddisburse/{loanId}")
	public String addDisburseData(@PathVariable int loanId, @RequestBody Disbursement dis)
	{
		
		return ds.addDisburseData(dis, loanId);
	}
	
	@GetMapping("/getalldisburse")
	public List<Disbursement> getAllDisburseData()
	{
		return ds.getAllDisburseData();
	}
	
	@GetMapping("/getdisbursebyid/{dispId}")
	public Disbursement getDisburseById(@PathVariable int dispId)
	{
		return ds.getDisburseById(dispId);
	}
	
	@GetMapping("/getdisbursebycaseno/{caseNo}")
	public Disbursement getDisburseByCaseNo(@PathVariable int caseNo)
	{
		return ds.getDisburseByCaseNo(caseNo);
	}

}
