package com.fundservice.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="percentages_table")
public class Percentage {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "percentage_sequence")
	@SequenceGenerator(name = "percentage_sequence", sequenceName = "percentage_sequence", allocationSize = 1)
	private int percId;
	private int mutualfundId;
	private int stockId;
	private double percentage;

	public Percentage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Percentage(int percId, int mutualfundId, int stockId, double percentage) {
		super();
		this.percId = percId;
		this.mutualfundId = mutualfundId;
		this.stockId = stockId;
		this.percentage = percentage;
	}

	public Percentage(int mutualfundId, int stockId, double percentage) {
		super();
		this.mutualfundId = mutualfundId;
		this.stockId = stockId;
		this.percentage = percentage;
	}

	public int getPercId() {
		return percId;
	}

	public void setPercId(int percId) {
		this.percId = percId;
	}

	public int getMutualfundId() {
		return mutualfundId;
	}

	public void setMutualfundId(int mutualfundId) {
		this.mutualfundId = mutualfundId;
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
