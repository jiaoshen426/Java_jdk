package com.jiaoshen.factory.abstractpattern;

import com.jiaoshen.factory.bean.BlackCoffe;
import com.jiaoshen.factory.bean.Coffe;
import com.jiaoshen.factory.bean.RedTea;
import com.jiaoshen.factory.bean.Tea;
import com.jiaoshen.factory.factorypattern.AbstractFactory;

public class Factory2 implements AbstractFactory2 {

	@Override
	public Tea createTea() {
		return new RedTea();
	}

	@Override
	public Coffe createCoffe() {
		return new BlackCoffe();
	}

}
