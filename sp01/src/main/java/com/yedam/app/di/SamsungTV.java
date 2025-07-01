package com.yedam.app.di;

public class SamsungTV {
	private SonySpeaker speaker; // 부품관계 -> class 안에 또 다른 class
	
	public SamsungTV(SonySpeaker speaker) {
		this.speaker = speaker;
	}
	
	public SamsungTV() {};
	
	public void setSpeaker(SonySpeaker speaker) {
		this.speaker = speaker;
	}
	
	public void powerOn() {
		speaker.on();
	}
	
	public void powerOff() {
		speaker.off();
	}
	
	public void volumeUp() {
		speaker.volumeUp();
	}
	
	public void volumeDown() {
		speaker.volumeDown();
	}
}
