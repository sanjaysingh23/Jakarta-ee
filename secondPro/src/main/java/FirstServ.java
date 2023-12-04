

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import newpro.PojoClass;


/**
 * Servlet implementation class FirstServ
 */
public class FirstServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	PojoClass obj = new PojoClass();
	{
		System.out.println(obj.disp1());
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
