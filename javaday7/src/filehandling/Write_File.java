package filehandling;
import java.io.FileWriter;
import java.io.IOException;


public class Write_File {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter mywriter=new FileWriter("bharat.txt");
			mywriter.write("This summer is too hot compared to last year");
			mywriter.close();
			System.out.println("Successfully wrote to bharath.txt");
			
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("Error occured");
			e.printStackTrace();
		}
		

	}

}
