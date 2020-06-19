package cz.spsejecna.kvetsko.halda;
//výjimka, která se vypíše, když je halda prázdná
public class HaldaIsEmptyException extends Exception {

	public HaldaIsEmptyException() {

	}

	public HaldaIsEmptyException(String message) {
		super(message);
	}
}
