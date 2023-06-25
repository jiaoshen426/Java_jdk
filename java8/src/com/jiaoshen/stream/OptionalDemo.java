package com.jiaoshen.stream;

import java.math.BigDecimal;
import java.util.*;

/**
 * @author jiaoshen
 * @date 2020/1/31-11:21
 */
public class OptionalDemo {
    public static void main(String[] args) {
        //1.日常用法
//        List<BigDecimal> nums =Arrays.asList(BigDecimal.valueOf(1),BigDecimal.valueOf(2),null);
//        Optional<BigDecimal> a = nums.stream().filter(b->b!=null).max(BigDecimal::compareTo);
//        System.out.println(a);
//        BigDecimal b1 = new BigDecimal(10);

        ListNode nodea = new ListNode("a");
        ListNode nodeb = new ListNode("b");
        ListNode nodec = new ListNode("c");
        // nodea.setNext(nodeb);
        //nodeb.setNext(nodec);
        System.out.println(Optional.of(nodea)
                .map(ListNode::getNext)
                .map(ListNode::getNext)
                .orElse(null));

        BigDecimal a1 = new BigDecimal(11);
        BigDecimal a2 = new BigDecimal(111);
        //a1 = null;
        a2 = null;
        System.out.println(Arrays.asList(a1,a2)
                .stream()
                .filter(Objects::nonNull)
                .sorted(BigDecimal::compareTo)
                .findFirst()
                .orElse(BigDecimal.ZERO));
    }
}
