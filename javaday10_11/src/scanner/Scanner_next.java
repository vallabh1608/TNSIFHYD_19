package scanner;
import java.util.Scanner;

public class Scanner_next {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
		
		System.out.print("Enter value:");
		String value=input.next();
		
		System.out.println(value);
		input.close();
		

	}

}
