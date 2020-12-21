
public class Validation {
	
	public boolean isValidPassport(String passPort) {
		if(!passPort.matches("[0-9]{7}")){
			throw new UncheckedExceptionClass("Entered passport "+passPort+" is invalid.");
		}
		return true;
	}

}
