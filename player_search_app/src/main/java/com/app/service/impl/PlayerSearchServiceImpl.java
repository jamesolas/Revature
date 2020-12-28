package com.app.service.impl;

import java.util.Date;
import java.util.List;

import com.app.dao.PlayerSearchDAO;
import com.app.dao.impl.PlayerSearchDAOImpl;
import com.app.exception.BusinessException;
import com.app.model.Player;
import com.app.service.PlayerSearchService;

public class PlayerSearchServiceImpl implements PlayerSearchService {

	private PlayerSearchDAO playerSearchDAO = new PlayerSearchDAOImpl();
	
	@Override
	public Player getPlayerById(int player_id) throws BusinessException {
		Player player = null;
		if(player_id > 0 && player_id <1000) {
			//code here for DAO
			player = playerSearchDAO.getPlayerById(player_id);
		}else {
			throw new BusinessException("Entered player ID " + player_id + " is invalid.");
		}
		return player;
	}

	@Override
	public Player getPlayerByContact(long contact) throws BusinessException {
		Player player = null;
		if(contact > 0 && contact <99999999999L) {
			//code here for DAO
			player = playerSearchDAO.getPlayerByContact(contact);
		}else {
			throw new BusinessException("Entered player contact " + contact + " is invalid.");
		}
		return player;
	}

	@Override
	public List<Player> getAllPlayers() throws BusinessException {
		List<Player> allPlayersList = null;
		allPlayersList = playerSearchDAO.getAllPlayers();
		return allPlayersList;
	}

	@Override
	public List<Player> getPlayersByAge(int age) throws BusinessException {
		List<Player> agePlayersList = null;
		if(age > 0 && age <100) {
			//code here for DAO
			agePlayersList = playerSearchDAO.getPlayersByAge(age);
		}else {
			throw new BusinessException("Entered player age " + age + " is invalid.");
		}
		return agePlayersList;
	}

	@Override
	public List<Player> getPlayersByGender(String gender) throws BusinessException {
		List<Player> genderPlayersList = null;
		if(gender != null) {
			//code here for DAO
			genderPlayersList = playerSearchDAO.getPlayersByGender(gender);
		}else {
			throw new BusinessException("Entered player gender " + gender + " is invalid.");
		}
		return genderPlayersList;
	}

	@Override
	public List<Player> getPlayersByTeamName(String team_Name) throws BusinessException {
		List<Player> teamPlayersList=null;
		if(team_Name!=null && team_Name.matches("[a-zA-Z]{5,20}")) {
			teamPlayersList=playerSearchDAO.getPlayersByTeamName(team_Name);
		}else {
			throw new BusinessException("Entered TeamName "+team_Name+" is INVALID");
		}
		return teamPlayersList;
	}

	@Override
	public List<Player> getPlayersByName(String player_name) throws BusinessException {
		List<Player> namePlayersList=null;
		if(player_name != null && player_name.matches("[a-zA-Z]{5,20}")) {
			namePlayersList=playerSearchDAO.getPlayersByName(player_name);
		}else {
			throw new BusinessException("Entered player name "+player_name+" is INVALID");
		}
		return namePlayersList;
	}

	@Override
	public List<Player> getPlayersByDob(String dob) throws BusinessException {
		List<Player> dobPlayersList=null;
		if(dob != null && dob.matches("[0-9]{4}-[0-9]{2}-[0-9]{2}")) {
			dobPlayersList=playerSearchDAO.getPlayersByDob(dob);
		}else {
			throw new BusinessException("Entered dob "+dob+" is INVALID");
		}
		return dobPlayersList;
	}

}
