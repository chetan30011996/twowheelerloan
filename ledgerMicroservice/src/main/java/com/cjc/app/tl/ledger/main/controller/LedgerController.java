package com.cjc.app.tl.ledger.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.app.tl.ledger.main.model.Ledger;
import com.cjc.app.tl.ledger.main.model.LedgerUpdate;
import com.cjc.app.tl.ledger.main.serviceI.LedgerServiceI;
@CrossOrigin("*")
@RestController
public class LedgerController {

	@Autowired
	LedgerServiceI ls;
	
	@PostMapping("/addledger/{caseNo}")
	public String addLedgerData(@PathVariable int caseNo)
	{
		System.out.println("Ledger added");
		return ls.addLedgerData(caseNo);
	}
	
	@GetMapping("/getallledger")
	public List<Ledger> getAllLedgerData()
	{
		return ls.getAllLedgerData();
	}
	
	@GetMapping("/getledgerbyid/{ledgerId}")
	public Ledger getLedgerById(@PathVariable int ledgerId)
	{
		return ls.getLedgerById(ledgerId);
	}
	
	
	@PostMapping("/addledgerupdate")
	public String addLedgerUpdate(@RequestBody LedgerUpdate lu)
	{
		return ls.addLedgerUpdateData(lu);
	}
	
	@GetMapping("/getallledgerupdate")
	public List<LedgerUpdate> getAllLedgerUpdateData()
	{
		return ls.getAllLedgerUpdate();
	}
	
	@GetMapping("/getledgerupdatebyid/{caseNo}")
	public List<LedgerUpdate> getLedgerUpdateByCaseNo(@PathVariable int caseNo)
	{
		return ls.getAllLedgerUpdateByCaseNo(caseNo);
	}
}
