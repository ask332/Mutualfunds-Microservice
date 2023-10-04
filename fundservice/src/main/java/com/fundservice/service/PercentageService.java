package com.fundservice.service;

import java.util.List;

import com.fundservice.dto.DistributionDto;
import com.fundservice.entities.Percentage;

public interface PercentageService {
	public List<Percentage> getByMutualFundId(int id);

	public String addPercentages(DistributionDto distribution, int mutualFundId);
	
	public String deletePercentages(int id);
	
}
