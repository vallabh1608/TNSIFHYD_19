package sql.emp.assessment;
import java.sql.*;

public class Emp_user_Manager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dburl="jdbc:mysql://localhost:3306/sample";
		String username="root";
		String password="root";
		
		try {
			Connection conn=DriverManager.getConnection(dburl,username,password);
			if(conn!=null) {
				System.out.println("Connected to database successfully");
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		

	}

}
