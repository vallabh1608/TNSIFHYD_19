package interface_example_lambda;

interface bank {
	public float ROI();
	//This can also be called as functional interface becoz-
    //the interface class contains only one abstract method;
	//(which is one of the java8 feature)
//	public static void main(String[] args) {
//		bank kotak=()->{
//			return 4.5f;
//		};               
//		bank BOB=()->{
//			return 2.7f;
//		};
//		System.out.println("Rate of Intrest of Kotak = "+kotak.ROI());
//		System.out.println("Rate of Intrest of BOB = "+BOB.ROI());
	
	//(we have used lambda expression within same class but better to use in another main class to understand clearly)
//	}
}

