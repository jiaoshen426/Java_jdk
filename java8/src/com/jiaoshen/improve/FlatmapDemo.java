package com.jiaoshen.improve;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 关于flatmap使用
 * flatmap方法讓你吧一个六中的每个值都换成另外一个流，然后把所有的流连接起来成为一个流
 * @author jiaoshen
 * @date 2021/5/3-22:27
 */
public class FlatmapDemo {
    public static final List<String> wordList = Arrays.asList("jiaoshen","xiaoxiao");
    public static void main(String[] args) {
        example2();

    }

    /**
     * 经典的用flatmap拆分单词
     * Arrays::stream 把数组变为一个流; List::stream
     */
    public static void example(){
        List<String > result=  wordList.stream().map(word->word.split("")).flatMap(Arrays::stream).collect(Collectors.toList());
        List<String > result2=  wordList.stream().map(word-> Arrays.asList(word.split(""))).flatMap(List::stream).collect(Collectors.toList());
        System.out.println(result2);
    };

    /**
     * 数组对组合
     */
    public static void example2(){
        List<Integer> list1= Arrays.asList(1,2,3);
        List<Integer> list2= Arrays.asList(3,4);
        //建立數組對
        List<int[]>   resultPair = list1.stream().flatMap(i -> list2.stream().map(j -> new int[]{i, j})).collect(Collectors.toList());
        resultPair.forEach(item-> System.out.println(Arrays.toString(item)));

        //过滤两数之和能被3整除
        resultPair =  resultPair.stream().filter(item -> (item[0]+ item[1])% 3 ==0 ).collect(Collectors.toList());
        resultPair.forEach(item-> System.out.println(Arrays.toString(item)));


    };
    
    
    
    
}
