package com.app.model;

import java.util.Date;

public class Player {
	private int player_id;
	private String player_name;
	private int points;
	private Date dob;
	private long contact;
	private String gender;
	private int age;
	
	public Player() {
		// TODO Auto-generated constructor stub
	}

	
	public Player(int player_id, String player_name, int points, Date dob, long contact, String gender, int age) {
		super();
		this.player_id = player_id;
		this.player_name = player_name;
		this.points = points;
		this.dob = dob;
		this.contact = contact;
		this.gender = gender;
		this.age = age;
	}

	public int getPlayer_id() {
		return player_id;
	}

	public void setPlayer_id(int player_id) {
		this.player_id = player_id;
	}

	public String getPlayer_name() {
		return player_name;
	}

	public void setPlayer_name(String player_name) {
		this.player_name = player_name;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age= age;
	}

	@Override
	public String toString() {
		return "Player [player_id=" + player_id + ", player_name=" + player_name + ", points=" + points + ", dob=" + dob
				+ ", contact=" + contact + ", gender=" + gender + "]";
	}

	
	
	
	
}
