package sql.emp.assessment;
import java.sql.*;

public class Emp_User_Update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dbURL = "jdbc:mysql://localhost:3306/sample";
		String username = "root";
		String password = "root";
		
		try {
			Connection conn=DriverManager.getConnection(dbURL,username,password);
			
			String sql = "UPDATE employee SET empsalary=?,  empemail=? WHERE empname=?";
			
			 PreparedStatement statement = conn.prepareStatement(sql);
			 statement.setFloat(1, 70000);
			 statement.setString(2, "nagesh@microsoft.com");
			 statement.setString(3, "nagesh");
			 
			 int rowsUpdated = statement.executeUpdate();
			    if (rowsUpdated > 0) {
			        System.out.println("An existing user was updated successfully!");
			    }
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
