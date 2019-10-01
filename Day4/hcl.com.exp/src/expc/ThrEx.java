package expc;

/*
 * class ThrEx provides code.
 */

public class ThrEx {
  /** 
   * show method provides logic.
   * @param x arguments.
   */

  public void show(int x) { 
    boolean flag = true;
    if (x < 0) { 
      flag = false;
      throw new NumberFormatException("negative number not allowed");
    }
    if (x == 0) { 
      flag = false;
      throw new ArithmeticException("Zero is invalid");
    }
    if (flag == true) { 
      System.out.println("x value " + x);
    }
  }
  /**
   * main method provides logic.
   * @param args list of arguments.
   */
  
  public static void main(String[] args) { 
    int n = 12;
    try { 
      new ThrEx().show(n);
    } catch (NumberFormatException e) { 
      System.out.println(e.getMessage());
    } catch (ArithmeticException e) { 
      System.out.println(e.getMessage());
    } catch (Exception e) { 
      e.printStackTrace();
    }
  }
}
