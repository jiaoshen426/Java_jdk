package com.jiaoshen.factory.factorypattern;

import com.jiaoshen.factory.bean.GreenTea;
import com.jiaoshen.factory.bean.Tea;

public class GreenTeaFactory implements AbstractFactory {

	@Override
	public Tea createTea() {
		
		return new GreenTea();
	}

}
