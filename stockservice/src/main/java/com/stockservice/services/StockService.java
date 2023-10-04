package com.stockservice.services;

import java.util.List;

import com.stockservice.dto.StockDto;
import com.stockservice.entities.Stock;
import com.stockservice.exceptions.StockNotFoundException;

public interface StockService {
	public List<Stock> getAll();

	public Stock getById(int id)throws StockNotFoundException;

	public String addStock(Stock stock);

	public String updateStock(StockDto stockDto, int id);

	public String deleteStock(int id);
}
