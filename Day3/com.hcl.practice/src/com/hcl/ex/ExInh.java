package com.hcl.ex;

class First{
	public void show(){
		System.out.println("first");
	}
}
 class Second extends First{
	 public void show(){
		 System.out.println("second");
	 }
 }
public class ExInh {
	public static void main(String[] args) {
		First ob1=new First();
		try {
			Second ob2=(Second)ob1;
			ob2.show();
		}catch(ClassCastException e){
			System.out.println("cannot be assigned");
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
