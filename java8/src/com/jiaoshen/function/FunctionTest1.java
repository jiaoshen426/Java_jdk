package com.jiaoshen.function;

import com.jiaoshen.function.util.AppleUtil;
import com.jiaoshen.pojo.Apple;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**Lambda 常用函数demo
 *
 * @author jiaoshen
 * @date 2020/1/5-21:27
 */
public class FunctionTest1 {
    public static void main(String[] args) {
        //1.比较函数 Comparator
        List<Apple> appleList = AppleUtil.getApple();
        Comparator<Apple> c = Comparator.comparing(Apple::getWeight);
        appleList.sort(c.reversed().thenComparing(Apple::getColor));

        //2.谓词函数 Predicate（比较函数,可以复合）
        List<Apple> appleList2 = AppleUtil.getApple();
        Predicate<Apple> p = a->a.getColor().equals("RED");
        //按顺序从左到右执行
        Predicate<Apple> p2 = p.negate().and(p).or(p);
        System.out.println(appleList2.stream().filter(p).collect(Collectors.toList()));

        //3.函数 Function
        Function<Integer,Integer> f1  = x->x+2;
        Function<Integer,Integer> f2  = x->x*2;
        Function<Integer,Integer> f3  = f1.andThen(f2);
        System.out.println(f3.apply(1));




    }
}
