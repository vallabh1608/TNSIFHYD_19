package sql.emp.assessment;
import java.sql.*;

public class Emp_Users_Insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dburl="jdbc:mysql://localhost:3306/sample";
		String username="root";
		String password="root";
		
		try {
			Connection conn=DriverManager.getConnection(dburl,username,password);
			
		    String sql="INSERT INTO employee (empname, empsalary, empemail) VALUES( ? , ? , ? )";
		    
			PreparedStatement statement=conn.prepareStatement(sql);
			
			statement.setString(1, "Nagesh");
			statement.setFloat(2, 50012.89f);
			statement.setString(3, "mjpnagesh@gmail.com");
			
			statement.addBatch();
			
			statement.setString(1, "Chaitanya");
			statement.setFloat(2, 65003.23f);
			statement.setString(3, "karlichaitanya@gmail.com");
			
			statement.addBatch();
			
			statement.setString(1, "Venkatram");
			statement.setFloat(2, 45900.00f);
			statement.setString(3, "venkatramkrishna@gmail.com");
			
			statement.addBatch();
			
			statement.setString(1, "Vallabh");
			statement.setFloat(1, 60530.13f);
			statement.setString(1, "vallabhkumargarina16@gmail.com");
			
			statement.addBatch();
			
			if(statement.executeBatch() != null) {
				System.out.println("Interted 4 records");
			}
				
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
