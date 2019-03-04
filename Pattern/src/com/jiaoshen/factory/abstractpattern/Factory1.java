package com.jiaoshen.factory.abstractpattern;

import com.jiaoshen.factory.bean.Coffe;
import com.jiaoshen.factory.bean.GreenTea;
import com.jiaoshen.factory.bean.Tea;
import com.jiaoshen.factory.bean.WhiteCoffe;

public class Factory1 implements AbstractFactory2 {

	@Override
	public Tea createTea() {
		
		return new GreenTea();
	}

	@Override
	public Coffe createCoffe() {
		return new WhiteCoffe();
	}
	

}
