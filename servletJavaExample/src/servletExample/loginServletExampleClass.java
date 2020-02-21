package servletExample;



import servletExample.jdbcLoginTable;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class loginServletExampleClass extends HttpServlet{
	
	
	
	public void init(ServletConfig config) {
		
		
	}
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String name = req.getParameter("userName");
		String password = req.getParameter("password");
		
		
		jdbcLoginTable cd = new jdbcLoginTable();
		ArrayList<String> namePass = new ArrayList<String>();
		String name1 = " ";
		String password1 = " ";
		namePass = cd.CheckingUserInDatabase();
		name1 = namePass.get(0);
		password1 = namePass.get(1);
		
		
		if(name.equals(name1) && password.equals(password1))
		{
			System.out.println("Credentials are valid: " + "User-name: " + name + "Password: " + password);
			RequestDispatcher dis = req.getRequestDispatcher("Home.jsp");
			dis.forward(req, res);
		}
		else {
			System.out.println("Credentials are not valid ");
		}
		
		
		
	}
	
	
}
