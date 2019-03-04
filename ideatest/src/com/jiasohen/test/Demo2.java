package com.jiasohen.test;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Demo2 {
     public static void main(String[] args) {
         List l1 = new ArrayList(5);
         for (int i = 0; i < 100; i++) {
             l1.add(i);
             Class c=l1.getClass();
             Field f;
             try {
                 f=c.getDeclaredField("elementData");
                 f.setAccessible(true);
                 Object[] o=(Object[])f.get(l1);
                 System.out.println(o.length);
             } catch (NoSuchFieldException | SecurityException e) {
                 // TODO Auto-generated catch block
                 e.printStackTrace();
             } catch (IllegalArgumentException e) {
                 // TODO Auto-generated catch block
                 e.printStackTrace();
             } catch (IllegalAccessException e) {
                 // TODO Auto-generated catch block
                 e.printStackTrace();
             }

         }

         //Collections.sort();

        }
}
