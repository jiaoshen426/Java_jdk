package com.jiaoshen.other;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author jiaoshen
 * @date 2020/8/10-9:55
 */
public class TestReward {
    static int newUserNum = 0;
    static int oldUserNum = 0;
    static BigDecimal joinReward =  BigDecimal.valueOf(166.1).setScale(2,BigDecimal.ROUND_HALF_UP);
    static int rewardTimes=0; //奖励轮数
    static BigDecimal bigReward = new BigDecimal(0);//每轮第一个大红包
    static BigDecimal minNum = BigDecimal.valueOf(0.01);
    static List<BigDecimal> reardlist = new ArrayList<>();
    static {
        reardlist.add(joinReward);
    }
    public static void main(String[] args) {

//        IntStream.range(0,6).forEach((n)->{
//
//        });
        IntStream.range(0,30).forEach((n)->{
            getRewardValue(true);
            getRewardValue(false);
        });
        System.out.println(reardlist);
        System.out.println("oldUserNum"+oldUserNum);
        System.out.println("newUserNum"+newUserNum);
    }

    /**
     * 账户大于100触发大红包
     *
     * @param isNewUser
     * @return
     */
    public static BigDecimal getRewardValue(boolean isNewUser){
        BigDecimal leftReward;
        BigDecimal resultReward = BigDecimal.ZERO;
        //先判断是否触发大红包
        BigDecimal sumReward =reardlist.stream().reduce(BigDecimal::add).get();
        if(joinReward.compareTo(BigDecimal.valueOf(100))>0){
            sumReward=sumReward.subtract(BigDecimal.valueOf(100));
        }
        //1.判断是否触发大红包(每满一次100触发大红包；只有三个，包括初始红包)
        if(rewardTimes<=2 && BigDecimal.valueOf((rewardTimes+1)*100).compareTo(sumReward)<0){
            resultReward = BigDecimal.valueOf(68.6);
            rewardTimes++;
            if(isNewUser){
                newUserNum++;
            }else{
                oldUserNum++;
            }
        }
        /**
         * 2.老用户
         * 10个助力=余额的90%
         * 剩下的10% 从第11位开始 剩余*0.5
         * 12位 剩余*0.5^2
         * 13位 剩余*0.5^3
         * n位 剩余*0.5^(n-10)
         * ……以此类推
         * 然后最终最小是0.01  1分钱截止
         *
          */
       else if(!isNewUser){
            oldUserNum++;
            if(joinReward.compareTo(BigDecimal.valueOf(100))>0){
                leftReward = BigDecimal.valueOf(200).subtract(joinReward);
            }else{
                leftReward =BigDecimal.valueOf(100).subtract(joinReward);
            }
            if(oldUserNum <=10){
                resultReward = leftReward.multiply(BigDecimal.valueOf(0.3*0.09));
            }else{
                resultReward = leftReward.multiply(BigDecimal.valueOf(0.3*0.01)).multiply(BigDecimal.valueOf(0.5).pow(oldUserNum-10));
            }
            /**
             * 3.
             * 第一轮：前三个余额*70%*1/3  ，后面 余额*1/6
             * 第二轮及后面：余额1/10，
             *
             */
       }else{
            newUserNum++;
            //获取每轮循环的初始大红包
            List<BigDecimal> bigRewardList = reardlist.stream().filter(a->a.compareTo(BigDecimal.valueOf(50))>0).collect(Collectors.toList());
            BigDecimal bigReward = bigRewardList.get(bigRewardList.size()-1);
            if(bigReward.compareTo(BigDecimal.valueOf(100))>0){
                bigReward = bigReward.subtract(BigDecimal.valueOf(100));
            }
            leftReward =BigDecimal.valueOf(100).subtract(bigReward);

            if(rewardTimes == 0){
                if(newUserNum<=3){
                    resultReward = leftReward.multiply(BigDecimal.valueOf(0.7*1/3));
                }else {
                    resultReward = leftReward.multiply(BigDecimal.valueOf(0.7*1/6));
                }
            }else{
                resultReward = leftReward.multiply(BigDecimal.valueOf(0.1));
            }
        }
        resultReward = resultReward.setScale(2,BigDecimal.ROUND_HALF_UP);
        if(resultReward.compareTo(BigDecimal.valueOf(0.01))<0){
            resultReward = BigDecimal.valueOf(0.01);
        }
        reardlist.add(resultReward);
        return resultReward;
    }
}
