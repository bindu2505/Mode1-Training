package com.hcl.files;

import java.io.File;

public class FileInfo { 
  /**
    * main method has logic.
    * @param args list of arguments.
    */
  public static void main(String[] args) { 
    File f1 = new File("C:/hcljava/Day4/hcl.com.exp/src/expc/Custom.java");
    System.out.println("file name " + f1.getName());
    System.out.println("full name " + f1.getAbsolutePath());
    File f2 = new File("C:/hcljava/Day4/hcl.com.exp/src/expc");
    String[] files = f2.list();
    for (String s : files) { 
      System.out.println(s);
    }
  }
}
