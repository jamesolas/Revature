package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		//System.out.println("Hello World with Maven");
		
		Connection connection = null;
		try {
			//Step 1 - Load Driver
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver Loaded Successfully");
			
			//step 2 - open connection (url, username, password)
			String url="jdbc:postgresql://localhost:5432/postgres";
			String username="postgres";
			String password="waves";
			connection = DriverManager.getConnection(url, username, password);
			System.out.println("Connection Success");
			
			//step 3 - create statement
			Statement statement = connection.createStatement();
			String sql = "select player_id, player_name, team_id from test.player order by player_id desc";
			
			//step 4 - execute statement
			ResultSet resultSet=statement.executeQuery(sql);
			System.out.println("Query executed");
			
			//step 5 - Process Results
			while(resultSet.next()) {
				System.out.println("ID : " +resultSet.getInt("player_id"));
				System.out.println("Name : "+resultSet.getString("player_name"));
				System.out.println("Name : "+resultSet.getString("team_id"));
			}
				System.out.println("Results Processed");
				
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println(e);
		}finally {
			try {
				//step 6 - close connection
				connection.close();
					System.out.println("Connection closed");
			}catch(SQLException e){
				System.out.println(e);
			}
			}
		}
			
		
	

}
