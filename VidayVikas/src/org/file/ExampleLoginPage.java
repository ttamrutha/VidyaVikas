package org.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ExampleLoginPage {
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
public static void main(String[] args) {
	Scanner key=new Scanner(System.in);
	System.out.println("Enter a username");
	String userName=key.nextLine();
	System.out.println("Enter a password");
	String pwd=key.nextLine();
	if(validateUser(userName, pwd))
		
	{
		System.out.println("Sucessfully Login ");
	}
	else
	{
		System.out.println("Invalid user name or password");
	}
	
}
}
