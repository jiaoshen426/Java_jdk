package com.jiaoshen.stream;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

/**
 * @author jiaoshen
 * @date 2020/1/30-21:56
 */
public class CollectDemo {
    enum CaloricLevel { DIET, NORMAL, FAT };

    public static void main(String[] args) {
        List<Dish> dishes = MySream.menu;
        //1.连接字符串
        String nameStr = dishes.stream().map(Dish::getName).collect(Collectors.joining(","));
        //System.out.println(nameStr);
        //2.reducing 规约（函数基本框架：参数1.初始值，2.转换函数，3.累积函数）
        int totalCalories = dishes.stream().collect(reducing(
                0,Dish::getCalories,Integer::sum));
        //System.out.println(totalCalories);

        //3.用reducing推导出counting和joining
        int r2count = dishes.stream().collect(reducing(0,a->1,Integer::sum));
        System.out.println(r2count);
        String r2join = dishes.stream().collect(reducing("",Dish::getName,(a,b)->a+b));
        //System.out.println(r2join);

        //groupBy
        Map<Dish.Type,List<Dish>> typeDishes = dishes.stream().collect(groupingBy(Dish::getType));
        Map<Dish.Type,Long> typeDishes1 = dishes.stream().collect(groupingBy(Dish::getType,counting()));
        Map<Dish.Type, Set> typeDishes2 = dishes.stream().collect(groupingBy(Dish::getType,mapping(dish -> {
           if(dish.getCalories()<=400) {
               return  CaloricLevel.DIET;
           }
           else{
               return CaloricLevel.NORMAL;
           }
        },toCollection(HashSet::new))));
        System.out.println(typeDishes1);


    }

}
