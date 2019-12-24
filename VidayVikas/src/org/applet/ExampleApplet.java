package org.applet;

import java.applet.Applet;
import java.awt.Graphics;

public class ExampleApplet extends Applet{
@Override
public void init() {
	// TODO Auto-generated method stub
	super.init();
	System.out.println("Init");
}
@Override
	public void stop() {
		// TODO Auto-generated method stub
		super.stop();
		System.out.println("Stop");
	}
@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
		System.out.println("Destory");
	}
@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		System.out.println("Paint");
	}
@Override
	public void start() {
		// TODO Auto-generated method stub
		super.start();
		System.out.println("Start");
	}
}
