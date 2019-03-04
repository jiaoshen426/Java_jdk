package com.jiaoshen.timer;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

public class Test {
   public static void main(String[] args) {
	System.out.println("Now Time="+new Date());
	Calendar calendar=Calendar.getInstance();
	calendar.add(Calendar.SECOND, 10);
	Date runDate=calendar.getTime();
	MyTask task=new MyTask();
	Timer timer=new Timer();
	timer.schedule(task,runDate);
}
}
