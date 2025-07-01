package com.yedam.app.di.anotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Component
// @Data
// @Setter
@Getter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
// 생성자 주입
// @RequiredArgsConstructor // final로 선언된 필드로 생성자 구성

public class AppleTV {
	@Setter(onMethod_ = {@Autowired})
	private MarshallSpeaker speaker; // 자식클래스 가질 수 없음 -> 값 변경 불가(상수)
	
	public void powerOn() {
		System.out.println("스피커 온");
	};
	public void powerOff() {
		System.out.println("스피커 오프");
	};
	
	
}
