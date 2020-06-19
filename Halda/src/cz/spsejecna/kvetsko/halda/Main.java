package cz.spsejecna.kvetsko.halda;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Halda a = new Halda();

		

a.insert(0);
a.insert(15);
a.insert(15);
a.insert(1);


a.insert(1);
a.insert(3);
a.insert(15);
a.insert(1);

a.insert(0);
a.insert(15);
a.insert(25);
a.insert(1);


a.insert(-1);
a.insert(-50);
a.insert(15);
a.insert(45);

	System.out.println(a.array);		
	}

}
