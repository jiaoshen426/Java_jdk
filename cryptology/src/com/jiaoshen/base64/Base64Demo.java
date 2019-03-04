package com.jiaoshen.base64;

import sun.misc.BASE64Encoder;

public class Base64Demo {
    public static void  changeBase(String str){
    	BASE64Encoder encoder = new BASE64Encoder();
    	String result=encoder.encode(str.getBytes());
    	System.out.println("加密后"+result);
    	
    	
    }
	
	
	
	public static void main(String[] args) {
		changeBase("bc  csd");
		changeBase("abccsd");
	}

}
