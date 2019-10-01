package com.hcl.ex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadStudent {
	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("C:/files/student.txt");
			ObjectInputStream objin = new ObjectInputStream(fin);
			Student s = (Student)objin.readObject();
			System.out.println(s);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
