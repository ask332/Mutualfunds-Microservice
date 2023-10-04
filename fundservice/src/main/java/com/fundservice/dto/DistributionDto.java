package com.fundservice.dto;

import java.util.List;

public class DistributionDto {
	private List<PercentageDto> percentages;

	public DistributionDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DistributionDto(List<PercentageDto> percentages) {
		super();
		this.percentages = percentages;
	}

	public List<PercentageDto> getPercentages() {
		return percentages;
	}

	public void setPercentages(List<PercentageDto> percentages) {
		this.percentages = percentages;
	}
	
}
