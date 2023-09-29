package com.stockservice.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "stocks_table")
public class Stock {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="stock_sequence")
	@SequenceGenerator(name="stock_sequence",sequenceName="stock_sequence", allocationSize=1)
	private int stockId;
	private String stockName;
	private double stockPrice;

	public Stock() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Stock(int stockId, String stockName, double stockPrice) {
		super();
		this.stockId = stockId;
		this.stockName = stockName;
		this.stockPrice = stockPrice;
	}

	public Stock(String stockName, double stockPrice) {
		super();
		this.stockName = stockName;
		this.stockPrice = stockPrice;
	}

	public int getStockId() {
		return stockId;
	}

	public void setStockId(int stockId) {
		this.stockId = stockId;
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
