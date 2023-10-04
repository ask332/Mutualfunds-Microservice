package com.fundservice.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "mutualfunds_table")
public class MutualFund {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "fund_sequence")
	@SequenceGenerator(name = "fund_sequence", sequenceName = "fund_sequence", allocationSize = 1)
	private int mutualfundId;
	private String mutualfundName;
	private double nav;
	private double entryLoad;
	private double exitload;
	private double expenseRatio;

	public MutualFund() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MutualFund(int mutualfundId, String mutualfundName, double nav, double entryLoad, double exitload,
			double expenseRatio) {
		super();
		this.mutualfundId = mutualfundId;
		this.mutualfundName = mutualfundName;
		this.nav = nav;
		this.entryLoad = entryLoad;
		this.exitload = exitload;
		this.expenseRatio = expenseRatio;
	}

	public MutualFund(String mutualfundName, double nav, double entryLoad, double exitload, double expenseRatio) {
		super();
		this.mutualfundName = mutualfundName;
		this.nav = nav;
		this.entryLoad = entryLoad;
		this.exitload = exitload;
		this.expenseRatio = expenseRatio;
	}

	public int getMutualfundId() {
		return mutualfundId;
	}

	public void setMutualfundId(int mutualfundId) {
		this.mutualfundId = mutualfundId;
	}

	public String getMutualfundName() {
		return mutualfundName;
	}

	public void setMutualfundName(String mutualfundName) {
		this.mutualfundName = mutualfundName;
	}

	public double getNav() {
		return nav;
	}

	public void setNav(double nav) {
		this.nav = nav;
	}

	public double getEntryLoad() {
		return entryLoad;
	}

	public void setEntryLoad(double entryLoad) {
		this.entryLoad = entryLoad;
	}

	public double getExitload() {
		return exitload;
	}

	public void setExitload(double exitload) {
		this.exitload = exitload;
	}

	public double getExpenseRatio() {
		return expenseRatio;
	}

	public void setExpenseRatio(double expenseRatio) {
		this.expenseRatio = expenseRatio;
	}

}
