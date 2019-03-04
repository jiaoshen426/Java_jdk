package com.jiaoshen.factory.factorypattern;

import com.jiaoshen.factory.bean.RedTea;
import com.jiaoshen.factory.bean.Tea;

public class RedTeaFactory implements AbstractFactory {

	@Override
	public Tea createTea() {
		return new RedTea();
	}

}
