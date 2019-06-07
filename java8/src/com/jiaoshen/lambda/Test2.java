package com.jiaoshen.lambda;

import java.util.Arrays;
import java.util.List;

/**
 * Lambda常用示例
 * @author jiaoshen
 * @date 2019/5/12-18:10
 */
public class Test2 {
     public static void main(String[] args) {
         int portNumber = 1337;
         Runnable r = ()->System.out.println(portNumber);
         //portNumber=1;
     }

    /**
     * ::的用法
     */
    public static void simpleLambda(){
      //(String s) -> System.out.println(s)    System.out::println
    }



    /**
     * lambda引用局部变量只能是最后的
     */
    public static void finalVar(){
         int portNumber = 1337;
         Runnable r = ()->System.out.println(portNumber);
         //portNumber=1;
     }


    /**
     * 数组的遍历
     */
    public  static  void listArray(){
        //1.遍历数组优化
        //old
        System.out.println("*********** list lambda**************");
        List<String> listS = Arrays.asList("H","E","L","L","O");
        for(String s:listS){
            System.out.print(s+" ");
        }
        System.out.println();
        //new lambda
        System.out.println("new lambda ");
        listS.forEach(s->{System.out.print(s);});
        System.out.println();
        // new lambda 2
        listS.forEach(System.out::print);

        //2.流
        //Old way:
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
        for(Integer n : list) {
            int x = n * n;
            System.out.println(x);
        }

        //New way:

        list.stream().map((x) -> x*x).forEach(System.out::println);

    }



}
