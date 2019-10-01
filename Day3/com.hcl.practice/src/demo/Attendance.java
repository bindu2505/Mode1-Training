package demo;



public class Attendance {
	
	public static void display(Object...ob){
		for (Object object : ob) {
			System.out.print(object+" ");
		}
		System.out.println();
	}
	
	public static void show(int day,String...name){
		System.out.print(day+" ");
		for (String s : name) {
	System.out.print(s+ " ");
			
		}
		System.out.println();
	}
	public static void main(String[] args) {
		show(1);
		show(2,"bindu","neethu");
		show(3,"hema","priya","janani","anisha");
		show(4,"lakshmi","narendra");
		
		display();
		display("ram",12,true,78.5);
	}
}
