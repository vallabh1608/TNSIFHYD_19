package filehandling;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Read_File {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File myobj=new File("bharath.txt");
			
			Scanner myreader=new Scanner(myobj);
			while(myreader.hasNextLong()) {
				String data=myreader.nextLine();
				System.out.println(data);	
			}
			myreader.close();
			
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("Error occured");
			e.printStackTrace();
		}
		
		
	}

}
