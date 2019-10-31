package org.oops;

public class WhatsAppUser {
public static void main(String[] args) {
	WhatsAppV1 obj=new WhatsAppV1();
	obj.number=347365765;
	obj.chat("Hello");
	obj.tick(100);
	obj.broadCast();
	WhatAppV2 obj1=new WhatAppV2();
	obj1.number=356453;
	obj1.chat("Hi");
	obj1.tick(234);
	obj1.broadCast();
	obj1.videoCall();
	obj1.voiceMessage();
}
}
