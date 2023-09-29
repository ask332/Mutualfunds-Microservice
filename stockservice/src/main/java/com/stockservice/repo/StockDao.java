package com.stockservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stockservice.entities.Stock;

@Repository
public interface StockDao extends JpaRepository<Stock, Integer> {

}
