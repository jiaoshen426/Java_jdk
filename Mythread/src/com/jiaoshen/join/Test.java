package com.jiaoshen.join;

import com.sun.jndi.url.dns.dnsURLContext;

public class Test {
	public static void main(String[] args) {
		
		D d=new D();
		C c=new C(d);
		try {
			c.start();
			d.start();
			d.join(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main执行完====");
	}
	

}
