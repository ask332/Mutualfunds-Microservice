package com.stockservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stockservice.dto.StockDto;
import com.stockservice.entities.Stock;
import com.stockservice.exceptions.StockNotFoundException;
import com.stockservice.services.StockService;

@RestController
@RequestMapping(path = "stocks")
public class StockController {

	@Autowired
	private StockService stockService;

	@GetMapping(path = "/")
	public List<Stock> getAll() {
		return stockService.getAll();
	}

	@GetMapping(path = "{id}")
	public Stock getById(@PathVariable(name = "id") int id) throws StockNotFoundException {
		return stockService.getById(id);
	}

	@PostMapping(path = "/")
	public String addStock(@RequestBody Stock stock) {
		return stockService.addStock(stock);
	}

	@PutMapping(path = "{id}")
	public String updateStock(@RequestBody StockDto stockDto, @PathVariable(name = "id") int id){
		return stockService.updateStock(stockDto, id);
	}
	
	@DeleteMapping(path="{id}")
	public String deleteStock(@PathVariable(name="id") int id) {
		return stockService.deleteStock(id);
	}
}
