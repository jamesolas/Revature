package com.app.main;

import java.util.List;
import java.util.Scanner;

import com.app.exception.BusinessException;
import com.app.model.Player;
import com.app.service.PlayerSearchService;
import com.app.service.impl.PlayerSearchServiceImpl;

public class PlayerSearchMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcoe to PlayerSearchApp v1.0");
		System.out.println("-------------------------------------");
		int ch = 0;
		PlayerSearchService playerSearchService = new PlayerSearchServiceImpl();
		do {
			System.out.println("Player Search Menu");
			System.out.println("====================");
			System.out.println("1)By Id");
			System.out.println("2)By Contact Number");
			System.out.println("3)By Age");
			System.out.println("4)By Gender");
			System.out.println("5)By Team Name");
			System.out.println("6)By Dob");
			System.out.println("7)By Player Name");
			System.out.println("8)Show All Players");
			System.out.println("9)Exit");
			System.out.println("10)Please enter appropriate choice.");
			try {
				ch=Integer.parseInt(sc.nextLine());
			}catch(NumberFormatException e) {}
			switch (ch) {
			
			case 1: System.out.println("Enter player ID to get player details.");
				try {
					int player_id = Integer.parseInt(sc.nextLine());
					//code to service
					Player player = playerSearchService.getPlayerById(player_id);
					if(player != null) {
						System.out.println("Player found with Id " + player_id + "details of the player is: ");
						System.out.println(player);
					}
				}catch(NumberFormatException e) {
					System.out.println("Player Id cannot be white spaces, special characters, or symbols. It must be numeric.");
				}catch(BusinessException e) {
					System.out.println(e.getMessage());
				}	
			break;
			
			case 2: System.out.println("Enter contact number to get player details.");
			try {
				int contact = Integer.parseInt(sc.nextLine());
				//code to service
				Player player = playerSearchService.getPlayerByContact(contact);
				if(player != null) {
					System.out.println("Player found with contact " + contact + "details of the player is: ");
					System.out.println(player);
				}
			}catch(NumberFormatException e) {
				System.out.println("Player Id cannot be white spaces, special characters, or symbols. It must be numeric.");
			}catch(BusinessException e) {
				System.out.println(e.getMessage());
			}
			break;
			case 3: 
			try {
				System.out.println("Enter player age to get all players with that age.");
				int age = Integer.parseInt(sc.nextLine());
				List<Player> agePlayersList = playerSearchService.getPlayersByAge(age);
				if(agePlayersList != null && agePlayersList.size() > 0) {
					System.out.println("Players with age " + age);
					for(Player p:agePlayersList) {
						System.out.println(p);
					}
				}
			}catch (NumberFormatException e) {
				System.out.println("Age cannot have symbols, space, or letters.");
			}
			catch (BusinessException e){
				System.out.println(e.getMessage());
			}
	
			break;
			case 4: 
				System.out.println("Please enter gender of player.");
				String gender = sc.nextLine();
				try {
				List<Player> genderPlayersList = playerSearchService.getPlayersByGender(gender);
				if(genderPlayersList != null && genderPlayersList.size() > 0) {
					System.out.println("Players with gender " + gender);
					for(Player p:genderPlayersList) {
						System.out.println(p);
					}
				}
			}catch (NumberFormatException e) {
				System.out.println("Age cannot have symbols, space, or letters.");
			}
			catch (BusinessException e){
				System.out.println(e.getMessage());
			}
			

			break;
			case 5: 
				System.out.println("Enter team name to get all players of that team.");
				String team_Name = sc.nextLine();
				try {
					List<Player> teamPlayersList = playerSearchService.getPlayersByTeamName(team_Name);
					if(teamPlayersList != null && teamPlayersList.size() > 0) {
						System.out.println("Number of players with team name " + team_Name);
						for(Player p:teamPlayersList) {
						System.out.println(p);
						}
					}
				}catch(BusinessException e1) {
					System.out.println(e1.getMessage());
				}
		
			break;
			case 6: 
				System.out.println("Please enter dob.");
				String dob = sc.nextLine();
				try {
				List<Player> dobPlayersList = playerSearchService.getPlayersByDob(dob);
				if(dobPlayersList != null && dobPlayersList.size() > 0) {
					System.out.println("Number of players with dob " + dob);
					for(Player p:dobPlayersList) {
					System.out.println(p);
					}
				}
				}catch(BusinessException e1) {
				System.out.println(e1.getMessage());
				}
	
			break;
			case 7: System.out.println("Please enter player name.");
			String player_name = sc.nextLine();
			try {
				List<Player> namePlayersList = playerSearchService.getPlayersByName(player_name);
				if(namePlayersList != null && namePlayersList.size() > 0) {
					System.out.println("Number of players with name " + player_name);
					for(Player p:namePlayersList) {
					System.out.println(p);
					}
				}
			}catch(BusinessException e1) {
				System.out.println(e1.getMessage());
			}
			break;
	
			case 8: System.out.println("Retrieving all the players from backend.");
			
			try {
				List<Player> allPlayersList = playerSearchService.getAllPlayers();
				if(allPlayersList != null && allPlayersList.size() > 0) {
					System.out.println("There are " + allPlayersList.size() + " no of player(s)");
					for(Player p:allPlayersList) {
						System.out.println(p);
					}
				}
			}catch (BusinessException e){
				System.out.println(e.getMessage());
			}
	
			break;
			case 9: System.out.println("Thank you for using our PlayerSearchApp 1.0");
	
			break;
			default: System.out.println("Invalid menu option.");
			break;
			}
		}while(ch != 9);
	}

}
