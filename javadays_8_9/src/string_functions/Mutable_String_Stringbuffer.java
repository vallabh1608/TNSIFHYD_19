package string_functions;

public class Mutable_String_Stringbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s1=new StringBuffer("Hello");
		StringBuffer s2=new StringBuffer("hi");
		
		s1.append(" Coder");//to add another string at end of string using append
		s1.insert(5, " vallabh");//insert method used to insert another string in middle or end or start
		s1.replace(0, 5, "Namasthe");//by using replace method we can replace any string from main string as i replaced hello by Namsthe
		s1.delete(0, 8);//deletion from certain position to certain position in string as in delete namsthe from s1
		s2.reverse();//used to reverse the string 
		
		System.out.println(s1);//by using string_buffer we can make string mutable
		System.out.println(s2);

	}

}
