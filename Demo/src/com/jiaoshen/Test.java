package com.jiaoshen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Test {


    // 最小红包额度
    private static final int MINMONEY = 1;
    // 最大红包额度


    /**
     * @Description: 随机拆分红包
     * @Author: liumeng
     * @Date: 2019/2/27
     * @Param: [money, count]
     * @Return: java.util.List<java.lang.Integer>
     **/
    public static List<Integer> splitRedPackets(int money, int count) {
        if (money < count * MINMONEY ) {
            System.out.println("不可拆分");
            return null;
        }
        // 先预留出 count 份 minS ， 其余的做随机
        int moreMoney = money - count * MINMONEY;
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < count; i++) {
            int one = random(moreMoney, count - i);
            list.add(one + MINMONEY);
            moreMoney = moreMoney - one;
        }
        Collections.shuffle(list);
        return list;
    }

    /**
     *
     * @param money
     * @param count
     * @return
     */
    private static int random(int money, int count) {
        // 红包数量为1，直接返回金额
        if (count == 1) {
            return money;
        }
        int range = money*2/count+1;
        return new Random().nextInt(money+1);
    }
    public static void main(String[] args) {
        System.out.println(12%11);
       /* int money = 15;
        int count = 4;
        for (int i = 0; i < 7; i++) {
            List<Integer> list1 = splitRedPackets(150, 4);
			List<Integer> list2 = splitRedPackets(30, 3);
			List<Integer> list3 = splitRedPackets(20, 3);
			List<Integer> listTotal = new ArrayList<>();
            listTotal.addAll(list1);
            listTotal.addAll(list2);
            listTotal.addAll(list3);
            List<Double> resultList = listTotal.stream().map(w->(double)w/10).collect(Collectors.toList());
            double bigReward= 80.5;
            resultList.add(bigReward);
            System.out.println(resultList);
        }*/
    }

}
