package keywords;

public class Super_key_2 extends Super_key_1 {
	
	String color="Black";
	void printColor() {
		System.out.println("color="+color);	
		System.out.println("color="+(super.color));
	}
	
	public static void main(String[] args) {
		Super_key_2 s1=new Super_key_2();
		
		s1.printColor();
	}

}
