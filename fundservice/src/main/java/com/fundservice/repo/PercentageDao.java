package com.fundservice.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fundservice.entities.Percentage;

@Repository
public interface PercentageDao extends JpaRepository<Percentage, Integer> {
	public List<Percentage> getByMutualfundId(int id);
}
