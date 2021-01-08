package com.app;

import java.util.Comparator;

public class FlightAvailability implements Comparator<Flight>{

	@Override
	public int compare(Flight o1, Flight o2) {
		Boolean b1=o1.isAvailable();
		Boolean b2=o2.isAvailable();
		return b2.compareTo(b1);
	}


}
