package com.jiaoshen.pojo;

public class Transaction{

	private Trader trader;
	private Integer year;
	private Integer value;

	public Transaction(Trader trader, int year, int value)
	{
		this.trader = trader;
		this.year = year;
		this.value = value;
	}

	public Trader getTrader(){ 
		return this.trader;
	}

	public Integer getYear(){
		return this.year;
	}

	public Integer getValue(){
		return this.value;
	}
	
	@Override
	public String toString(){
	    return "{" + this.trader + ", " +
	           "year: "+this.year+", " +
	           "value:" + this.value +"}";
	}
}