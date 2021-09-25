package exec2.part1;

import javax.servlet.http.*;
import java.io.*;

public class FirstServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		PrintWriter out = response.getWriter();
		java.util.Date today = new java.util.Date();
		out.println("<html> " + "<body>"
				+ "<h1 align=center>My First Servlet</h1>" + "<br>"
				+ today + "</body>" + "</html>");
	}
}