package com.fundservice.dto;

public class PercentageDto {
	private int stockId;
	private double percentage;
	
	public PercentageDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PercentageDto(int stockId, double percentage) {
		super();
		this.stockId = stockId;
		this.percentage = percentage;
	}

	public int getStockId() {
		return stockId;
	}

	public void setStockId(int stockId) {
		this.stockId = stockId;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

}
