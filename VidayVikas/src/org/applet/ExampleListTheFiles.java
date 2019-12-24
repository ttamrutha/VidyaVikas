package org.applet;

import java.applet.Applet;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class ExampleListTheFiles extends Applet implements ActionListener {
	Button loadButton;
	public static void listFile()
	{
		File file=new File("F:\\Notes\\GUI (1)\\GUI");
		try {
		String filesList[]=file.list();
		for(int i=0;i<filesList.length;i++)
		{
			System.out.println(filesList[i]);
		}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void init() {
		// TODO Auto-generated method stub
		super.init();
		loadButton=new Button("Load Files");
		loadButton.addActionListener(this);
		add(loadButton);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		listFile();
	}
	

}
