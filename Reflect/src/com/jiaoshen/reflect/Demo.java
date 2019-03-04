package com.jiaoshen.reflect;

/**
 * class类是什么
 * @author 80505
 */
public class Demo {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// 任何一个类都是class的实例对象，有三种表示方式
		FOO foo1 = new FOO();

		Class m1 = FOO.class;

		Class m2 = foo1.getClass();

		Class m3 = Class.forName("com.jiaoshen.reflect.FOO");

		System.out.println("m1 == m3" + (m1 == m3));
		// m1,m2,m3 都被称为类类型 ，用过类类型可以创建类的实例

		FOO f2 = (FOO) m1.newInstance();
	}

}

class FOO {
}