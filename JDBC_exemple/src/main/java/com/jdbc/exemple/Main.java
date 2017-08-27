package com.jdbc.exemple;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/team_db";
		String username = "root";
		String password = "toor";
		
		Connection conn = null;
		
		try {
			
			
			conn = DriverManager.getConnection(url, username, password);
			System.out.println("Connection open");
			
			
			Statement st = conn.createStatement();
			st.execute("CREATE TABLE person (id int PRIMARY KEY AUTO_INCREMENT, name varchar(255))");
			st.executeUpdate("insert into person (name) values ('Ivan')");
			st.close();
			
			PreparedStatement ps = null;
			ps = conn.prepareStatement("insert into person (name) values (?)");
			ps.setString(1, "Ihor");
			ps.executeUpdate();
			ps.setString(1, "Bob");
			ps.executeUpdate();
			
			ps = conn.prepareStatement("select * from person");
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				System.out.println("Name " + rs.getString(2));
			}
			
			ps.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(conn != null){
				try {
					conn.close();
					System.out.println("Connection close");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

}
