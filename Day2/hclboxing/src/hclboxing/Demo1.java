package hclboxing;

public class Demo1 {
	public int sum(){
		return 5;
	}
	
	public int sum(int x){
		return x+5;
	}
	
	public int sum(int a,int b)
	{
		return a+b;
	}
		
	public static void main(String[] args) {
		
		Demo1 ob=new Demo1();
		int res=ob.sum();
		System.out.println("sum is "+res);
		 res=ob.sum(2);
		System.out.println("sum is "+res);
		 res=ob.sum(1,1);
		System.out.println("sum is "+res);
	}

}
