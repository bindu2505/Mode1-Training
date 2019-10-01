package hclboxing;

public class BoxEmploy {
	
	public void show(Object ob){
		//int x=(Integer)obj;
		Employ e=(Employ)ob;
		System.out.println(e);
	}
	

	
	

	
	public static void main(String[] args) {
		
		Employ objEmploy=new Employ();
		objEmploy.empno=1;
		objEmploy.name="bindu";
		objEmploy.basic=34346;
		
		new BoxEmploy().show(objEmploy);
		

		
	}
	}
	
	