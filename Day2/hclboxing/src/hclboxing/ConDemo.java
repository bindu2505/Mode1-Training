package hclboxing;

public class ConDemo {
	
	static{
		System.out.println("static constructor....");
	}

	public ConDemo() {
		System.out.println("default constructor....");
	}
	public static void main(String[] args) {
		new ConDemo();
		
	}
	
}
