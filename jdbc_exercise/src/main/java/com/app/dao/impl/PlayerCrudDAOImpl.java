package com.app.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.app.dao.PlayerCrudDAO;
import com.app.dao.dbutil.PostresqlConnection;
import com.app.exception.BusinessException;
import com.app.model.Player;

public class PlayerCrudDAOImpl implements PlayerCrudDAO{

	@Override
	public int createPlayer(Player player) throws BusinessException{
		int c = 0;
		try(Connection connection = PostresqlConnection.getConnection()){
			String sql = "insert into test.player(player_id, player_name, points, dob, contact, gender) values(?,?,?,?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, player.getPlayer_id());
			preparedStatement.setString(2, player.getPlayer_name());
			preparedStatement.setInt(3, player.getPoints()); 
			preparedStatement.setDate(4, new java.sql.Date (player.getDob().getTime())); //util.Date to sql.Date
			preparedStatement.setLong(5, player.getContact());
			preparedStatement.setString(6, player.getGender());
			preparedStatement.setInt(7, player.getAge());
		//	preparedStatement.setString(8, player.getTeam());
			
			c = preparedStatement.executeUpdate();
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal error occured. Contact SYSADMIN.");
		}
		return c;
	}

	@Override
	public void deletePlayer(int player_id) throws BusinessException{
		int c = 0;
		try(Connection connection = PostresqlConnection.getConnection()){
			String sql = "delete from test.player where player_id=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			Player player = new Player();
			preparedStatement.setInt(1, player_id);
			
			c=preparedStatement.executeUpdate();
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal error occured. Contact SYSADMIN.");
			}
	}

	@Override
	public int updatePlayerContact(int player_id, long contact) throws BusinessException {
		int c = 0;
		try(Connection connection = PostresqlConnection.getConnection()){
			String sql = "update test.player set contact=? where player_id=?"; 
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setLong(1, contact);
			preparedStatement.setInt(2, player_id);

			c = preparedStatement.executeUpdate();
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal error occured. Contact SYSADMIN.");
		}
		return c;
	}

	@Override
	public Player getPlayerById(int player_id) throws BusinessException {
	Player player = null;
	try(Connection connection = PostresqlConnection.getConnection()){
		String sql="select player_name, points, dob, contact from test.player where player_id=?";
		PreparedStatement preparedStatement  = connection.prepareStatement(sql);
		preparedStatement.setInt(1, player_id);
		ResultSet resultSet = preparedStatement.executeQuery();
		if(resultSet.next()){
			player = new Player();
			player.setPlayer_id(player_id);
			player.setPlayer_name(resultSet.getString("player_name"));
			player.setPoints(resultSet.getInt("points"));
			player.setDob(resultSet.getDate("dob"));
			player.setContact(resultSet.getLong("contact"));
		}else {
			throw new BusinessException("No player found with ID "+player_id);
		}
	} catch (ClassNotFoundException | SQLException e) {
		System.out.println(e);
		throw new BusinessException("Internal error occured. Contact SYSADMIN.");
	}
		
		return player;
	}

	@Override
	public List<Player> getAllPlayers() throws BusinessException {
		List<Player>playersList = new ArrayList<>();
		try(Connection connection = PostresqlConnection.getConnection()){
			String sql="select player_id, player_name, points, dob, contact from test.player";
			PreparedStatement preparedStatement  = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()){
				Player player = new Player();
				player.setPlayer_id(resultSet.getInt("player_id"));
				player.setPlayer_name(resultSet.getString("player_name"));
				player.setPoints(resultSet.getInt("points"));
				player.setDob(resultSet.getDate("dob"));
				player.setContact(resultSet.getLong("contact"));
				playersList.add(player);
			}
			if(playersList.size()==0) {
				throw new BusinessException("No players in the DB so far");
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal error occured. Contact SYSADMIN.");
		}
		return playersList;
	}

}
