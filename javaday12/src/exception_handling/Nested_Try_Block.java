package exception_handling;

public class Nested_Try_Block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			try {
				System.out.println("Going to divide");
				int b=19/0;
			} catch (ArithmeticException e) {
				System.out.println(e);
			}
			try {
				int arr[]=new int[5];
				arr[5]=6;
				
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
			System.out.println("Other Statement");
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception Handeled");
		}
		System.out.println("Normal flow..");

	}

}
