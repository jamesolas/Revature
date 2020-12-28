package com.app.dao.impl;

import java.sql.Connection;
import java.sql.Date;
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
	public Player getPlayerByContact(long contact) throws BusinessException {
		Player player = null;
		try(Connection connection = PostresqlConnection.getConnection()){
			String sql="select player_id, player_name, points, dob, contact from test.player where contact=?";
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
				player.setContact(resultSet.getLong("contact"));
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

	@Override
	public List<Player> getPlayersByAge(int age) throws BusinessException {
		List<Player>playersList = new ArrayList<>();
		try(Connection connection = PostresqlConnection.getConnection()){
			String sql="select player_id, player_name, points, dob, contact, gender from test.player where age=?";
			PreparedStatement preparedStatement  = connection.prepareStatement(sql);
			preparedStatement.setInt(1, age);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()){
				Player player = new Player();
				player.setPlayer_id(resultSet.getInt("player_id"));
				player.setPlayer_name(resultSet.getString("player_name"));
				player.setPoints(resultSet.getInt("points"));
				player.setDob(resultSet.getDate("dob"));
				player.setContact(resultSet.getLong("contact"));
				player.setGender(resultSet.getString("gender"));
				playersList.add(player);
			}
			if(playersList.size()==0) {
				throw new BusinessException("No players found with age " + age);
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal error occured. Contact SYSADMIN.");
		}
		return playersList;
	}

	@Override
	public List<Player> getPlayersByGender(String gender) throws BusinessException {
		List<Player>playersList = new ArrayList<>();
		try(Connection connection = PostresqlConnection.getConnection()){
			String sql="select player_id, player_name, points, dob, contact, gender from test.player where gender=?";
			PreparedStatement preparedStatement  = connection.prepareStatement(sql);
			preparedStatement.setString(1, gender);
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next()){
				Player player = new Player();
				player.setContact(resultSet.getLong("contact"));
				player.setPlayer_id(resultSet.getInt("player_id"));
				player.setPlayer_name(resultSet.getString("player_name"));
				player.setPoints(resultSet.getInt("points"));
				player.setDob(resultSet.getDate("dob"));
				player.setContact(resultSet.getLong("contact"));
				playersList.add(player);
			}else {
				throw new BusinessException("No player found with gender "+gender);
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal error occured. Contact SYSADMIN.");
		}
		return playersList;
	}

	@Override
	public List<Player> getPlayersByTeamName(String team_Name) throws BusinessException {
		List<Player>playersList = new ArrayList<>();
		try(Connection connection = PostresqlConnection.getConnection()){
			String sql="select player_id, age, player_name, team_name, points, dob, contact from test.player where team_Name=?";
			PreparedStatement preparedStatement  = connection.prepareStatement(sql);
			preparedStatement.setString(1, team_Name);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()){
				Player player = new Player();
				player.setPlayer_id(resultSet.getInt("player_id"));
				player.setPlayer_name(resultSet.getString("player_name"));
				player.setAge(resultSet.getInt("age"));
				player.setPoints(resultSet.getInt("points"));
				player.setDob(resultSet.getDate("dob"));
				player.setContact(resultSet.getLong("contact"));
				playersList.add(player);
			}
			if(playersList.size()==0) {
				throw new BusinessException("No players found with Team name " + team_Name);
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal error occured. Contact SYSADMIN.");
		}
		return playersList;
	}

	@Override
	public List<Player> getPlayersByName(String player_name) throws BusinessException {
		List<Player>playersList = new ArrayList<>();
		try(Connection connection = PostresqlConnection.getConnection()){
			String sql="select player_id, age, player_name, team_name, points, dob, contact from test.player where player_name=?";
			PreparedStatement preparedStatement  = connection.prepareStatement(sql);
			preparedStatement.setString(1, player_name);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()){
				Player player = new Player();
				player.setPlayer_id(resultSet.getInt("player_id"));
				player.setAge(resultSet.getInt("age"));
				player.setPoints(resultSet.getInt("points"));
				player.setDob(resultSet.getDate("dob"));
				player.setContact(resultSet.getLong("contact"));
				playersList.add(player);
			}
			if(playersList.size()==0) {
				throw new BusinessException("No players found with player name " + player_name);
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal error occured. Contact SYSADMIN.");
		}
		return playersList;
	}

	@Override
	public List<Player> getPlayersByDob(String dob) throws BusinessException {
		List<Player>playersList = new ArrayList<>();
		try(Connection connection = PostresqlConnection.getConnection()){
			String sql="select player_id, age, player_name, team_name, points, dob, contact from test.player where dob=?";
			PreparedStatement preparedStatement  = connection.prepareStatement(sql);
			Player player = new Player();
			preparedStatement.setDate(1, new java.sql.Date(player.getDob().getTime()));
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()){
				
				player.setPlayer_id(resultSet.getInt("player_id"));
				player.setPlayer_name(resultSet.getString("player_name"));
				player.setAge(resultSet.getInt("age"));
				player.setPoints(resultSet.getInt("points"));
				//player.setDob(resultSet.getDate("dob"));
				player.setContact(resultSet.getLong("contact"));
				playersList.add(player);
			}
			if(playersList.size()==0) {
				throw new BusinessException("No players found with dob " + dob);
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal error occured. Contact SYSADMIN.");
		}
		return playersList;
	}

}
