package org.applet;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;

public class ExampleOfTextField extends Applet{
TextField textFieldDateTime;
Button loadTimeDate;
@Override
	public void init() {
		// TODO Auto-generated method stub
		super.init();
		textFieldDateTime=new TextField(50);
		loadTimeDate=new Button("Load");
		add(textFieldDateTime);
		add(loadTimeDate);
		loadTimeDate.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Date d=new Date();
				textFieldDateTime.setText(d.toString());
			}
		});
	}
}
