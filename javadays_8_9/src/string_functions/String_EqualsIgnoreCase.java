package string_functions;

public class String_EqualsIgnoreCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="tns.org";
		String s2="TNS.ORG";
		
		System.out.println(s1.equals(s2));//false :It compares strings with respective of case sensitivity
		System.out.println(s1.toUpperCase().equals(s2));//converting s1 into upper_case and using equals method
		System.out.println(s2.toLowerCase().equals(s1));//converting s2 to lower_case and using equals method
		System.out.println(s1.equalsIgnoreCase(s2));//true
		//It compares strings irrespective of case sensitivity
		

	}

}
