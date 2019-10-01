package hclboxing;
class Demo{
	static{
		System.out.println("hi");
	}
}

public class P4 {
	public static void main(String[] args) {
		System.out.println("bye");
	}
	static{
		System.out.println("hello");
	}

}
//demo class is not called ....so hi will not be printed
