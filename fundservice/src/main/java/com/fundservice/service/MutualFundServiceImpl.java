package com.fundservice.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fundservice.dto.MutualFundDto;
import com.fundservice.entities.MutualFund;
import com.fundservice.exceptions.MutualFundNotFoundException;
import com.fundservice.repo.MutualFundDao;
@Service
@Transactional
public class MutualFundServiceImpl implements MutualFundService {
	@Autowired
	private MutualFundDao mutualfundDao;

	@Override
	public List<MutualFund> getAll() {
		return mutualfundDao.findAll();
	}

	@Override
	public MutualFund getById(int id) throws MutualFundNotFoundException {
		MutualFund mutualfund = mutualfundDao.findById(id)
				.orElseThrow(() -> new MutualFundNotFoundException("Mutual fund not found!!"));
		return mutualfund;
	}

	@Override
	public String addMutualFund(MutualFund mutualfund) {
		mutualfundDao.save(mutualfund);
		return mutualfund.getMutualfundName() + " added with id: " + mutualfund.getMutualfundId();
	}

	@Override
	public String updateMutualFund(MutualFundDto mutualfundDto, int id) {
		try {
			MutualFund mutualfundToUpdate = mutualfundDao.findById(id)
					.orElseThrow(() -> new MutualFundNotFoundException("Mutual Fund not found with id: " + id));
			mutualfundToUpdate.setMutualfundName(mutualfundDto.getMutualfundName());
			mutualfundToUpdate.setNav(mutualfundDto.getNav());
			mutualfundToUpdate.setEntryLoad(mutualfundDto.getEntryLoad());
			mutualfundToUpdate.setExitload(mutualfundDto.getExitload());
			mutualfundToUpdate.setExpenseRatio(mutualfundDto.getExpenseRatio());
			return "Mutual Fund with id: " + id + " updated";
		} catch (MutualFundNotFoundException ex) {
			return "Stock with id: "+id+" doesn't exist!";  
		}
	}

	@Override
	public String deleteMutualFund(int id) {
		mutualfundDao.deleteById(id);
		return "Mutual Fund with id: "+id+"deleted successfully!";
	}

}
