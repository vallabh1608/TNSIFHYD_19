package wrapper_autobox_unbox;

public class Unboxing_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer aobj=20;
		Double bobj=67.34;
		Integer cobj=Integer.valueOf(90);//initialization can be done like this also
		
		
		int a=aobj.intValue();  //coverting objects into primitive datatypes
		Double b=bobj;   //coverting objects into primitive datatypes
		int c=cobj;
		System.out.println("a="+a+"\nb="+b+"\nc="+c);
	

	}

}
