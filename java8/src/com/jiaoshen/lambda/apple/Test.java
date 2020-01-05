package com.jiaoshen.lambda.apple;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author jiaoshen
 * @date 2019/5/26-19:59
 */
public class Test {
    public static void main(String[] args) {
        List<Apple> appleList = new ArrayList<>(8);
        appleList.add(new Apple("RED", 15));
        appleList.add(new Apple("RED", 19));
        appleList.add(new Apple("RED", 13));
        appleList.add(new Apple("RED", 12));

        // 1.old method
//        appleList.sort(new Comparator<Apple>() {
//            @Override
//            public int compare(Apple o1, Apple o2) {
//                return o1.getWeight().compareTo(o2.getWeight());
//            }
//        });
        // 2.lambda
      //  appleList.sort((o1,o2)-> {return o1.getWeight().compareTo(o2.getWeight());});

//        3.lambda
        appleList.sort(Comparator.comparing(Apple::getWeight).reversed());

        appleList.forEach(System.out::println);



    }
}
