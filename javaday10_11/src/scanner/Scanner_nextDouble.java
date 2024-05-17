package scanner;
import java.util.Scanner;

public class Scanner_nextDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input=new Scanner(System.in);
		
		System.out.print("Enter value:");
		Double value=input.nextDouble();
		
		System.out.println(value);
		input.close();
		

	}

}