package cz.spsejecna.kvetsko.halda;

public class HaldaIsEmptyException extends Exception {

	public HaldaIsEmptyException() {

	}

	public HaldaIsEmptyException(String message) {
		super(message);
	}
}
