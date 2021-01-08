package com.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FlightMain {
	
	public static void main(String[] args) {
		
		List<Flight>flightList = new ArrayList<>();
		flightList.add(new Flight(100,"Jamaica","Boeing",400,5,true));
		flightList.add(new Flight(105,"Montreal","Airbus",300,4,false));
		flightList.add(new Flight(107,"New York","Boeing",200,5,true));
		flightList.add(new Flight(108,"Kansas City","Airbus",200,3,true));
		flightList.add(new Flight(109,"Japan","Boeing",1000,5,true));
	
		System.out.println("Print all flights");
		printFlights(flightList);
		
		Collections.sort(flightList); //uses Functional Interface Comparable, which compares 2 objects
		System.out.println("\n\n Printing all flights sorted by id");
		printFlights(flightList);
		
		Collections.sort(flightList, (Flight f1, Flight f2) -> {
			Double d1 = f1.getCost();
			Double d2 = f2.getCost();
			return d1.compareTo(d2);
		});
		System.out.println("\n\n Printing all flights sorted by cost low to high");
		printFlights(flightList);
		
		Collections.sort(flightList, (Flight f1, Flight f2) ->{
			int x = 0;
			Float g1 = f1.getRating();
			Float g2 = f2.getRating();
			x = g2.compareTo(g1);
			if(x == 0) {
				Double d1 = f1.getCost();
				Double d2 = f2.getCost();
				x = d1.compareTo(d2);
		}
			return x;
		});
		System.out.println("\n\n Print all flights sorted by ratings (high to low)and then by cost(low to high.");
		printFlights(flightList);
	}
		
	public static void printFlights(List<Flight> flightList) {
		for (Flight f : flightList) {
			System.out.println(f);		
		}
	}
}
