package com.yedam.app.di.java;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.yedam.app.di.SamsungTV;

public class SpringJavaMain {
	public static void main(String[] args) { // spring 방식
		GenericXmlApplicationContext ctx
		= new GenericXmlApplicationContext
			("classpath:JavaBaseContext.xml");
		
		SamsungTV tv = ctx.getBean(SamsungTV.class); // 소니스피커 객체를 알아서 만들고 집어넣음
		tv.powerOn();
		
		ctx.close();
	}
}
