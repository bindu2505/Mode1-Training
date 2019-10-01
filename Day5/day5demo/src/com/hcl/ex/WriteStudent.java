package com.hcl.ex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteStudent {
	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("C:/files/student.txt");
			ObjectOutputStream objout = new ObjectOutputStream(fout);
			Student s = new Student(1,"bindu", "hassan" , 9.0
					);
			objout.writeObject(s);
			objout.close();
			fout.close();
			System.out.println("student stored");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

}
