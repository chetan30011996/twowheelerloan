package com.cjc.app.tl.ledger.main.serviceI;

import java.util.List;

import com.cjc.app.tl.ledger.main.model.Ledger;
import com.cjc.app.tl.ledger.main.model.LedgerUpdate;

public interface LedgerServiceI {

	public String addLedgerData(int caseNo);
	public List<Ledger> getAllLedgerData();
	public Ledger getLedgerById(int ledgerId);
	
	
	public String addLedgerUpdateData(LedgerUpdate lu);
	public List<LedgerUpdate> getAllLedgerUpdate();
	public List<LedgerUpdate> getAllLedgerUpdateByCaseNo(int caseNo);
}
