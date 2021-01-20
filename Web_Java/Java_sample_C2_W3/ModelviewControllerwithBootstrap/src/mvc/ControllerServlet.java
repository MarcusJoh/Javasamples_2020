package mvc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ControllerServlet
 */
@WebServlet("/ControllerServlet")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ControllerServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
		String username = request.getParameter("username");

		String password = request.getParameter("password");

		LoginBean bean = new LoginBean();

		bean.setName(username);
		bean.setPassword(password);
		
		request.setAttribute("bean", bean);
		
		boolean status = bean.validate();

		if (status) {

			RequestDispatcher rd = request.getRequestDispatcher("login-success.jsp");

			rd.forward(request, response);

		} else {

			RequestDispatcher rd = request.getRequestDispatcher("login-error.jsp");

			rd.forward(request, response);

		}

	
	}

}
