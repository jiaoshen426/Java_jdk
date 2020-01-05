package com.jiaoshen.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


/**
 * @author jiaoshen
 * @date 2019/6/8-13:21
 */
public class MySream {
    static  List<Dish> menu = Arrays.asList(
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
       List<String> wordsList = Arrays.asList("HELLO","WORLD","APPLE");

        //List<String> highCaloricDishNames = menu.stream().map(Dish::getName).map(w->w.split(""));

        System.out.println();

    }

    public static void main(String[] args) {
        example();
    }
}
