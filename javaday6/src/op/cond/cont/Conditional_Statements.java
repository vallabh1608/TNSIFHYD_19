package op.cond.cont;

import java.util.Scanner;

public class Conditional_Statements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Apple";
		String s2="Orange";
		// if()
		if(s1!=s2) {
			System.out.println("s1 & s2 Not same");
			
		}
		
		//if-else
		
		int s3=5;
		int s4=9;
		
		if(s3>s4){
			System.out.println("s3 greater than s4");
			
		}else {
			System.out.println("s3 less than s4");
			
		}
		
		//if-else-if
		
		int time=4;
		
		if(time<12) {
			System.out.println("Good Morning !");	
		}
		else if(time<18) {
			System.out.println("Good Afternoon !");	
		}
		else {
			System.out.println("Good evening !");
			
		}
		
		//Switch case()
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your Choice ch : ");
		int ch=sc.nextInt();
		
		switch(ch) {
		case 1: System.out.println("Python");
		break;
		 
		case 2: System.out.println("Java");
		break;
		
		case 3:System.out.println("Sql");
		break;
		
		case 4:System.out.println("Dbms");
		break;
		
		case 5:System.out.println("Html , Css & Javascript");
		break;
		
		default : System.out.println("Invalid input");
	
		
	    }
		

	}

}
