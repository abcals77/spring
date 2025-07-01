package com.yedam.app.di;

public class DefaultMain {
	public static void main(String[] args) { // java 방식
		SonySpeaker speaker = new SonySpeaker();

//		SamsungTV tv = new SamsungTV(speaker); 
		SamsungTV tv = new SamsungTV();
		tv.setSpeaker(speaker);
		
		tv.powerOn();
	}
}
