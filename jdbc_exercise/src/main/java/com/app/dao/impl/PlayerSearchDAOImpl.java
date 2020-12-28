package com.app.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.app.dao.PlayerSearchDAO;
import com.app.dao.dbutil.PostresqlConnection;
import com.app.exception.BusinessException;
import com.app.model.Player;

public class PlayerSearchDAOImpl implements PlayerSearchDAO {

	@Override
	public Player getPlayerByContact(long contact) throws BusinessException {
		Player player = null;
		try(Connection connection = PostresqlConnection.getConnection()){
			String sql="select player_id, player_name, points, dob from test.player where contact=?";
			PreparedStatement preparedStatement  = connection.prepareStatement(sql);
			preparedStatement.setLong(1, contact);
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next()){
				player = new Player();
				player.setContact(contact);
				player.setPlayer_id(resultSet.getInt("player_id"));
				player.setPlayer_name(resultSet.getString("player_name"));
				player.setPoints(resultSet.getInt("points"));
				player.setDob(resultSet.getDate("dob"));
				
			}else {
				throw new BusinessException("No player found with contact "+contact);
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal error occured. Contact SYSADMIN.");
		}
			
			return player;
		}
		

	@Override
	public List<Player> getPlayersByGender(String gender) throws BusinessException {
		List<Player>playersList = new ArrayList<>();
		try(Connection connection = PostresqlConnection.getConnection()){
			String sql="select player_id, player_name, gender, points, dob, contact from test.player where gender=?";
			PreparedStatement preparedStatement  = connection.prepareStatement(sql);
			preparedStatement.setString(1, gender);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()){
				Player player = new Player();
				player.setPlayer_id(resultSet.getInt("player_id"));
				player.setPlayer_name(resultSet.getString("player_name"));
				player.setGender(gender);
				player.setPoints(resultSet.getInt("points"));
				player.setDob(resultSet.getDate("dob"));
				player.setContact(resultSet.getInt("contact"));
				playersList.add(player);
			}
				if(playersList.size() == 0) {
				throw new BusinessException("No player found with gender "+gender);
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal error occured. Contact SYSADMIN.");
		}
			return playersList;	
	}

	
	
}
