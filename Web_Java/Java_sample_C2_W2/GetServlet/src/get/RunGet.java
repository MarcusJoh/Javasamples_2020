package get;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RunGet
 */
@WebServlet("/RunGet")
public class RunGet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RunGet() {
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
		//response.getWriter().append("Served at: ").append(request.getContextPath());

		
		// response is what we send back
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.print("<html><body>");
		out.print("<h3>Hello Servlet</h3>");
		
		

		 out.print("<img src=\"1.png\">");
		
		
		
		 for (int i = 1; i <= 2; i++) {
				out.print("<img src=\"" + i + ".png\">");

			}

		//request has the info
		 //EX
		 
			String img = request.getParameter("img");
			out.print(img);
			if (img.equals("1")) {
				out.print("<img src=\"1.png\">");

			} else if (img.equals("2")) {
				out.print("<img src=\"2.png\">");
			}else {
				
				out.print("<h3>No image like that</h3>");
			}
		 
		 
		 
			out.close();
		 
		 
		

	}

}
