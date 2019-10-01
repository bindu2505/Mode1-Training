package com.hcl.ex;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataIn {
  public static void main(String[] args) {
    try {
      DataInputStream din = new DataInputStream(new FileInputStream("C:/files/data.txt"));
      int x = din.readInt();
      x++;
      System.out.println("x value " + x);
      String name = din.readUTF();
      System.out.println("name " + name);
      double bas = din.readDouble();
      System.out.println("basic " + bas);
    } catch (FileNotFoundException e) { 
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }
  }
}
