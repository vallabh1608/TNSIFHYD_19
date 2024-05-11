package string_functions;

public class Compare_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="java";
		String s2="sql";
		String s3="java";
		String s4=new String("java");
		
		System.out.println("comparision of string using '=='operator =>"+(s1==s2));
		System.out.println("comparision of string using .equals() method =>"+(s3.equals(s1)));
		System.out.println("comparision of string using compareTo() method =>"+(s1.compareTo(s2)));
		System.out.println("comparision of string using '=='operator =>"+(s4==s1));//as we know both contents
		// of s1 & s4 are same but we are getting false bcoz '=='will not consider inside content 
		//it considers references as s4 created by new keyword in new reference
		System.out.println("comparision of string using .equals() method =>"+(s3.equals(s4)));//here we get
		//true becoz equals method cares only about contentb inside
		System.out.println("comparision of string using compareTo() method =>"+(s4.compareTo(s1)));//same as equals 
		//only cares about content

	}

}
