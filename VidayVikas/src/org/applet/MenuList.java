package org.applet;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;

public class MenuList extends Applet{
	Label label1,label2,label3,label4,label11,label22,label33,label44,label5,label6;
	TextArea textArea;
	@Override
	public void init() {
		// TODO Auto-generated method stub
		super.init();
		setLayout(new BorderLayout());
		label1=new Label("Menu1");
		label2=new Label("Menu2");
		label3=new Label("Menu3");
		label4=new Label("Menu4");
		label11=new Label("Tool1");
		label22=new Label("Tool2");
		label33=new Label("Tool3");
		label44=new Label("Tool4");
		label5=new Label("footer1");
		label6=new Label("footer2");
		textArea=new TextArea(10,40);
		Panel panelNorth=new Panel();
		panelNorth.add(label1);
		panelNorth.add(label2);
		panelNorth.add(label3);
		panelNorth.add(label4);
		Panel panelWest=new Panel();
		panelWest.add(label11);
		panelWest.add(label22);
		panelWest.add(label33);
		panelWest.add(label44);
		Panel panelSouth=new Panel();
		panelSouth.add(label5);
		panelSouth.add(label6);
		add(panelNorth,BorderLayout.NORTH);
		add(panelSouth,BorderLayout.SOUTH);
		add(panelWest,BorderLayout.WEST);
		add(textArea,BorderLayout.CENTER);
	}

}
