package com.stockservice.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stockservice.dto.StockDto;
import com.stockservice.entities.Stock;
import com.stockservice.exceptions.StockNotFoundException;
import com.stockservice.repo.StockDao;

@Service
@Transactional
public class StockServiceImpl implements StockService {
	@Autowired
	private StockDao stockDao;

	@Override
	public List<Stock> getAll() {
		return stockDao.findAll();
	}

	@Override
	public Stock getById(int id) throws StockNotFoundException {
		Stock stock = stockDao.findById(id).orElseThrow(() -> new StockNotFoundException("Stock not found!!"));
		return stock;
	}

	@Override
	public String addStock(Stock stock) {
		stockDao.save(stock);
		return stock.getStockName() + " added with id: " + stock.getStockId();
	}

	@Override
	public String updateStock(StockDto stockDto, int id){
		try {
			Stock stockToUpdate = stockDao.findById(id)
					.orElseThrow(() -> new StockNotFoundException("Stock not found with id: " + id));
			stockToUpdate.setStockName(stockDto.getStockName());
			stockToUpdate.setStockPrice(stockDto.getStockPrice());
			return "Stock with id: " + id + "updated successfully!";
		}
		catch(StockNotFoundException ex) {
			return "Stock with id: "+id+" doesn't exist!";  
		}
	}

	@Override
	public String deleteStock(int id) {
		stockDao.deleteById(id);
		return "Stock with id: " + id + " deleted successfully!";
	}

}
