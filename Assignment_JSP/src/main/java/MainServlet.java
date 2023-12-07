

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MainServlet
 */
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String name=request.getParameter("name");
		String password=request.getParameter("pass");
		if("scott".equals(name) && "tiger".equals(password)) {
			request.setAttribute("Name",name);
			request.setAttribute("Password",password);
			pw.println(name+" "+password);
		     // Get the RequestDispatcher object
		     RequestDispatcher rd = request.getRequestDispatcher("/Index.jsp");

		     // Forward the request and response to the destination resource
		     rd.forward(request, response);
		}
		else {
			RequestDispatcher rd = request.getRequestDispatcher("/Home.html");

		     // Forward the request and response to the destination resource
		     rd.forward(request, response);
		}
	}

}
