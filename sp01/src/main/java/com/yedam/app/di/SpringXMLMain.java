package com.yedam.app.di;

import org.springframework.context.support.GenericXmlApplicationContext;

public class SpringXMLMain {
	public static void main(String[] args) { // spring 방식
		GenericXmlApplicationContext ctx
		= new GenericXmlApplicationContext
			("classpath:applicationContext.xml");
		
		SamsungTV tv = ctx.getBean(SamsungTV.class); // 소니스피커 객체를 알아서 만들고 집어넣음
		tv.powerOff();
		
		ctx.close();
	}
}
