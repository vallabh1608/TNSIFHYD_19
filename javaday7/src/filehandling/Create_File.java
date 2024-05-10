package filehandling;
import java.io.File;
import java.io.IOException;

public class Create_File {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File myobj=new File("bharath.txt");
			if(myobj.createNewFile()) {
				System.out.println(myobj.getName()+" Created");
			}
			else {
				System.out.println("File already exists..");
			}
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("An error occured");
			e.printStackTrace();
		}	
	}

}
