
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import java.io.PrintWriter;

/**
 * Servlet implementation class smsLoginServlet
 */
@WebServlet("/smsLoginServlet")
public class smsLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// Step 1: Prepare list of variables used for database connections
	private String jdbcURL = "jdbc:mysql://localhost:3306/staffmanagement";
	private String jdbcUsername = "root";
	private String jdbcPassword = "password";
	

	
	String sql = "SELECT * FROM staffmanagement WHERE name = ? AND password = ? AND department = 'HR' ";

	// Step 3: Implement the getConnection method which facilitates connection to the database via JDBC

	protected Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return connection;
	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public smsLoginServlet() {
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
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		try (Connection connection = getConnection();

				// Step 5.1: Create a statement using connection object
				PreparedStatement preparedStatement = connection.prepareStatement(sql);) {
			
			//extraction from  JSP to get values
			String dbUsername = request.getParameter("username");
			String dbPassword = request.getParameter("password");
			//String Department = request.getParameter("department");

			preparedStatement.setString(1, dbUsername);
			preparedStatement.setString(2, dbPassword);
			
			// Execute the query or update query
			ResultSet rs = preparedStatement.executeQuery();
			// Process the ResultSet object.
			String name = "";
			String password = "";
			
			while (rs.next()) {
				 name = rs.getString("name");
				 password = rs.getString("password");
				 

			}

			PrintWriter writer = response.getWriter();
			if (dbUsername.equals(name) && dbPassword.equals(password)) {
				//writer.println("<h1> Login Successful </h1>");
				response.sendRedirect("http://localhost:8090/SMS/smsUserServlet/dashboard");
				// System.out.println(Username);
			} else {
				writer.println("<h1> Wrong Credentials provided </h1>");
			}
			writer.close();

		} catch (SQLException e) {
			System.out.println(e.getMessage());

		}
		doGet(request, response);
	}

}