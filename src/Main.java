import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String [] args) {
		//new Login();
		
		new Demo();
		/*String jdbcUrl = "jdbc:sqlite:projet.db";
		try {
			Connection connection = DriverManager.getConnection(jdbcUrl);
			String sql = "select * from secretaire;";
			
			Statement statement = connection.createStatement();
			ResultSet result = statement.executeQuery(sql);
			while(result.next()) {
				System.out.println(result.getString("prenom"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}*/
	}

}
