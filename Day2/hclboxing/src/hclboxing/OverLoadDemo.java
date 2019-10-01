package hclboxing;

public class OverLoadDemo {
	

	public void show(int x){
		System.out.println("show method wrt int "+x);
	}
	
	public void show(String x){
		System.out.println("show method wrt string "+x);
	}
	
	public void show(boolean x){
		System.out.println("show method wrt boolean "+x);
	}
	
	public void show(double x){
		System.out.println("show method wrt double "+x);
	}
	
	public static void main(String[] args) {
		OverLoadDemo obj=new OverLoadDemo();
		obj.show(12);
		obj.show("bindu");
		obj.show(true);
		obj.show(32.89);
	}
}
