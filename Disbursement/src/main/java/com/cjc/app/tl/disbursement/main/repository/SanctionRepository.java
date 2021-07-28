package com.cjc.app.tl.disbursement.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.app.tl.disbursement.main.model.Sanction;
@Repository
public interface SanctionRepository extends JpaRepository<Sanction, Integer>{

}
