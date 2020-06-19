package cz.spsejecna.kvetsko.halda;

import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
//Popsal jsem celı kód tak, jak by mìl fungovat - Heller
		//ještì jsem tu zmìnil pár øádkù kódu viz níe - Heller


//zaloení haldy
		Halda a = new Halda();
 //insertování èísel do haldy pomocí random generatoru, kterı vygeneruje 14 èísel od 0-50 .
		//opraveno místo 14ti øádkù a.insert(èíslo)
		
		Random rand = new Random();
		int upperbound = 50;
		 
		 for (int x = 0; x <= 15 ; x++) {
			int int_random = rand.nextInt(upperbound);
			a.insert(int_random);
		}
	
		//vypsání haldy do array
		System.out.println(a.array);
	}

}
