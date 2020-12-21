//validate ssn using regex

public class ValidateSSNClass {
	
	public static void main(String[] args) {
		String ssn = "123-45-1234";
		if(ssn.matches("[0-9]{3}-[0-9]{2}-[0-9]{4}")){
			System.out.println("Valid SSN");
		}else {
			System.out.println("Not a valid SSN");
		}
	}

}
