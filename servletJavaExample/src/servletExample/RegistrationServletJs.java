package servletExample;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationServletJs
 */
@WebServlet("/RegistrationServletJs")
public class RegistrationServletJs extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationServletJs() {
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
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
		PrintWriter pw= resp.getWriter();
		resp.setContentType("text/html");
		
	
		
		String firstName = req.getParameter("First Name").toString();
		String lastName = req.getParameter("Last Name").toString();
		String Dob = req.getParameter("date").toString();
		String Address = req.getParameter("Address").toString();
		String phone = req.getParameter("Number").toString();
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys", "root", "ThisIsMe23@");
			
			PreparedStatement ps = con.prepareStatement("insert into tb_customer (FirstName, LastName, Dob, Address, Phone) values(?,?,?,?,?)") ;
			ps.setString(1, firstName);
			ps.setString(2, lastName);
			ps.setString(3, Dob);
			ps.setString(4, Address);
			ps.setString(5, phone);
			int rs = ps.executeUpdate();
			
			System.out.println("Registration Successfully");
			
		}
		
	
			catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

}
}
