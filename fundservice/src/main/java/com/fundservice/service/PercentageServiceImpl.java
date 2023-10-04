package com.fundservice.service;

import java.util.Iterator;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fundservice.dto.DistributionDto;
import com.fundservice.dto.PercentageDto;
import com.fundservice.entities.MutualFund;
import com.fundservice.entities.Percentage;
import com.fundservice.exceptions.IncorrectDistributionException;
import com.fundservice.exceptions.MutualFundNotFoundException;
import com.fundservice.repo.MutualFundDao;
import com.fundservice.repo.PercentageDao;

@Service
@Transactional
public class PercentageServiceImpl implements PercentageService {

	private PercentageDao percentageDao;
	private MutualFundDao mutualfundDao;

	@Autowired
	public PercentageServiceImpl(PercentageDao percentageDao, MutualFundDao mutualfundDao) {
		super();
		this.percentageDao = percentageDao;
		this.mutualfundDao = mutualfundDao;
	}

	@Override
	public List<Percentage> getByMutualFundId(int id) {
		return percentageDao.getByMutualfundId(id);
	}

	@Override
	public String addPercentages(DistributionDto distribution, int mutualFundId) {
		try {
			MutualFund mutualfund = mutualfundDao.findById(mutualFundId)
					.orElseThrow(() -> new MutualFundNotFoundException("MutualFund doesn't exist"));
			double sum = 0;
			List<PercentageDto> percentages = distribution.getPercentages();
			Iterator<PercentageDto> i = percentages.iterator();
			while (i.hasNext()) {
				PercentageDto perc = i.next();
				sum += perc.getPercentage();
			}
			if (sum != 100.00)
				throw new IncorrectDistributionException("Incorrect Distribution of Percentages!!");
			percentages.forEach((percentage) -> percentageDao
					.save(new Percentage(mutualFundId, percentage.getStockId(), percentage.getPercentage())));
			return "Percentages added successfully";
		} catch (MutualFundNotFoundException mfEx) {
			return "Mutual Fund with id: " + mutualFundId + " not found!!";
		} catch (IncorrectDistributionException mfEx) {
			return "Incorrect Distribution of Percentages! Check again";
		}
	}

	@Override
	public String deletePercentages(int id) {
		percentageDao.deleteAll(percentageDao.getByMutualfundId(id));
		return "Percentage Distribution for mutual fund with id: " + id + " deleted!";
	}

}
