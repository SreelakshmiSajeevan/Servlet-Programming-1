package mypack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Register() {
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
		// response.getWriter().append("Served at: ").append(request.getContextPath());

		response.setContentType("text/html");
		PrintWriter printWriter = response.getWriter();
		
		String firstname = request.getParameter("firstname");
		String middlename = request.getParameter("middlename");
		String lastname = request.getParameter("lastname");
		String course = request.getParameter("course");
		String gender = request.getParameter("gender");
		String countrycode = request.getParameter("countrycode");
		String phone = request.getParameter("phone");
		String address = request.getParameter("address");
		String email = request.getParameter("email");
		String psw = request.getParameter("psw");
		String psw_repeat = request.getParameter("psw_repeat");
		printWriter.println("<h2>");

		printWriter.println("First Name " + firstname);
		printWriter.println("<br>");

		printWriter.println("Middle Name " + middlename);
		printWriter.println("<br>");

		printWriter.println("Course " + course);
		printWriter.println("<br>");

		printWriter.println("Gender " + gender);
		printWriter.println("<br>");

		printWriter.println("Phone " + countrycode + "" + phone);
		printWriter.println("<br>");

		printWriter.println("Address " + address);
		printWriter.println("<br>");

		printWriter.println("Email " + email);
		printWriter.println("</h2>");

		printWriter.close();

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException { // TODO Auto-generated
		doGet(request, response);
	}

}
