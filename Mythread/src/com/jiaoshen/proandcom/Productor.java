package com.jiaoshen.proandcom;

public class Productor extends Thread {
	private ProductService productService;
	public Productor(ProductService productService) {
		this.productService=productService;
	}
	@Override
	public void run() {
		for (int i = 0; i <10; i++) {
			productService.addpro();
		}
	}
}
