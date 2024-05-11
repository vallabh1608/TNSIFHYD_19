package string_functions;

public class String_Builder_Functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//we use stringbuilder becoz it is fast compared to string buffer interms of TIME COMPLEXITY
		
		StringBuilder s1=new StringBuilder("Hello");
		StringBuilder s2=new StringBuilder("morning");
		
		s1.append(" Coder");//to add another string at end of string using append
		s1.insert(5, " vallabh");//insert method used to insert another string in middle or end or start
		s1.replace(0, 5, "Namasthe");//by using replace method we can replace any string from main string as i replaced hello by Namsthe
		s1.delete(0, 8);//deletion from certain position to certain position in string as in delete namsthe from s1
		s2.reverse();//used to reverse the string 
		
		System.out.println(s1);//by using string_buffer we can make string mutable
		System.out.println(s2);

	}

}
