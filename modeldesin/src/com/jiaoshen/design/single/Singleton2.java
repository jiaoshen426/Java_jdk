package com.jiaoshen.design.single;

/**
 * 懒汉单例模式
 * @author jiaoshen
 * @date   2018年3月7日
 */
public class Singleton2 {
   private Singleton2(){};
    static private Singleton2 instance;
    public  Singleton2 getInstance(){
    	if(instance==null){
    		instance=new Singleton2();
    	}
    	return instance;
    }
}
