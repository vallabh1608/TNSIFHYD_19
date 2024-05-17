package scanner;
import java.util.Scanner;

public class Scanner_nextInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter your ID:");
		int ID=input.nextInt();
		
		System.out.println(ID);
		input.close();
		
		

	}

}
