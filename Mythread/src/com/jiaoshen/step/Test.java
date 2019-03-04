package com.jiaoshen.step;

import sun.net.www.content.audio.basic;

public class Test {
	public static void main(String[] args) {
		Object lock=new Object();
		StepThread A =new StepThread(lock,"A",0);
		StepThread B =new StepThread(lock,"B",1);
		StepThread C =new StepThread(lock,"C",2);
		A.start();
		B.start();
		C.start();
	}

}
