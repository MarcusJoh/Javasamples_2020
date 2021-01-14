package upp3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Upp3
 */
@WebServlet("/Upp3")
public class Upp3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Upp3() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		// min
		PrintWriter out = response.getWriter();
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		response.setContentType("text/html");

		out.print("<html><body>");

		if (username.equals("Admin") && password.equals("password")) {
			out.print("<h3>Welcome!</h3>");
			out.print("<p>You are now logged in as " + username + "</p>");
		} else {
			out.print("<h3>Login failed</h3>");
			out.print("<p>Username or password invalid</p>");
		}

		// extra

		if (Passlog.checkPass(request.getParameter("password"))) {

			out.print("<p>You are now logged in as " + username + " a bit better</p>");
		}

		out.print("</body></html>");
		out.close();

	}

}
