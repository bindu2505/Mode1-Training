package hclboxing;

public class P7 {
	public static void main(String[] args) {
		byte b1;
		b1=15+110; //ok.125 isin range of-128 to 127
		System.out.println(b1);
		b1=234+12;//error outside the range......compiletime
	}

}
