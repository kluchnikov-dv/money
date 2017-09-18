package money.incexp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet; 
//Сначало надо к проекту подключить драйвер jdbc - для postgresql
//Project -> Properties -> JavaBuildPath -> Libraries -> AddExternalJars -> ищем драйвер jdbc 

public class WorkDB {
	
	WorkDB() {
		try{			
			Class.forName("org.postgresql.Driver");
			String url = "jdbc:postgresql://localhost:5432/money";
			String login = "pgmoney";
			String password = "pgmoney";			
			Connection connection = DriverManager.getConnection(url, login, password);	
			/*
			try {
				Statement stmt = connection.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT * FROM income");
				while (rs.next()) {					
					
					System.out.println(rs.getString("date") + rs.getString("amount") + rs.getString("comment") + rs.getString("type_income"));					
				}
			} finally {
				connection.close();
			}
			*/			
			System.out.println("БД подключена!");			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("БД не подключена!");
		}		
	}
}
