package exception_handling;

public class MutipleCatchBlock_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int a[]=new int[5];
			
			System.out.println(a[10]);
			
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
			
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			
		}catch (Exception e) {
			System.out.println("Execption");
		}
		System.out.println("Rest of Code..");


	}

}
