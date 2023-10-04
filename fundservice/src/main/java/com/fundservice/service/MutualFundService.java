package com.fundservice.service;

import java.util.List;

import com.fundservice.dto.MutualFundDto;
import com.fundservice.entities.MutualFund;
import com.fundservice.exceptions.MutualFundNotFoundException;

public interface MutualFundService {
	public List<MutualFund> getAll();

	public MutualFund getById(int id)throws MutualFundNotFoundException;

	public String addMutualFund(MutualFund mutualfund);

	public String updateMutualFund(MutualFundDto mutualfundDto, int mutualfundId);

	public String deleteMutualFund(int id);
}
