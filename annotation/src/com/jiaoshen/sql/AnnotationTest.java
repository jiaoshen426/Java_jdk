package com.jiaoshen.sql;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;;


/**
 * 用自定义注解实现一个类似JPA数据库查询的功能
 * @author jiaoshen
 *
 */
public class AnnotationTest {
	public static void  fiter(Student stu) throws Exception{
		String table;
		Class class1 = Student.class;
		Table tableAnnotation = (Table)class1.getAnnotation(Table.class);
		if(tableAnnotation!=null){
			table = tableAnnotation.value();
		}
		else{
			return ;
		}
		String sqlString = "select * from "+table + "where 1=1 and";
		Field[] fields =class1.getDeclaredFields();
		for(Field f:fields){
			Column column = f.getAnnotation(Column.class);
			if(column != null){
				String methodNameString = "get"+f.getName().substring(0, 1).toUpperCase()+f.getName().substring(1);
				Method m1 = class1.getMethod(methodNameString);
				Object colValue = m1.invoke(stu);
				sqlString +="and" + column.name()+"=";
				sqlString += colValue;
			}
		}
		System.out.println(sqlString);
		
	}
	public static void main(String[] args) {
		Student stu = new Student();
		stu.setName("jiaoshen");
		stu.setID(24);
		stu.setAge(12);
		stu.setAddress("深圳");
		  try {
			fiter(stu);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
   
}
