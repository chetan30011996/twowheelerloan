package com.cjc.app.tl.disbursement.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cjc.app.tl.disbursement.main.model.Disbursement;
import com.cjc.app.tl.disbursement.main.model.Sanction;
@Repository
public interface DisbursementRepository extends JpaRepository<Disbursement, Integer>{

	@Query("from Disbursement where loan_id=:li")
	public Disbursement getDisbursmentByLoanId(@Param("li") int loanId);
	
	@Query("from Disbursement where case_no=:cn")
	public Disbursement getDisbursmentByCaseNo(@Param("cn") int caseNo);
}
