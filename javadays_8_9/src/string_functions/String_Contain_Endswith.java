package string_functions;

public class String_Contain_Endswith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text="I know better than you";
		
		//contains() method
		
		System.out.println("contains="+text.contains("better"));//true
		System.out.println("contains="+text.contains("I"));//true
		System.out.println("contains="+text.contains("hi"));//false
		
		//endswith() method
		
		System.out.println("endswith()="+text.endsWith("you"));//true
		System.out.println("endswith()="+text.endsWith("u"));//true
		System.out.println("endswith()="+text.endsWith("n"));//false

	}

}
