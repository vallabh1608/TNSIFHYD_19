package exception_handling;
import java.io.IOException;

public class Throws_ExceptionHandling {

	void m()throws IOException {
		throw new IOException("Device Error");
	}
	void n()throws IOException {
		m();
	}
	void p() {
		try {
			n();
		} catch (Exception e) {
			System.out.println("Exception handeled");
		}
	}
	public static void main(String[] args) {
		Throws_ExceptionHandling obj=new Throws_ExceptionHandling();
		obj.p();
		System.out.println("Normal flow..");
	}

}
