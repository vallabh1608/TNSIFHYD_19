package scanner;
import java.util.Scanner;

public class Scanner_Approach2 {
 
   public int id;
   public String name;
   public float salary;
   
    public Scanner_Approach2(){
	  
	   
		Scanner input=new Scanner(System.in);

		System.out.println("Enter your details Here");
		System.out.print("Enter your ID:");
		this.id=input.nextInt();
		  input.nextLine();
		
		System.out.print("Enter your Name:");
		this.name=input.nextLine();
		
		System.out.print("Enter your Salary:");
		this.salary=input.nextFloat();
		
//		input.close();
	
	}
   public void getdata() {
	   System.out.println("------Your details are------");
	   System.out.println("ID="+id+"\nName="+name+"\nSalary="+salary);
	   
   }

}
