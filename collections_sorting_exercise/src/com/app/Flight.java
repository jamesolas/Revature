package com.app;

public class Flight implements Comparable<Flight> {

	@Override
	public int compareTo(Flight o) {
		Integer id1=this.id;
		Integer id2=o.id;
		return id1.compareTo(id2);
	}
	
	private int id;
	private String name;
	private String manufacturer;
	private double cost;
	private float rating;
	private boolean available;
	
	public Flight() {
	}

	public Flight(int id, String name, String manufacturer, double cost, float rating, boolean available) {
		super();
		this.id = id;
		this.name = name;
		this.manufacturer = manufacturer;
		this.cost = cost;
		this.rating = rating;
		this.available = available;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	@Override
	public String toString() {
		return "Flight [id=" + id + ", name=" + name + ", manufacturer=" + manufacturer + ", cost=" + cost + ", rating="
				+ rating + ", available=" + available + "]";
	}
	
	
	
	
	
	
	
}
	