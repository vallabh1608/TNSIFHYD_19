package exception_handling;

public class Finally_Block_ExceptionNotHandleed {

	public static void main(String[] args) {
		
		//In any case finally block is executed
		try {
			int data=25/0;
			System.out.println(data);
		} catch (NullPointerException e) {
			
			System.out.println(e);
		}
		finally {
			System.out.println("Finally block is Executed");
		}
		System.out.println("Rest of code..");

	}

}
