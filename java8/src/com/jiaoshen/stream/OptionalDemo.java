package com.jiaoshen.stream;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * @author jiaoshen
 * @date 2020/1/31-11:21
 */
public class OptionalDemo
{
    public static void main(String[] args) {
        //1.日常用法
        List<BigDecimal> nums =Arrays.asList(BigDecimal.valueOf(1),BigDecimal.valueOf(2),null);
        Optional<BigDecimal> a = nums.stream().filter(b->b!=null).max(BigDecimal::compareTo);
        System.out.println(a);


    }
}
