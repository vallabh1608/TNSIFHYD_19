package str.arr.com;

public class Array_1D {
	public static void main(String_Example[] args) {
		int a[]=new int[5];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		for (int i : a) {
			System.out.println(a[i-1]);
		}//OR
		for(int i=0;i<=a.length-1;i++) {
			System.out.println(a[i]);
		}
		
	}

}
