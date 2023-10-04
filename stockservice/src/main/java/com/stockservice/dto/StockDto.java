package com.stockservice.dto;

public class StockDto {
	private String stockName;
	private double stockPrice;

	public StockDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StockDto(String stockName, Double stockPrice) {
		super();
		this.stockName = stockName;
		this.stockPrice = stockPrice;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public double getStockPrice() {
		return stockPrice;
	}

	public void setStockPrice(double stockPrice) {
		this.stockPrice = stockPrice;
	}

}
