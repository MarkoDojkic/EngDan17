package projekat12;

public class UnknownColorException extends RuntimeException {

	private static final long serialVersionUID = 3330162176876580627L;
	
	public UnknownColorException(String errorMessage) {
		super(errorMessage);
	}
}
