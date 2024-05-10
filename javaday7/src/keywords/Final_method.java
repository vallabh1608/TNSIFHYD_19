package keywords;

public class Final_method {
	final void add(int a,int b) {
		System.out.println("Addition ="+(a+b));
	}
	void add(int c,float d) {
		System.out.println("Addition ="+(c+d));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Final_method f1=new Final_method();
		f1.add(3, 2); //this method will be executed 
		f1.add(1, 9.8); //this method is not executed because as final keyword is used for method add so overloading is not possible

	}

}
