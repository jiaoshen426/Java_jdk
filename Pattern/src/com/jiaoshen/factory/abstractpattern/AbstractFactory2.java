package com.jiaoshen.factory.abstractpattern;

import com.jiaoshen.factory.bean.Coffe;
import com.jiaoshen.factory.bean.Tea;

public interface AbstractFactory2 {
	public Tea createTea();
	
	public Coffe createCoffe();

}
