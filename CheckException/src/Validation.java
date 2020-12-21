//*Task – create a custom check exception is the entered driver’s license is valid or not

public class Validation {
	
	public boolean isValidDL(String dl) throws CheckExceptionClass {
		
		if(!dl.matches("[A-Z]{1}[0-9]{7}")) {
			throw new CheckExceptionClass("Invalid driver's license");
		}
		
		return true;
	}

}
