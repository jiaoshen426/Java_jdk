package com.jiaoshen.lambda;

public class Test {
   static void getFruit(Fruit f){
	   f.show();
	   
   }
   public static void main(String[] args) {
	  getFruit(() -> {System.out.println("我是好人");});
}
}
