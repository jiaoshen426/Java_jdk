package com.jiaoshen.other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 求一个集合的子集 包括空集
 * @author jiaoshen
 * @date 2020/2/4-23:35
 */
public class Test2 {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(1,2,3);
        System.out.println(subSet(numList));
    }
    static List<List<Integer>> subSet(List<Integer> list){
        List result = new ArrayList();
        if(list.isEmpty()){
            result.add(Collections.emptyList()) ;
            return result;
        }
        Integer first = list.get(0);
        List<Integer> rest = list.subList(1,list.size());
        List<List<Integer>> restList = subSet(rest);
        List<List<Integer>> concatList = insertAll(first,restList);
        return concat(restList,concatList);
    }

    private static List<List<Integer>>  concat(List<List<Integer>> restList, List<List<Integer>> concatList) {
        List<List<Integer>> result = new  ArrayList();
        result.addAll(restList);
        result.addAll(concatList);
        return result;

    }

    private static List<List<Integer>> insertAll(Integer first,  List<List<Integer>> rest) {
        List<List<Integer>> result = new ArrayList();
        rest.forEach(a->{
            List<Integer> item = new ArrayList<>();
            item.add(first);
            item.addAll(a);
            result.add(item);
        });
        return  result;

    }
}
