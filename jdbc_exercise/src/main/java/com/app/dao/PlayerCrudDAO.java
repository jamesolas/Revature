package com.app.dao;

import java.util.List;

import com.app.exception.BusinessException;
import com.app.model.Player;

public interface PlayerCrudDAO {
	public int createPlayer(Player player) throws BusinessException;
	public void deletePlayer(int player_id) throws BusinessException;
	public int updatePlayerContact(int player_id, long Contact) throws BusinessException;
	public Player getPlayerById(int player_id) throws BusinessException;
	public List<Player>getAllPlayers() throws BusinessException;

}
