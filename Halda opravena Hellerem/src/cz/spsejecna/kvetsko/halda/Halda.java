package cz.spsejecna.kvetsko.halda;

import java.util.ArrayList;

public class Halda {
//Založení arraye
	ArrayList<Integer> array = new ArrayList<Integer>();

	public void Make() {
//Založení doèasného arraye do kterého pøidá nulu 
		ArrayList<Integer> temparr = new ArrayList<Integer>();
		temparr.add(0);
		temparr.addAll(array);
// int i bude znaèit velikost arraylistu
		int i = array.size();
		//dokud velikost arraye bude po vydìlení dvìmi vìtší než nula, tak se udìlá podmínka 
		while (i / 2 > 0) {

			if (temparr.get(i / 2) > temparr.get(i)) {

				int temp = 0;
				temp = temparr.get(i);
				temparr.set(i, temparr.get(i / 2));
				temparr.set((i / 2), temp);
			}

			i--;
		} 
		//odstraníme nulu z doèasného arraye 
		temparr.remove(0);
		array = temparr;

	}
//metoda insert, která vkládá èísla do arraye
	public void insert(int in) {

		array.add(in);

		Make();

	}
   //metoda min, která vrátí nejmenší prvek.
	// v metodì je if, kterej zajistí, že pokud velikost arraye bude rovna nule, tak se právì vypíše výjimka na upozornìní.
	public int min() throws HaldaIsEmptyException {

		if (array.size() == 0) {

			throw new HaldaIsEmptyException();

		}
		return array.get(0);

	}
//metoda extractmin, která vrátí nejmenší prvek z haldy a rovnou ho i odstraní
	public int extractMin() throws HaldaIsEmptyException {
		if (array.size() == 0) {
			throw new HaldaIsEmptyException(

			);
		}
		int temp = array.get(0);
		array.remove(0);
		Make();
		return temp;

	}
// metoda na velikost arraye
	public int size() {

		return array.size();

	}
//vrátí mi to celý array
	public ArrayList<Integer> returnall() {

		return array;
	}

}
