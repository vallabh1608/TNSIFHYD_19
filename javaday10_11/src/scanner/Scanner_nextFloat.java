package scanner;
import java.util.Scanner;

public class Scanner_nextFloat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input=new Scanner(System.in);
		
		System.out.print("Enter your salary:");
		Float salary=input.nextFloat();
		
		System.out.println(salary);
		input.close();
		

	}

}
