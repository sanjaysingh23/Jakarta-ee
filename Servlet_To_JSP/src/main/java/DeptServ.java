

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeptServ
 */
public class DeptServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private Connection con;
	ArrayList<String> locList = new ArrayList<String>();
	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/bit";
			con=DriverManager.getConnection(url,"root","(sanju*,99");
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try
		{
			response.setContentType("text/html");
			PrintWriter pw = response.getWriter();
			
			PreparedStatement pst = con.prepareStatement("select loc from dept ");
			pst.executeQuery();
			 ResultSet rs = pst.executeQuery();

		        // Iterate through the result set and print the data
		        while (rs.next()) {
		            // Assuming you have columns named "column1" and "column2", replace them with your actual column names
					/*
					 * String name = rs.getString("name"); int age = rs.getInt("age"); String add =
					 * rs.getString("address");
					 * 
					 * // Print the data to the response
					 * pw.println("name:"+name+"    "+"age:"+age+"address:"+add +"<br>");
					 */
		            locList.add(rs.getString("loc"));
		            
		        }
		        // Don't forget to close the ResultSet and PreparedStatement
		        //pw.println(locList);
		        request.setAttribute("Location",locList);

		     // Get the RequestDispatcher object
		     RequestDispatcher rd = request.getRequestDispatcher("/Dept.jsp");

		     // Forward the request and response to the destination resource
		     rd.forward(request, response);
		        
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
