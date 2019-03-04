package com.jiaoshen.factory.factorypattern;

import com.jiaoshen.factory.bean.GreenTea;
import com.jiaoshen.factory.bean.Tea;

public class Test {
	public static void main(String[] args) {
	GreenTeaFactory gFactory = new GreenTeaFactory();
	RedTeaFactory rFactory = new RedTeaFactory();
	Tea t1=gFactory.createTea();
	Tea t2=rFactory.createTea();
	
	}

}
