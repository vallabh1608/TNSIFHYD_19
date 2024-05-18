package exception_handling;

public class MutipleCatchBlock_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int a[]=new int[5];
			
			a[5]=10/0;
			
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
			
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			
		}catch (Exception e) {
			System.out.println("Execption");
		}

}

}
