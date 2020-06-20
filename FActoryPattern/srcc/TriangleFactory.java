package cz.spsejecna.novak.c2a.factory;

public class TriangleFactory {
	public static Triangle ChooseTriangle(boolean isIsosceles) {
		Triangle p = null;
		if(isIsosceles) {
			p = new IsoscelesTriangle(4, 5);
		}else {
			p = new EquilateralTriangle(6);
		}
		return p;
	}
}
