package org.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExampleReadFile {
public static void main(String[] args) throws FileNotFoundException {
	try {
		FileInputStream inputStream=new FileInputStream("D:\\txt.txt");
		int data=inputStream.read();
		//System.out.println((char)data);
		String content="";
		while(data!=-1)
		{
			content+=(char)data;
			data=inputStream.read();
			
		}
		System.out.println(content);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
