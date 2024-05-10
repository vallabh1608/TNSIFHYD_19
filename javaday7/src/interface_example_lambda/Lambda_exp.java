package interface_example_lambda;

public class Lambda_exp {
	public static void main(String[] args) {
		bank kotak=()->{
			return 4.5f;
		};
		bank BOB=()->{
			return 2.7f;
		};
		System.out.println("Rate of Intrest of Kotak = "+kotak.ROI());
		System.out.println("Rate of Intrest of BOB = "+BOB.ROI());
	}

}
