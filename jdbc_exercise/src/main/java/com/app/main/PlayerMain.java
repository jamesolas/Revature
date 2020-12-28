package com.app.main;

import java.util.Date;
import java.util.List;

import com.app.dao.impl.PlayerCrudDAOImpl;
import com.app.dao.impl.PlayerSearchDAOImpl;
import com.app.exception.BusinessException;
import com.app.model.Player;

public class PlayerMain {

	public static void main(String[] args) {
		PlayerCrudDAOImpl dao = new PlayerCrudDAOImpl();
		PlayerSearchDAOImpl dao1 = new PlayerSearchDAOImpl();
		
//		Player p = new Player(108, "Eric", 55, new Date(), 1234567901L, "M", 0, "Bulls");
//		
//		try {
//			if(dao.createPlayer(p) != 0) {
//				System.out.println("Player created successfully.");
//				
//			}
//		} catch (BusinessException e) {
//			System.out.println(e.getMessage());
//		}
//	}
//	
//	try {
//		Player player = dao.getPlayerById(1);
//		if(player != null) {
//			System.out.println("Details of player "+player.getPlayer_id());
//			System.out.println(player);
//		}
//	} catch (BusinessException e) {
//		System.out.println(e);
//	}
//		
//	try {
//		List<Player> playerList = dao.getAllPlayers();
//		if(playerList != null && playerList.size() != 0) {
//				System.out.println("\n\nFound " + playerList.size() + " no of players in DB... Printing them all");
//				for(Player p:playerList) {
//					System.out.println(p);
//				}
//			}
//		} catch (BusinessException e) {
//			System.out.println(e.getMessage());		
//			}
	
//	try {
//		Player player = dao1.getPlayerByContact(1234567901);
//		if(player != null) {
//			System.out.println("Details of player "+player.getContact());
//			System.out.println(player);
//		}
//	} catch (BusinessException e) {
//		System.out.println(e);
//	}
	
//	try {
//		List<Player>playersList = dao1.getPlayersByGender("M");
//		if(playersList != null) {
//			System.out.println("\n\nFound " + playersList.size() + " no of players");
//			for(Player p:playersList)
//				System.out.println(p);
//		}
//	} catch (BusinessException e) {
//		System.out.println(e);
//	}	
	
			
//	try {dao.deletePlayer(108);
//			System.out.println("Player deleted successfully.");
//			
//		//}
//	} catch (BusinessException e) {
//		System.out.println(e.getMessage());
//	}
	
	
	
	try {
		dao.updatePlayerContact(108, 999999999L);
			System.out.println("Player updated successfully.");	
	} catch (BusinessException e) {
		System.out.println(e.getMessage());
	}
}
	
	
}
