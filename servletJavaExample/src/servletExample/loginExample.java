package servletExample;

import java.io.IOException;
import servletExample.jdbcLoginTable;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.util.ArrayList;

public class loginExample extends GenericServlet {

	@Override
	public void init(ServletConfig config) {
		// System.out.println("**********");
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
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
			
		}
		else {
			System.out.println("Credentials are not valid ");
		}
		
		
		

	}

}
