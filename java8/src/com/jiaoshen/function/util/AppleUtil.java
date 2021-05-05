package com.jiaoshen.function.util;

import com.jiaoshen.pojo.Apple;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jiaoshen
 * @date 2020/1/5-21:36
 */
public class AppleUtil {
    public static List<Apple> getApple(){
        List<Apple> appleList = new ArrayList<>(8);
        appleList.add(new Apple("RED", 15));
        appleList.add(new Apple("RED", 19));
        appleList.add(new Apple("RED", 13));
        appleList.add(new Apple("RED", 12));
        appleList.add(new Apple("BULE", 12));
        return appleList;
    }
}
