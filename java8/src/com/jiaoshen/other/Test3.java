package com.jiaoshen.other;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @author jiaoshen
 * @date 2020/3/8-15:37
 */
public class Test3 {


    public static void main(String[] args) {
       //List<Integer>  l1 = Arrays.asList(1,2,3,4,5);
        List<Integer> l3  = new ArrayList<>();
        for(int  i =0;i<1000;i++){
            HashSet<Integer> l2 = new   HashSet() ;
            Integer count = 0;
            while (l2.size()<5){
                int ramdom = (int)(Math.random()*5);
                l2.add(ramdom);
                count++;
            }
            System.out.println("count:" +count);
            l3.add(count);
        }
        System.out.println("average:"+l3.stream().mapToInt(Integer::intValue).average().orElse(0D));


    }
}
