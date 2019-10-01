package hclboxing;

public class EmployTest {
	public static void main(String[] args) {
		Employ e1=new Employ();
		e1.empno=1;
		e1.name="bindu";
		e1.basic=25487;
		
		Employ e2= new Employ();
		e2.empno=2;
		e2.name="neethu";
		e2.basic=25487;
		
		System.out.println(e1==e2);
		System.out.println(e1.equals(e2));
	}

}
