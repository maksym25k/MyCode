package cz.spsejecna.kvetsko.halda;

import java.util.ArrayList;

public class Halda {

	ArrayList<Integer> array = new ArrayList<Integer>();

	public void Make() {

		ArrayList<Integer> temparr = new ArrayList<Integer>();
		temparr.add(0);
		temparr.addAll(array);

		int i = array.size();
		while (i / 2 > 0) {

			if (temparr.get(i / 2) > temparr.get(i)) {

				int temp = 0;
				temp = temparr.get(i);
				temparr.set(i, temparr.get(i / 2));
				temparr.set((i / 2), temp);
			}

			i--;
		}
		temparr.remove(0);
		array = temparr;

	}

	public void insert(int in) {

		array.add(in);

		Make();

	}

	public int min() throws HaldaIsEmptyException {

		if (array.size() == 0) {

			throw new HaldaIsEmptyException();

		}
		return array.get(0);

	}

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

	public int size() {

		return array.size();
		
		
		
		
		
		
	}
	
	public ArrayList <Integer>returnall(){
		
		return array;
	} 
	
	
}
