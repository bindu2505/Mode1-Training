package hclboxing;

public class Quiz1 {
	public void show(Object x){
		System.out.println("object");
	}
	public void show(int x){
		System.out.println("integer");
	}
	public static void main(String[] args) {
		new Quiz1().show(12.0);
	}
}
