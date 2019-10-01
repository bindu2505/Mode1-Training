package hclboxing;

public class TimeZone {
	
	int hr,min;
	
	
	public TimeZone() {
		
	}
	public  TimeZone(int hr,int min){
		this.hr=hr;
		this.min=min;
	}
	public TimeZone add(TimeZone t1,TimeZone t2){
		TimeZone t3=new TimeZone();
		t3.hr=t1.hr+t2.hr;
		t3.min=t1.min+t2.min;
		if(t3.min>=60){
			t3.hr+=1;
			t3.min=t3.min%60;
		}
		return t3;
		
	}
	
	
	
	@Override
	public String toString() {
		return "TimeZone [hr=" + hr + ", min=" + min + "]";
	}
	public static void main(String[] args) {
		TimeZone ob1=new TimeZone(3,40);
		TimeZone ob2=new TimeZone(2,35);
		
		
		TimeZone ob3=new TimeZone().add(ob1, ob2);
		
		System.out.println(ob3);
		
		
		
	}

}
