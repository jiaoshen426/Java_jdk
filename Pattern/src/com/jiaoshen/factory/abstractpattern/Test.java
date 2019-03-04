package com.jiaoshen.factory.abstractpattern;
/**
 * 抽象工厂模式 把工厂和产品都抽象化，一个工厂对于多个产品
 * @author jiaoshen
 *
 */
public class Test {
	public static void main(String[] args) {
		AbstractFactory2 f1 = new Factory1();
		AbstractFactory2 f2 = new Factory2();
		
		f1.createCoffe().Info();
		f1.createTea().info();
		
		f2.createCoffe().Info();
		f2.createTea().info();
				
	}

}
