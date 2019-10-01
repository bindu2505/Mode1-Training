package hclboxing;

public class P6 {
	
	public void check(int x){
		if(x=2){
			System.out.println("hi");
		}else{
			System.out.println("bye");
		}
	}
	//it worksin c..but in java
	public static void main(String[] args) {
		new P6().check(2);
	}
}
