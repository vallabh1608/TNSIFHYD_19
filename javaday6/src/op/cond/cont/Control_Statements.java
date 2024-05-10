package op.cond.cont;

public class Control_Statements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//for loop
		int sum=0;
		
		for(int i=1;i<=10;i++) {
			sum+=i;

		}
		System.out.println("Sum of first 10 Natural numbers = "+sum);
		
		
		// for each
		
		
		String names[]={"vallabh","dhoni","virat","ravan","sai"};
		
		for(String name:names) {
			System.out.println(name);
			
		}
		
		//while loop
		
		
		int i=0;
		
		while(i<5) {
			System.out.println("Hello World !");
			i++;
		}
		
		
		
		//do-while loop
		
		int j=0;
		
		do {
			System.out.println("Hi vallabh!");
			j++;
			
		}while(j<=5);
		
		
		
		
		

	}

}
