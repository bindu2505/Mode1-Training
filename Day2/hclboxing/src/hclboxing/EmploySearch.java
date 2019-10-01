package hclboxing;

public class EmploySearch {
	public Employ showEmploy(int empno){
		Employ employ=null;
		if(empno==1){
			employ=new Employ();
			employ.empno=100;
			employ.name="bindu";
			employ.basic=64675;
		}
		
		if(empno==3){
			employ=new Employ();
			employ.empno=102;
			employ.name="bindushree";
			employ.basic=45446;
		}
		return employ;
	}
	public static void main(String[] args) {
		EmploySearch obj=new EmploySearch();
		Employ res=obj.showEmploy(4);
		if(res!=null){
			System.out.println(res);
		}else{
			System.out.println("not found");
		}
	}
}
