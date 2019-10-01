package com.hcl.ex;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOut {
  /**
   * main method provides code.
   * @param args list of arguments.
   */
  public static void main(String[] args) { 
    try { 
			DataOutputStream dout = new DataOutputStream(new FileOutputStream("C:/files/data.txt"));
			dout.writeInt(13);
			dout.writeUTF("HCL");
			dout.writeDouble(585.5);
			dout.writeBoolean(true);
			dout.close();
			System.out.println("***file created***");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
