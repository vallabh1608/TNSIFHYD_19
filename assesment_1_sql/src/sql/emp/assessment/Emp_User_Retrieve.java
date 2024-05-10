package sql.emp.assessment;
import java.sql.*;

class Emp_User_Retrieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dburl="jdbc:mysql://localhost:3306/sample";
		String username="root";
		String password="root";
		
		try(Connection conn=DriverManager.getConnection(dburl,username,password)) {
			
			
	
			String sql="SELECT * FROM employee";
			
			Statement statement=conn.createStatement();
			ResultSet result=statement.executeQuery(sql);
			
			int count=0;
			
			while(result.next()) {
				
				String name = result.getString("empname");
				Float salary=result.getFloat("empsalary");
				String email = result.getString("empemail");
				String output="employee #%d: %s - %f -%s \n";
				
				 System.out.printf(String.format(output,++count,name,salary,email));
				
			}
				
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
