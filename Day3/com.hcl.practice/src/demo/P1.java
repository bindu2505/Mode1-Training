package demo;

enum Test{
	A,D,G,J,Y,K,L;
	private Test(){
		System.out.println("hi");
	}
}

public class P1 {
	public static void main(String[] args) {
		Test t=Test.Y;
		
	}

}
