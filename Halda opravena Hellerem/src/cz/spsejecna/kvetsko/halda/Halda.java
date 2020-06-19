package cz.spsejecna.kvetsko.halda;

import java.util.ArrayList;

public class Halda {
//Zalo�en� arraye
	ArrayList<Integer> array = new ArrayList<Integer>();

	public void Make() {
//Zalo�en� do�asn�ho arraye do kter�ho p�id� nulu 
		ArrayList<Integer> temparr = new ArrayList<Integer>();
		temparr.add(0);
		temparr.addAll(array);
// int i bude zna�it velikost arraylistu
		int i = array.size();
		//dokud velikost arraye bude po vyd�len� dv�mi v�t�� ne� nula, tak se ud�l� podm�nka 
		while (i / 2 > 0) {

			if (temparr.get(i / 2) > temparr.get(i)) {

				int temp = 0;
				temp = temparr.get(i);
				temparr.set(i, temparr.get(i / 2));
				temparr.set((i / 2), temp);
			}

			i--;
		} 
		//odstran�me nulu z do�asn�ho arraye 
		temparr.remove(0);
		array = temparr;

	}
//metoda insert, kter� vkl�d� ��sla do arraye
	public void insert(int in) {

		array.add(in);

		Make();

	}
   //metoda min, kter� vr�t� nejmen�� prvek.
	// v metod� je if, kterej zajist�, �e pokud velikost arraye bude rovna nule, tak se pr�v� vyp�e v�jimka na upozorn�n�.
	public int min() throws HaldaIsEmptyException {

		if (array.size() == 0) {

			throw new HaldaIsEmptyException();

		}
		return array.get(0);

	}
//metoda extractmin, kter� vr�t� nejmen�� prvek z haldy a rovnou ho i odstran�
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
//vr�t� mi to cel� array
	public ArrayList<Integer> returnall() {

		return array;
	}

}
