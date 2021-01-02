package eg_time_api_java8;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeApiJava8Demo {

	public static void main(String[] args) {
		LocalDate ld = LocalDate.now();
		System.out.println("ld: "+ld);
		System.out.println("ld.isLeapYear() = "+ld.isLeapYear());
		ld = ld.plusMonths(1);
		System.out.println("after ld.isLeapYear(1), ld: "+ld);
		System.out.println("ld.isLeapYear() = "+ ld.isLeapYear());
		
		String s = "10.02.2000";
		LocalDate dob = LocalDate.parse(s, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
		System.out.println("\ndob: " + dob);
		LocalDate now = LocalDate.now();
		System.out.println("now: " + now);
		
		Period p = Period.between(dob,  now);
		System.out.println("\nYou are "+p.getYears() + " year/s " + p.getMonths() + " month/s and " + p.getDays() + " day/s old");
		
		System.out.println("\n"+ChronoUnit.DAYS.between(dob,  now));
		System.out.println(ChronoUnit.YEARS.between(dob,  now));
		System.out.println(ChronoUnit.MONTHS.between(dob,  now));
	}

}
