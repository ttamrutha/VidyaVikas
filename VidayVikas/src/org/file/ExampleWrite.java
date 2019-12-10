package org.file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExampleWrite {
public static void main(String[] args) {
	FileOutputStream fileOutputStream;
	try {
		fileOutputStream = new FileOutputStream("d://a.txt");
		//fileOutputStream.write('C');
		String name="Amrutha";
		for(int i=0;i<name.length();i++)
		{
			fileOutputStream.write(name.charAt(i));
		}
		fileOutputStream.close();
		fileOutputStream = new FileOutputStream("d://a.txt",true);

		fileOutputStream.write('J');
		fileOutputStream.close();

	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
