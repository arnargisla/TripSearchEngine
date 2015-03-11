package tripsearchengine;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class TripSearch
 */
@WebServlet("/TripSearch")
public class TripSearch extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TripSearch() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String userName = request.getParameter("userName");

		HttpSession session = request.getSession();
		PrintWriter writer = response.getWriter();
		// Context er sameiginlegt fyrir alla
		ServletContext context = request.getServletContext();
		
		// put user name into session
		if(userName != "" && userName != null){
			// Geymir username í session
			session.setAttribute("savedUserName", userName);
		}
		writer.println("<html><body>");
		writer.println("max session timm" + session.getMaxInactiveInterval());
		writer.println(" elapsed time" + (session.getLastAccessedTime()-session.getCreationTime()));
		
		String destination = request.getParameter("destination");
		writer.println("Your destination is " + destination);
		writer.println("Your user name is " + ((String) session.getAttribute("savedUserName")));

		writer.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		String destination = request.getParameter("destination");
		String departure = request.getParameter("departure");
		String flightClass = request.getParameter("flightClass");
		writer.println("<html><body>");
		writer.println("You are departing from " + departure);
		writer.println("Your destination is " + destination);
		writer.println("You will fly in " + flightClass);
		writer.println("</body></html>");
	}

}
