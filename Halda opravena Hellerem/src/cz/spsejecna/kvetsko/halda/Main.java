package cz.spsejecna.kvetsko.halda;

import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
//Popsal jsem cel� k�d tak, jak by m�l fungovat - Heller
		//je�t� jsem tu zm�nil p�r ��dk� k�du viz n�e - Heller


//zalo�en� haldy
		Halda a = new Halda();
 //insertov�n� ��sel do haldy pomoc� random generatoru, kter� vygeneruje 14 ��sel od 0-50 .
		//opraveno m�sto 14ti ��dk� a.insert(��slo)
		
		Random rand = new Random();
		int upperbound = 50;
		 
		 for (int x = 0; x <= 15 ; x++) {
			int int_random = rand.nextInt(upperbound);
			a.insert(int_random);
		}
	
		//vyps�n� haldy do array
		System.out.println(a.array);
	}

}
