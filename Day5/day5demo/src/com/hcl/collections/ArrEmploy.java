package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrEmploy {
  /**
    * main method provides logic.
    * @param args list of arguments.
    */
  public static void main(String[] args) {
    List lstemploy = new ArrayList();
    lstemploy.add(new Employ(1, "bindu",25452));
    lstemploy.add(new Employ(2, "hema",4545));
    lstemploy.add(new Employ(3, "priya",2454));
    lstemploy.add(new Employ(4, "janani",1245));
    lstemploy.add(new Employ(5, "anisha",14546));
    for (Object ob : lstemploy) { 
      Employ e = (Employ)ob;
      System.out.println(e);
    }
  }
}
