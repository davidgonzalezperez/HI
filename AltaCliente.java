package datos;

import java.io.IOException;
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
 * Servlet implementation class AltaCliente
 */
@WebServlet("/AltaCliente")
public class AltaCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AltaCliente() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		// TODO Auto-generated method stub
		String url=("jdbc:mysql://localhost:3306/tienda");
	    String user=("root");
	    String password=("");
		String nombre1 = request.getParameter("nombre");
		String ciudad1 = request.getParameter("ciudad");
		String telefono1 = request.getParameter("telefono");
		String mail1 = request.getParameter("email");
		

			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection connect = DriverManager.getConnection(url,user,password);
				
				PreparedStatement ps= connect.prepareStatement("insert into clientes(nombre, ciudad,telefono, mail) values(?,?,?,?)");
			
				ps.setString(1, nombre1);
				ps.setString(2, ciudad1);
				ps.setString(3, telefono1);
				ps.setString(4, mail1);
				
				ps.executeUpdate();
				
				System.out.println("Conseguido");
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		
		
		
		
		
	}

}
