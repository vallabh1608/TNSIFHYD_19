package exception_handling;


public class Throw_Exception {

	static void Validate(int age) {
		if(age<18) {
			throw new ArithmeticException("Not Valid");
	    }
		else {
			System.out.println("welcome to vote");
		}
	}
}