package com.hcl.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteEx {
  /**
    * main method has logic.
    * @param args list of arguments.
    */
  public static void main(String[] args) {
    File src;
    File tar;
    FileReader fr;
    FileWriter fw;
    src = new File("C:/hcljava/Day4/hcl.com.exp/src/expc/Custom.java");
    tar = new File("C:/files/Custom.java");
    try { 
      fr = new FileReader(src);
      fw = new FileWriter(tar);
      int ch;
      while ((ch = fr.read()) != -1) { 
        fw.write((char)ch);
      }
      fr.close();
      fw.close();
      System.out.println("...file copied...");
    } catch (FileNotFoundException e) { 
      e.printStackTrace();
    } catch (IOException e) { 
      e.printStackTrace();
    }
  }
}
