package com.jiaoshen.newapi;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

/**
 * @author jiaoshen
 * @date 2020/2/4-10:23
 */
public class TimeApiDemo {
    public static void main(String[] args) {
        LocalDate now =LocalDate.now();
        LocalDate date1= LocalDate.of(2020,2,4);
        LocalDate date2 = date1.with(TemporalAdjusters.firstDayOfYear());

        DateTimeFormatter d1 = DateTimeFormatter.ofPattern("yyyy---MM---dd");
        String datestr = date1.format(d1);
        LocalDate now2 = LocalDate.parse(datestr,d1);

        System.out.println(datestr);
    }
}
