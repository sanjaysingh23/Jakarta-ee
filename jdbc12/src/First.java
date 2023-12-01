import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class First {
	public static void main(String args[]) 
	{
		String ss = "jdbc:mysql://localhost:3306/bit"; 
		try (Connection con = DriverManager.getConnection(ss,"root","(sanju*,99")){
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("Select * from student");
			while(rs.next()) {
				int roll_no = rs.getInt("roll_no");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				String address = rs.getString("address");
				System.out.println(roll_no+"   "+name+"   "+age+"   "+address);
			}
		}
		catch(Exception ee) {
			System.out.println(ee);
		}
	}
}
