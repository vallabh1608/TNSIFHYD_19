package str.arr.com;

public class Array_2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=new int[2][2];
		
		a[0][0]=1;
		a[0][1]=2;
		a[1][0]=3;
		a[1][1]=4;
		
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.println("Element at a["+i+"]["+j+"] of a is "+a[i][j]);
			}
		}
		

	}

}
