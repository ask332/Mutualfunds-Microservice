package com.fundservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fundservice.entities.MutualFund;

@Repository
public interface MutualFundDao extends JpaRepository<MutualFund, Integer> {

}
