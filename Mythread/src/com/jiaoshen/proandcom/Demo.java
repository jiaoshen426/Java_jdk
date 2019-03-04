package com.jiaoshen.proandcom;

public class Demo {
	public static void main(String[] args) {
		ProductService p1=new ProductService();
		Productor p2=new Productor(p1);
		p2.start();
	    Comsumer c1=new Comsumer(p1);
	    c1.start();
	}
	
	

}
