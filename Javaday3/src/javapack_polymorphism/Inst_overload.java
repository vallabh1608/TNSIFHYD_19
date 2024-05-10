package javapack_polymorphism;

public class Inst_overload {
	void add(int a,int b) {
		System.out.println("Add="+(a+b));
		
	}
	void add(float a,float b) {
		System.out.println("Add="+(a+b));
		
	}
	void add(int a,float b,double c) {
		System.out.println(a+b+c);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inst_overload a1=new Inst_overload();
		a1.add(1.2f,2.8f);
		a1.add(4,6);
		a1.add(4,6.7f,10.7);

	}

}
