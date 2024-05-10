package op.cond.cont;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//unary_operator
		
		float a=20;
		int b=10;
	    int c=2;
		
		
		System.out.println("pre-Incremented a= "+(++a));//pre-incerement
		System.out.println("post-incremented b= "+b);
		System.out.println("Pre-decrementn a="+(--a));
		--b;//post-decrement
		System.out.println("Post-decrement b="+b);
		
		//Arithmetic operators
		
		System.out.println("Addition a+b = "+(a+b));
		System.out.println("Subtraction a-b = "+(a-b));
		System.out.println("Multiplication a*b = "+(a*b));
		System.out.println("Division a/b = "+(a/b));
		System.out.println("Modulus a%b = "+(a%b));
		System.out.println("Modulus a%b = "+(b%a));//O/P=> will be b 
		
		
		//Assignment operators
		
		System.out.println("Equal to assignment a= "+a);
		a+=5;
		System.out.println("add_equals to assignement a += "+a);
		b-=5;
		System.out.println("sub_equals to assignement b -= "+b);
		c*=2;
		System.out.println("mul_equals to assignment c *="+c);
		//...........
		
		
		//Shift operators
		
		System.out.println("Left shift c<<2 = "+(c<<2));
		System.out.println("Right shift b>>2 = "+(b>>2));
		
		
		//Relational operator
		
		System.out.println("Greater than a>b = "+(a>b));
		System.out.println("less than a>b = "+(a<b));
		System.out.println("Greater than or equals to c>=b = "+(c>=b));
		System.out.println("less than or equals to  a<=c = "+(a<=c));
		System.out.println("equals equals to b==c = "+(b==c));
		System.out.println("Not equals to  a!=b = "+(a!=b));
		
		//Bitwise operator
		
		int d=5;
		System.out.println("Bitwise AND a & c = "+(b&c));
		System.out.println("Bitwise OR a|b = "+(b|d));
		System.out.println("Bitwise OR a|b = "+(b^d));
		System.out.println("Bitwise Complement ~c = "+(~c));
		
		//logical operators
		
		
		System.out.println("Logical AND (a>0) && (b<0) = "+((a>0) && (b<0)));
		System.out.println("Logical OR (a>0) || (b<0)= "+((a>0) || (b<0)));
		System.out.println("Logical NOT  ! (c==4) = "+(! (c==4)));
		
		//Ternary operator
		
		float res=(a>b)?(a+b):(a-b);
		
		System.out.println("Ternary Result = "+res);
		
	}

}
