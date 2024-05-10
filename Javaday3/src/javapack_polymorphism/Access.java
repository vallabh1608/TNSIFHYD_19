package javapack_polymorphism;

public class Access {
	
	String name="vallabh"; 
	static int age=21;
	
	void display() {
		System.out.println("I can acces both Static & Instance members "+"AGE="+age+" , Name="+name);
	}
	static void print() {
		System.out.println("I can acces only Static members "+"AGE="+age);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Access a1 = new Access();
		a1.display();
		print();

	}

}
