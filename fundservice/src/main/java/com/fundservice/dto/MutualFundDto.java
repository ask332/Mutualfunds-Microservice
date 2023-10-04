package com.fundservice.dto;

public class MutualFundDto {
	private String mutualfundName;
	private double nav;
	private double entryLoad;
	private double exitload;
	private double expenseRatio;

	public MutualFundDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MutualFundDto(String mutualfundName, double nav, double entryLoad, double exitload, double expenseRatio) {
		super();
		this.mutualfundName = mutualfundName;
		this.nav = nav;
		this.entryLoad = entryLoad;
		this.exitload = exitload;
		this.expenseRatio = expenseRatio;
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
