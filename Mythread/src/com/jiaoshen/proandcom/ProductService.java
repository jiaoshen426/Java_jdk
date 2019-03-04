package com.jiaoshen.proandcom;

public class ProductService {
	Integer proNum=0;
    public void addpro() {
		proNum++;
		System.out.println("生产了一个玩具，玩具总量为"+proNum);
	}	
    public void redupro() {
		proNum--;
		System.out.println("消费了一个玩具，玩具总量为"+proNum);
	}	
}
