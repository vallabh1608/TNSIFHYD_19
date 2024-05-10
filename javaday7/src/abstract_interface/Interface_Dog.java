package abstract_interface;

public class Interface_Dog implements Interface_Pet{
	public void test() {
		System.out.println("Interface method implements");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface_Pet p1=new Interface_Dog();
		p1.test();
	}

}
