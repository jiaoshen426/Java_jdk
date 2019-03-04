package com.jiaoshen.proandcom;

public class Comsumer extends Thread {
	private ProductService productService;
	public Comsumer(ProductService productService) {
		this.productService=productService;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			productService.redupro();
		}
	}

}
