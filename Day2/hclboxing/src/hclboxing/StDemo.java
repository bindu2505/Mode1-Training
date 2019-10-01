package hclboxing;

public class StDemo {
	void show(){
		System.out.println("from new method.....");
	}
	 static void display(){
		 System.out.println("from display method");
	 }
	 public static void main(String[] args) {
		//display();....it works for ststic method......no object creation is required
		 StDemo.display();
		 new StDemo().show();
	}
}
