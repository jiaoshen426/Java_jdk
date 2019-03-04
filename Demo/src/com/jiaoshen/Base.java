package com.jiaoshen;

public class Base {
       int count=2;
       final String aString;
       {
    	   aString="asd";
       }
       public void display(){
    	   System.out.println(this.count);
       }
       public  void fn() {
    	   System.out.println("我是父方法");
		
	}
       private  final void fn2(){
    	   System.out.println("我是fn2");
       }
}
