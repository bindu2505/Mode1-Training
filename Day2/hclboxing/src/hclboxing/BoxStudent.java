package hclboxing;

public class BoxStudent {
	
	public void show(Object ob){
		Student s=(Student)ob;
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		Student objstu=new Student();
		objstu.sno=1;
		objstu.name="bindu";
		objstu.city="hassan";
		objstu.cgp=8.0;
		
		new BoxStudent().show(objstu);
	}

}
