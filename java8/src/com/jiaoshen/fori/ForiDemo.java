package com.jiaoshen.fori;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 *  用java8改进遍历
 *
 * @author jiaoshen
 * @date 2020/8/9-15:51
 */
public class ForiDemo {
    private static List<Integer> numList = Arrays.asList(5,4,3,2,1,7,8);
    public static void main(String[] args) {
        //1.固定次数的遍历
        fn1();
        //2.有break 或return或continue
        //3.影响外界变量
    }
    public  static  void fn1(){
        IntStream.range(0,5).forEach(i -> System.out.println(i +"..."+numList.get(i)));
    }
    public  static  void fn2(){
        IntStream.range(0,5).forEach(i -> System.out.println(i +"..."+numList.get(i)));
    }



}
