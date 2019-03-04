package com.jiaoshen.design.observe;

public class TestObserve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Isubject isu=new Isubject();
        Iobserve i1=new Iobserve();
        Iobserve i2= new Iobserve();
        i1.setName("jiaoshen");
        i2.setName("laoshen");
        isu.addObserve(i1);
        isu.addObserve(i2);
        isu.setWeather("œ¬”Í¡À");
	}

}
