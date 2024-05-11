package string_functions;

public class Performancetest_Sbuffer_Sbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime=System.currentTimeMillis();
		StringBuffer s1=new StringBuffer("Vallabh");
		
		for(int i=0;i<=10000;i++) {
			s1.append("Garini");	
		}
		System.out.println("Time taken by StringBuffer is "+(System.currentTimeMillis() - startTime)+"ms");
		
		startTime=System.currentTimeMillis();
		StringBuilder s2=new StringBuilder("Vallabh");
		
		for(int i=0;i<=10000;i++) {
			s2.append("Garini");	
		}
		System.out.println("Time taken by StringBuilder is "+(System.currentTimeMillis() - startTime)+"ms");
		//Time taken by StringBuffer is 2ms
		//Time taken by StringBuilder is 0ms

	}

}
