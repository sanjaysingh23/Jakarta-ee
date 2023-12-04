

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mypro.BeanClass;

import java.io.IOException;

/**
 * Servlet implementation class SecondServ
 */
public class SecondServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
	BeanClass obj1 = new BeanClass();
	{
		System.out.println(obj1.disp1());
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
