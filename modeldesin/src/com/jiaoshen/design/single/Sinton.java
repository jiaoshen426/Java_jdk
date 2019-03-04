package com.jiaoshen.design.single;

/**
 * 饿汉单例模式
 * @author jiaoshen
 * @date   2018年3月7日
 */

public class Sinton {
    private Sinton(){
    
    };
    private static Sinton instance=new Sinton();
    public Sinton getSinton(){
    	return instance;
    }
    public static void main(String[] args) {
    	new Sinton().getSinton();
	}
}
