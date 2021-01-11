package post;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RunPost
 */
@WebServlet("/RunPost")
public class RunPost extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RunPost() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.print("<html><body>");
		out.print("<h3>Hello Servlet with POST</h3>");
		
		
		
		
		
		
		
		
		
		
		
		 
			String pass = request.getParameter("pass");
			out.print(pass);
			if (pass.equals("admin")) {
				out.print("<h3>Welcome in</h3>");

			
			}else {
				
				System.out.println("wrond pass");
				out.print("<h3>NOPE</h3>");
				//response.sendRedirect("index.jsp");
			}
		 
		 //methods works
			
			out.print("<p>");
			DoDog(out);
		 //have to send the printer with the method of to print HTML over there
			
			
			out.print("</p>");
			
			
			
			
			
			out.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	void DoDog (PrintWriter out){
		
		
		// classes work like normal 
		dog ebony = new dog("Ebony", "Cavalier", "Female", 14, 0,
				true, "Old and sleepy girl.");
		
		out.println(ebony.toString());
		out.println("Is she old? " + ebony.old());
		ebony.setHousetrained(false);
		out.println(ebony.toString());
		
	}

}
