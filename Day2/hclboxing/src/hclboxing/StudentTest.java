package hclboxing;

public class StudentTest {
	public static void main(String[] args) {
		Student stu1=new Student();
		stu1.sno=1;
		stu1.name="bindu";
		stu1.city="hassan";
		stu1.cgp=0;
		Student stu2=new Student();
		stu2.sno=2;
		stu2.name="neethu";
		stu2.city="hassan";
		stu2.cgp=10;
		
		System.out.println(stu1==stu2);
		System.out.println(stu1.equals(stu2));
	}
}
