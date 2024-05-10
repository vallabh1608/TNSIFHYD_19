package sql.emp.assessment;
import java.sql.*;

public class Employee_User_Delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dbURL = "jdbc:mysql://localhost:3306/sample";
		String username = "root";
		String password = "root";
		
		try {
			Connection conn=DriverManager.getConnection(dbURL,username,password);
			 String sql = "DELETE FROM employee WHERE empname=?";
			 
			 PreparedStatement statement = conn.prepareStatement(sql);
			 statement.setString(1, "venkatram");
			 
			 int rowsDeleted = statement.executeUpdate();
			    if (rowsDeleted > 0) {
			        System.out.println("A user was deleted successfully!");
			    }
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
