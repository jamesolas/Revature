package com.app.service;

import java.util.Date;
import java.util.List;

import com.app.exception.BusinessException;
import com.app.model.Player;

public interface PlayerSearchService {
	
	public Player getPlayerById(int player_id) throws BusinessException;
	public Player getPlayerByContact(long contact) throws BusinessException;
	public List<Player> getAllPlayers() throws BusinessException;
	public List<Player> getPlayersByAge(int age) throws BusinessException;
	public List<Player> getPlayersByGender(String gender) throws BusinessException;
	public List<Player> getPlayersByTeamName(String team_Name) throws BusinessException;
	public List<Player> getPlayersByName(String player_name) throws BusinessException;
	public List<Player> getPlayersByDob(String dob) throws BusinessException;
}
