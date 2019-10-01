package expc;
 

/*
 * class custom1 provides the code
 */

public class Custom1 {
  /** 
    * the main entry point.
    * @param s the list of arguments.
    * @throws exception.
    **/
  public void check(String s) throws InvalidEmailException, InvalidUserNameException {  
    if (s.indexOf('@') == -1) { 
      throw new InvalidEmailException("@ symbol is not present");
    } 
    if (s.indexOf('@') > 12) { 
      throw new InvalidUserNameException("cannot exceed 12 characters");
    } 
    System.out.println("correct mail address");
  } 
  /** 
    * the main entry point.
    * @param args the list of arguments.
    * @throws exception.
    **/

  public static void main(String[] args) { 
    String str = "bindushree@gmail.com"; 
    try { 
      new Custom1().check(str);
    } catch (InvalidEmailException | InvalidUserNameException e) { 
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

}

