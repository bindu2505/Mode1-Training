package hclboxing;

public class BoxDemo {
	
	public static void main(String[] args) {
		int a=12;
		double b=12.5;
		String name="Hcl";
		
		/*boxing code*/
		
		Object ob1=a;
		Object ob2=b;
		Object ob3=name;
		
		/*unboxing code*/
		
		int a1=(Integer)ob1;
		double b2=(Double)ob2;
		String c3=(String)ob3;
		
		a1++;
		System.out.println("integer value "+ a1);
		System.out.println("double value "+ b2);
		System.out.println("string " + c3);
	}

}
