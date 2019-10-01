package com.hcl.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FOutput {
  /**
    *main method provides code.
    *@param args list f arguments. 
    */
  public static void main(String[] args) { 
    FileInputStream src;
    FileOutputStream tar;
    try {
      src = new FileInputStream("C:/hcljava/Day4/hcl.com.exp/src/expc/Custom.java");
      tar = new FileOutputStream("C:/files/Custom.java");
      int ch;
      while ((ch = src.read()) != -1) { 
        tar.write((char)ch);
      }
      src.close();
      tar.close();
      System.out.println("**file copied**");
    } catch (FileNotFoundException e) { 
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    
  }

}
