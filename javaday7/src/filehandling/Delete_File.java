package filehandling;
import java.io.File;

public class Delete_File {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File myobj=new File("bharat.txt");
			if(myobj.delete()) {
				System.out.println("Successfully deleted file.");
			}
			else {
				System.out.println("Failed to delete.");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		

	}

}
