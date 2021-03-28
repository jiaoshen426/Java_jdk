package com.jiaoshen.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


/**
 * Stream
 *
 * @author jiaoshen
 * @date 2019/6/8-13:21
 */
public class MySream {
    public static List<Dish> menu = Arrays.asList(
            new Dish("pork", false, 800, Dish.Type.MEAT),
            new Dish("beef", false, 700, Dish.Type.MEAT),
            new Dish("chicken", false, 400, Dish.Type.MEAT),
            new Dish("french", false, 530, Dish.Type.OTHER),
            new Dish("rice", true, 350, Dish.Type.OTHER),
            new Dish("season", false, 120, Dish.Type.OTHER),
            new Dish("pizza", true, 550, Dish.Type.OTHER),
            new Dish("prawns", false, 300, Dish.Type.FISH),
            new Dish("salmon", false, 450, Dish.Type.FISH)
    );

    /**
     * stream示例一
     * 常用函数(分中间函数和结果函数 结果函数返回结果不是流)
     * filter 筛选
     * map  T->R  函数转换
     * limit  截断
     * distinct 去重
     * 流只能被消费一次
     * 流是内部迭代（可自己优化），集合是外部迭代，必须按顺序来
     */
    public static void example() {


        List<String> highCaloricDishNames = menu.stream().filter(d ->
                d.getCalories() > 300
        ).map(Dish::getName).limit(3).collect(Collectors.toList());
        System.out.println(highCaloricDishNames);

    }

    /**
     * 返回单词使用过的字母
     */
    public static void example2() {
        List<String> wordsList = Arrays.asList("HELLO", "WORLD", "APPLE");

        //List<String> highCaloricDishNames = menu.stream().map(Dish::getName).map(w->w.split(""));


    }

    /**
     * reduce 归约 汇总的意思 是按顺序来执行的
     */
    public static void reduceExample() {
        List<Integer> numsList = Arrays.asList(2, 1, 3);
        Integer result = numsList.stream().reduce(0, (a, b) -> a * 2 + b);
        System.out.println("result :" + result);


        //List<String> highCaloricDishNames = menu.stream().map(Dish::getName).map(w->w.split(""));

        System.out.println();

    }

    public static void main(String[] args) {

        reduceExample();


    }
}
