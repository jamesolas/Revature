
public class Main {
	public static void main(String[] args) {
		Validation v = new Validation();
		
		try {
		if(v.isValidPassport("123456")) {
			System.out.println("Passport validated");
		}
		}catch(UncheckedExceptionClass e){
		System.out.println(e.getMessage());
	}
	}
}