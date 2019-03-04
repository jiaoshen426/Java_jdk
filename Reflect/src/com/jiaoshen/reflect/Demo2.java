package com.jiaoshen.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/**
 * 通过类类型获取类的成员变量 方法 等信息
 * @author 80505
 *
 */

public class Demo2 {
	public static void main(String[] args) {
		Stu s1=new Stu("jiaoshen",12);
		try {
			getMethodInfo(s1);
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
    public static void getMethodInfo(Object obj) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
    	Class class1=obj.getClass();
    	/*打印类名*/
    	System.out.println("******打印类名*****");
    	System.out.println(class1.getName());
    	
    	/*打印方法名*/
    	System.out.println("******打印方法名*****");
    	Method[] mitems=class1.getDeclaredMethods();
    	for (Method m:mitems) {
		  System.out.println("返回类型:"+m.getReturnType()+"  方法名："+m.getName());	
		}
    	
    	/*打印成员变量*/
    	System.out.println("******打印成员变量*****");
    	Field[] fieldList= class1.getDeclaredFields();
    	for(Field field :fieldList){
    		System.out.println(field.getType()+"  "+ field.getName());
    	}
    	
    	/*调用构造方法*/
    	System.out.println("******调用构造方法*****");
    	Constructor constructor =class1.getConstructor(String.class,int.class);
    	Stu s2=(Stu) constructor.newInstance("寒冰",12);
    	System.out.println(s2);
    	
    	
    	
    	/*调用成员函数*/
    	System.out.println("******调用成员函数*****");
    	
    	
    	
    	
    }
}
