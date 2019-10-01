package expc;
/*
 * class custom provides code.
 */

public class Custom {
  /**
    * sum method provides logic.
    * @param a , b list of arguments.
    * @throws NegativeException , NumberZeroException.
    */
  public void sum(int a,int b) throws NegativeException, NumberZeroException { 
    int c;
    boolean flag = true;
    if (a < 0 || b < 0) { 
      flag = false;
      throw new NegativeException("negative nos not allowed");
    }
    if (a == 0 || b == 0) { 
      flag = false;
      throw new NumberZeroException("zero is invalid");
    }
    if (flag == true) { 
      c = a + b;
      System.out.println("sum is " + c);
    }
  }
  /**
    * main method provides logic.
    * @param args list of arguments.
    */
  
  public static void main(String[] args) { 
    int a = 0;
    int b = 12;
    try {
      new Custom().sum(a, b);
    } catch (NegativeException | NumberZeroException e) { 
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

}
