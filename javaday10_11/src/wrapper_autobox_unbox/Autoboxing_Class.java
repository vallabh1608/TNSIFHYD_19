package wrapper_autobox_unbox;

public class Autoboxing_Class {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=6;
		double b=2.45;
		int c=89;
		
		//converting primitive datatypes into objects
		
		Integer aobj=Integer.valueOf(a);
		Double bobj=Double.valueOf(b);
		Integer cob=c; //we can create objects like this also
		Boolean dobj=true; //we can create objects like this also
		
		if(aobj instanceof Integer) {
			System.out.println("Integer obj is created");
			
		}
		if(bobj instanceof Double) {
			System.out.println("Double obj is created");
			
		}

	}

}
