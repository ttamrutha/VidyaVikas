package org.applet;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;

import javax.swing.JOptionPane;

public class LoaginForm extends Applet{
	TextField textFieldUserName,textFieldPassword;
	Button loginButton;
	@Override
	public void init() {
		// TODO Auto-generated method stub
		super.init();
		setLayout(new BorderLayout());
		textFieldPassword=new TextField(20);
		textFieldUserName=new TextField(20);
		loginButton=new Button("LogIn");
		add(textFieldPassword, BorderLayout.NORTH);
		add(textFieldUserName, BorderLayout.SOUTH);
		add(loginButton, BorderLayout.CENTER);
		loginButton.addActionListener(new  ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String userName=textFieldUserName.getText();
				String password=textFieldPassword.getText();
				if(validateUser(userName, password))
				{
					JOptionPane.showMessageDialog(loginButton, "Sucessfully Loged In");
				}
				else
				{
					JOptionPane.showMessageDialog(loginButton, "Incorrect password");

				}
				
			}
		});
	} 
	public static  boolean validateUser(String userName,String pwd)
	{
		boolean flag=false;
		FileInputStream inputStream;
		try {
			inputStream = new FileInputStream("D:\\txt.txt");
		
		int data=inputStream.read();
		//System.out.println((char)data);
		String content="";
		while(data!=-1)
		{
			content+=(char)data;
			data=inputStream.read();
			
		}
		//System.out.println(content);
		String userData[]=content.split(":");
		for(int i=0;i<userData.length;i++)
		{
			String filePwd=userData[i].split(",")[1];
			String fileUser=userData[i].split(",")[0];
			if(userName.equals(fileUser)&&filePwd.equals(pwd))
			{
				flag=true;
				break;
			}
		}
		} catch ( IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}
}
