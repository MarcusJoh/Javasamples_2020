package apiTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

/**
 * Servlet implementation class OpenWeather
 */
@WebServlet("/OpenWeather")
public class OpenWeather extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	// public String URL = "http://api.openweathermap.org/data/2.5/weather?q=malmö,se&APPID=099eff339f56d6a29a9823857b2f2671&mode=xml";

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OpenWeather() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		
		// Check if the right info got sent
				response.setContentType("text/html");
				PrintWriter out = response.getWriter();
				String cityStr = request.getParameter("city");
				out.print("<br>");
				out.print("City= " + cityStr);

				out.print("<br>");

				String countryStr = request.getParameter("country");
				out.print("Country= " + countryStr);
				out.print("<br>");

				// Build the API call by adding city+country into a URL
				String URLtoSend = "http://api.openweathermap.org/data/2.5/weather?q=" + cityStr + "," + countryStr
						+ "&APPID=099eff339f56d6a29a9823857b2f2671&mode=xml";

				System.out.println(URLtoSend);

				// Set the URL that will be sent
				URL line_api_url = new URL(URLtoSend);

				// Create a HTTP connection to sent the GET request over
				HttpURLConnection linec = (HttpURLConnection) line_api_url.openConnection();
				linec.setDoInput(true);
				linec.setDoOutput(true);
				linec.setRequestMethod("GET");

				// Make a Buffer to read the response from the API
				BufferedReader in = new BufferedReader(new InputStreamReader(linec.getInputStream()));

				// a String to temp save each line in the response
				String inputLine;

				// a String to save the full response to use later
				String ApiResponse = "";

				// loop through the whole response
				while ((inputLine = in.readLine()) != null) {
					
					//System.out.println(inputLine);
					// Save the temp line into the full response
					ApiResponse += inputLine;
				}
				in.close();
				System.out.println(ApiResponse);
				
				
				//Call a method to make a XMLdoc out of the full response
				Document doc = convertStringToXMLDocument(ApiResponse);

				
				//normalize the XML response
				doc.getDocumentElement().normalize();
				// check that the XML response is OK by getting the Root element 
				System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

				// Create a Node list that gets everything in and under the "clouds" tag  
				NodeList nList = doc.getElementsByTagName("clouds");
				
				// loop through the content of the tag
				for (int temp = 0; temp < nList.getLength(); temp++) {
					// Save a node of the current list id 
					Node node = nList.item(temp);
					if (node.getNodeType() == Node.ELEMENT_NODE) {

						// set the current node as an Element
						Element eElement = (Element) node;
						// get the content of an attribute in element
						// and print it out to the client 
						out.print("The weather " + cityStr + " is now a " + eElement.getAttribute("name"));

					}
				}

		
		
		
		
		
		
		
		
		
		
		
	}



	// Method the makes a XML doc out of a string, if it is in a XML format. 	
		private static Document convertStringToXMLDocument(String xmlString) {
			// Parser that produces DOM object trees from XML content
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

			// API to obtain DOM Document instance
			DocumentBuilder builder = null;
			try {
				// Create DocumentBuilder with default configuration
				builder = factory.newDocumentBuilder();

				// Parse the content to Document object
				Document doc = builder.parse(new InputSource(new StringReader(xmlString)));
				return doc;
			} catch (Exception e) {
				e.printStackTrace();
			}
			return null;
		}

}
