package cz.spsejecna.kvetsko.halda;
//v�jimka, kter� se vyp�e, kdy� je halda pr�zdn�
public class HaldaIsEmptyException extends Exception {

	public HaldaIsEmptyException() {

	}

	public HaldaIsEmptyException(String message) {
		super(message);
	}
}
