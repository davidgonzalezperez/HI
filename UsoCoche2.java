package basico;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class UsoCoche2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		String url=("jdbc:mysql://localhost:3306/newone");
	    String user=("root");
	    String password=("");
		
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection connect = DriverManager.getConnection(url,user,password);
				
				PreparedStatement ps= connect.prepareStatement("insert into clientes(nombre, apellidos) values(?,?)");
			
				ps.setString(1, "1asdas3");
				ps.setString(2, "madrid");
				
				
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
		


