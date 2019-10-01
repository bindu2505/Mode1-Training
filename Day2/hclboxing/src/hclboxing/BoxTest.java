package hclboxing;

public class BoxTest {
	
	public void show(Object ob) {
		
		String type= ob.getClass().getSimpleName();
		//System.out.println(type);
		
		if(type.equals("Integer")){
			int x=(Integer)ob;
			System.out.println("integer casting " +x);
		}
		
		if(type.equals("Double")){
			double x=(Double)ob;
			System.out.println("double casting "+ x);
		}
		
		if(type.equals("String")){
			String x=(String)ob;
			System.out.println("string casting "+x);
		}
	}
	
	public static void main(String[] args) {
		int a=12;
		double b=12.5;
		String name="Hcl";
		
		BoxTest obj=new BoxTest();
		obj.show(a);
		obj.show(b);
		obj.show(name);
	}

}
