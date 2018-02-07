package basico;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Usocoche extends coche{

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.jdbc.Driver");
		String url=("jdbc:mysql://localhost:3306/ejercicio");
		String user="root";
		String pass="";
		
		Connection conn = DriverManager.getConnection(url, user, pass);
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT *  FROM clientes ");

		while (rs.next()) {

		String name = rs.getString("nombre");

		String price = rs.getString("direccion");

		System.out.println(name + "\t" + price);
		System.out.println(ruedas);
		
		

}
		rs.close();



		stmt.close();





		conn.close();
}
}	
