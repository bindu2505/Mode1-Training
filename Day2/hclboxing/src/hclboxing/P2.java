package hclboxing;

public class P2 {
	public void show(Object ob){
		if(ob=="ABC"){
				System.out.println("correct a and d");
		}else{
			System.out.println("error");
		}
	}
	//noneed tounbox for string...for others unbox it
	public static void main(String[] args) {
		String s="ABC";
		P2 obj=new P2();
		obj.show(s);
	}

}
