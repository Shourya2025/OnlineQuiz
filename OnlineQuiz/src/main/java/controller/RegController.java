package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import model.RegModel;

/**
 * Servlet implementation class RegController
 */
@WebServlet("/RegController")
public class RegController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		doGet(request, response);
		
		String name = request.getParameter("t1");
		String email = request.getParameter("t2");
		String mobile = request.getParameter("t3");
		String pass = request.getParameter("t4");
		
		try
		{
			RegModel r = new RegModel(name, email, mobile, pass);
			boolean chk = r.createUser();
			if(chk==true)
			{
				//out.println("user created....");
				
			HttpSession session = request.getSession();
			session.setAttribute("name", name);
			session.setAttribute("email", email);
			response.sendRedirect("Welcome.jsp");
			
				
			}
		}
		catch(Exception ex)
		{
			out.println(ex);
		}
		
		
		
		
		
	}

}
