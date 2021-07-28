package com.cjc.app.tl.ledger.main.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cjc.app.tl.ledger.main.model.Ledger;
@Repository
public interface LedgerRepository extends JpaRepository<Ledger, Integer>{

	@Query(value="from Ledger where case_no=:cno")
	public Ledger getLedgerbyCaseNo(@Param("cno")int caseNo);
}
