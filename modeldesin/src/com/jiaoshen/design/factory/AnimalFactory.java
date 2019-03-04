package com.jiaoshen.design.factory;

/**
 * 
 * @author jiaoshen
 * @date   2018年3月7日
 */
public class AnimalFactory {
	public Animal getanmail(int i){
		if(i==1){
			return new Cat();
		}
		else if(i==2){
			return new Dog();
		}
		else{
			return null;
		}
	}

}
