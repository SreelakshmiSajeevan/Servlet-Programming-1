package mypack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	/*
	 * protected void doGet(HttpServletRequest request, HttpServletResponse
	 * response) throws ServletException, IOException { // TODO Auto-generated
	 * method stub
	 * response.getWriter().append("Served at: ").append(request.getContextPath());
	 * }
	 */
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated m
		response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();  
        
	    String n=request.getParameter("userName");  
	    String p=request.getParameter("userPass");  
	          
	    if(p.equals("123456")){  
	        RequestDispatcher rd=request.getRequestDispatcher("WelcomeServlet");  
	        rd.forward(request, response);  
	    }  
	    else{  
	        out.print("Sorry UserName or Password Error!");  
	        RequestDispatcher rd=request.getRequestDispatcher("/login.html");  
	        rd.include(request, response);  
	                      
	        }  
	    }  
	

}
