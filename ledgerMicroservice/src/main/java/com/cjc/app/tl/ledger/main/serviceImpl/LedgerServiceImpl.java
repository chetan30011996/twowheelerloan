package com.cjc.app.tl.ledger.main.serviceImpl;

import java.util.List;

import org.apache.tomcat.util.json.JSONParser;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.function.ServerRequest.Headers;
import java.lang.*;
import com.cjc.app.tl.ledger.main.model.Ledger;
import com.cjc.app.tl.ledger.main.model.LedgerUpdate;
import com.cjc.app.tl.ledger.main.respository.LedgerRepository;
import com.cjc.app.tl.ledger.main.respository.LedgerUpdateRepository;
import com.cjc.app.tl.ledger.main.serviceI.LedgerServiceI;

@Service
public class LedgerServiceImpl implements LedgerServiceI{

	@Autowired
	LedgerRepository lr;
	
	@Autowired
	LedgerUpdateRepository lur;
	
	@Autowired
	RestTemplate rt;
	
	@Override
	public String addLedgerData(int caseNo) {
		Ledger l=new Ledger();
		String url="http://sai.mshome.net:8090/getdisbursebycaseno/"+caseNo;
		String s=rt.getForObject(url, String.class);
		//System.out.println(s);
		Object obj=JSONValue.parse(s);
		JSONObject jsonObject = (JSONObject)obj;
		 Object sac=(Object)jsonObject.get("sac");
		 JSONObject jsonob1=(JSONObject)sac;
		 
		 double amountPaidToBank1=(double)jsonob1.get("loanDetailPayToBank");
		 double emiAmount1=(double)jsonob1.get("loanDetailMonthlyEmi");
		 long tenure=(long)jsonob1.get("loanDetailTenure");
		 l.setEmiAmount(emiAmount1);
		 l.setAmountPaidToBank(amountPaidToBank1);
		 l.setCaseNo(caseNo);
		 l.setTenure(tenure);
		 l.setRemainingTenure(tenure);
		 l.setRemainingPaidAmount(amountPaidToBank1);
		lr.save(l);
		return "Data saved in Ledger table successfully";
	}

	@Override
	public List<Ledger> getAllLedgerData() {
		return lr.findAll();
	}

	@Override
	public Ledger getLedgerById(int ledgerId) {
		
		return lr.findById(ledgerId).get();
	}

	@Override
	public List<LedgerUpdate> getAllLedgerUpdateByCaseNo(int caseNo) {
		
		return lur.getAllLedgerUpdateByCaseNo(caseNo);
	}

	
	
	@Override
	public String addLedgerUpdateData(LedgerUpdate lu) {
		lur.save(lu);
		Ledger l=lr.getLedgerbyCaseNo(lu.getCaseNo());
		l.setLastEmiPaidDate(lu.getEmiPaidDate());
		l.setRemainingPaidAmount(lu.getRemainingAmount());
		l.setTotalPaidAmount(lu.getTotalAmountPaid());
		if(l.getRemainingTenure()==l.getTenure())
		{
			long remainTenure=l.getTenure()-1;
			l.setRemainingTenure(remainTenure);
		}
		else
		{
			long remainTenure=l.getRemainingTenure()-1;
			l.setRemainingTenure(remainTenure);
		}
		lr.save(l);
		return "Data inserted into LedgerUpdate.";
	}

	@Override
	public List<LedgerUpdate> getAllLedgerUpdate() {
		
		return lur.findAll();
	}

}
