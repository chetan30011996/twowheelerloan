package com.cjc.app.tl.ledger.main.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cjc.app.tl.ledger.main.model.LedgerUpdate;
@Repository
public interface LedgerUpdateRepository extends JpaRepository<LedgerUpdate, Integer>{

	@Query("from LedgerUpdate where case_no=:cs")
	public List<LedgerUpdate> getAllLedgerUpdateByCaseNo(@Param("cs")int caseNo);
}
