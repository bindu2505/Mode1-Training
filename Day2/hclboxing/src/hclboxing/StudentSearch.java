package hclboxing;

public class StudentSearch {
	public Student showStudent(int sno ){
		Student student=null;
		if(sno==1){
			student=new Student();
			student.sno=111;
			student.name="bindu";
			student.city="hassan";
			student.cgp=9.5;
			
		}
		
		if(sno==2){
			student=new Student();
			student.sno=222;
			student.name="priya sri";
			student.city="trichy";
			student.cgp=10;
			
		}
		return student;
		
	}
	public static void main(String[] args) {
		StudentSearch ob=new StudentSearch();
		Student res=ob.showStudent(2                                                                                                             );
		if(res!=null){
			System.out.println(res);
		}else{
			System.out.println("not found");
		}
	}
}
