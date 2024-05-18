package exception_handling;

public class MutipleCatchBlock_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			String name=null;
			
			System.out.println(name.length());
			
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
