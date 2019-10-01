package com.hcl.ex;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteEmploy {
	public static void main(String[] args) {
		FileOutputStream fout;
		try {
			FileOutputStream fout1 = new FileOutputStream("C:/files/employ.txt");
			ObjectOutputStream objout = new ObjectOutputStream(fout1);
			Employ e = new Employ(1, "Anupam" , 86748.3);
			objout.writeObject(e);
			objout.close();
			fout1.close();
			System.out.println("employ stored");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
