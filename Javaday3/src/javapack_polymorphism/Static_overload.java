package javapack_polymorphism;

public class Static_overload {
	static void multiply(int a,int b) {
		System.out.println("Result="+(a*b));
		
	}
	static void multiply(float a,float b) {
		System.out.println("Result="+(a*b));
		
	}
	static void multiply(int a,float b,double c) {
		System.out.println("Result="+(a*b*c));
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multiply(9,5);
		multiply(3.5f,5.8f);
		multiply(2,4.8f,20.5);
		

	}

}
