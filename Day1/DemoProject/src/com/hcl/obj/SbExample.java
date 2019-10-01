package com.hcl.obj;



public class SbExample {
	public StringBuilder show(int age,String name,  String course, String city){
		StringBuilder sbError= new StringBuilder();
		boolean isValid =  true;
		
		/*validation for age*/
		if(age<20){
			sbError.append("age must be greater than 20"+ "\r\n");
			isValid=false;
			
		}
		
		if(name.indexOf(' ')== -1){
			sbError.append("name contain both firstname and lastname" + "\r\n");
			isValid=false;
			
		}
		
		if(!course.equalsIgnoreCase("java")){
			
			sbError.append("only java course allowed"+"\r\n");
			isValid=false;
		}
		
		if(isValid== true){
		
		sbError.append("age "+ age + "\r\n");
		sbError.append("Name "+name+ "\r\n");
		sbError.append("Course "+ course+"\r\n");
		sbError.append("City "+ city+ "\r\n");
	}
		return sbError;
	}
	public static void main(String[] args) {
		int age=23;
		String name="bindu",course="java",city="hassan";
		StringBuilder sbRes= new SbExample().show(age, name, course, city);
		System.out.println(sbRes);
	}

}
