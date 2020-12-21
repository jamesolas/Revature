
public class CustomMain {

	public static void main(String[] args) {
		Validation v = new Validation();
		try {
			if(v.isValidDL("D1234567")){
				System.out.println("Driver's license validated");
			}
		} catch (CheckExceptionClass e) {
			System.out.println(e.getMessage());
		}
	}

}
