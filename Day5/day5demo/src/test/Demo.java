package test;



class Test{
	
	public void sayHello(){
		System.out.println("Hello from HCL");
	}
	private void venue(){
		System.out.println("At BTM Layout...");
	}
	
	void trainer(){
		venue();
		System.out.println("Trainer Prasanna...");
	
	}
}
public class Demo {
		public static void main(String[] args) {
			Test obj=new Test();
			obj.sayHello();
			obj.trainer();
			//obj.venue();
		}
}



