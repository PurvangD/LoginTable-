package servletExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class jdbcLoginTable {
	
	
	
	public ArrayList<String> CheckingUserInDatabase() {
		ArrayList<String> returnValues = new ArrayList<String>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys", "root", "#####");
		
			Statement st = con.createStatement();
			ResultSet rs1 = st.executeQuery("Select Username,Password from loginTable");
			
			while(rs1.next()) {
				String nameDb = rs1.getString(1);
				String PasswordDb = rs1.getString(2);
				returnValues.add(nameDb);
				returnValues.add(PasswordDb);
			}
			
			
			
//			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return returnValues;
	}
		
}
