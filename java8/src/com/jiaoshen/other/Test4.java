package com.jiaoshen.other;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @author jiaoshen
 * @date 2020/3/8-15:37
 */
public class Test4 {


    public static void main(String[] args) {
       //List<Integer>  l1 = Arrays.asList(1,2,3,4,5);
      String timeStr = "2021-03-26 10:00:00";
        LocalDateTime appointEndTime = LocalDateTime.parse(timeStr, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        LocalDateTime today_min = LocalDateTime.of(LocalDate.now(), LocalTime.MIN);
        long durDay  =   Duration.between(today_min,appointEndTime).toDays();
        System.out.println("durDay"+durDay);



    }
}
