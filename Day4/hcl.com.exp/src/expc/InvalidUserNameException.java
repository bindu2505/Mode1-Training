package expc;

public class InvalidUserNameException extends Exception { 
  public InvalidUserNameException(String error) {  
    super(error);
  }
}