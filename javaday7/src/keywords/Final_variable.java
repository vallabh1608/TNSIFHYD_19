package keywords;

public class Final_variable {
	final int a=20;
	
	int change() {
		a=20;  //Final_Key.a cannot be assigned
		return a;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Final_variable a1=new Final_variable();
		a1.change();  //Final_Key.a cannot be assigned

	}

}
