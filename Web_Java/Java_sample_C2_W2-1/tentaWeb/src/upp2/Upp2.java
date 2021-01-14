package upp2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Upp2
 */
@WebServlet("/Upp2")
public class Upp2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Upp2() {
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

		// min

		int listLength = Integer.parseInt(request.getParameter("length"));

		out.print("<ol>");

		String stuff = request.getParameter("stuff");
		for (int i = 0; i < listLength; i++) {

			out.print("<li>");

			out.print(stuff);
			out.print("</li>");

		}

		out.print("</ol>");

		// extra

		Enumeration<String> allParameters = request.getParameterNames();
		out.print("<ol>");
		while (allParameters.hasMoreElements()) {
			out.print("<li>");
			String paramName = allParameters.nextElement();
			out.print(paramName+" with the value: ");

			String[] paramValues = request.getParameterValues(paramName);

			for (int i = 0; i < paramValues.length; i++) {
				String paramValue = paramValues[i];
				out.print(paramValue);
				
			}
			out.print("</li>");
		}
		out.print("</ol>");

		out.close();

	}

}
