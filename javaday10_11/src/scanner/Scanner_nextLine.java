package scanner;

import java.util.Scanner;

public class Scanner_nextLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter your name:");
		String name=input.nextLine();
		System.out.println(name);
		input.close();


	}

}
