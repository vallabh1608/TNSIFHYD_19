package string_functions;


public class String_Create {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="college"; //String creating by java String keyword
		char ch[]= {'S','T','U','D','E','T'};
		String s2=new String(ch); //converting char array to string 
		String s3=new String("ECE");
		s3.concat(s2);//String concatenation is not possible becoz string is immutable for s3
		//String is also called as final in java no body can change initialized string
		String S=s3.concat(s2);//string concat is possible for this becoz we are storing result in another variable
		
		System.out.println("S1= "+s1);
		System.out.println("S2= "+s2);
		System.out.println("S3= "+s3);
		System.out.println("concated string S="+S);
		System.out.println(s1==s2);//false
		System.out.println(s1.equals(S));//false
		//107 page next
		
		

	}

}
