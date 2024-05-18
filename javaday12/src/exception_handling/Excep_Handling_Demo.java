package exception_handling;

public class Excep_Handling_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			//code that may raise exception
			int a=10/0;
			
			
		} catch (ArithmeticException e) {
			System.out.println(e);
			
		}
		System.out.println("Rest of Code....");

	}

}
