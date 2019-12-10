package org.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExampleBufferReader {
public static void main(String[] args) {
	try {
	BufferedReader bufferedReader=new BufferedReader(new FileReader("d://cmd1.java"));
	
		String data=bufferedReader.readLine();
		String fileContent="";
		while(data!=null)
		{
			fileContent+=data+"\n";
			data=bufferedReader.readLine();
		}
		System.out.println("Data:"+fileContent);

	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
