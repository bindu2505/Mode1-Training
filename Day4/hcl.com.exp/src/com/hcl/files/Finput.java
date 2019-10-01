package com.hcl.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Finput {
  /**
    * main method contains code.
    * @param args list of arguments.
    */
  public static void main(String[] args) {
    try {
      FileInputStream fin = new FileInputStream("C:/hcljava/Day4/hcl.com.exp/src/expc/Custom.java");
      int ch;
      while ((ch = fin.read()) != -1) { 
        System.out.print((char)ch);
      }
      fin.close();
    } catch (FileNotFoundException e) { 
      e.printStackTrace();
    } catch (IOException e) { 
      e.printStackTrace();
    }
  }

}
