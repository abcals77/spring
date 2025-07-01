package com.yedam.app.ioc;

import org.springframework.context.support.GenericXmlApplicationContext;

public class StudentMain {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx // 컨테이너 생성
		= new GenericXmlApplicationContext
			("classpath:applicationContext.xml"); // classpath -> src/main/resources 무조건
		
		Student kang = ctx.getBean(Student.class);
		System.out.println(kang);
		
		ctx.close();
	}
}
