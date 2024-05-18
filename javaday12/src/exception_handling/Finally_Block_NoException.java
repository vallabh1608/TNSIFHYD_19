package exception_handling;

public class Finally_Block_NoException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int data=25/5;
			System.out.println(data);
		} catch (Exception e) {
			
			System.out.println(e);
		}
		finally {
			System.out.println("Finally block is Executed");
		}
		System.out.println("Rest of code..");

	}

}
