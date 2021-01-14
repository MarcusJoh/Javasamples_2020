package upp1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servlet
 */

//leave empty so make it into the index 
@WebServlet("/servlet")
public class Upp1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Upp1() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.print("<html><body>");

		// ?fname=John&lname=doe&country=usa

		String firstName = request.getParameter("fname");
		String lastName = request.getParameter("lname");

		String country = request.getParameter("country");

		out.print("<p>Hello! This is " + firstName + " " + lastName + ", from " + country);

		out.print("</body></html>");
		out.close();

	}

}
