package string_functions;

public class String_Concat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Vallabh"; //String creating by java String keyword
		String s2=new String("_Garini");
		s1.concat(s2);//String concatenation is not possible becoz string is immutable for s3
		//String is also called as final in java no body can change initialized string
		String s3=s1.concat(s2);//string concat is possible for this becoz we are storing result in another variable
		String s4=s1+s2;
	
		
		System.out.println("concated string using '+' operator="+s3);
		System.out.println("Concated String Using .Concat method="+s4);

	}

}
