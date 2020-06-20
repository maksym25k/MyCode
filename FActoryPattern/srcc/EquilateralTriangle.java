package cz.spsejecna.novak.c2a.factory;

public class EquilateralTriangle implements Triangle{
	double sizeA;
	public EquilateralTriangle(double a) {
		this.sizeA = a;
	}
	@Override
	public double getSizeA() {
		// TODO Auto-generated method stub
		return sizeA;
	}

	@Override
	public double getSizeB() {
		// TODO Auto-generated method stub
		return sizeA;
	}

	@Override
	public double getS() {
	double s = 0;
	s =  (Math.sqrt(3)/4)*this.sizeA*this.sizeA;
		return s;
	}

	@Override
	public double getO() {
		// TODO Auto-generated method stub
		double o = 3*this.sizeA;
		return o;
	}
	@Override
	public String toString() {
		return "EquilateralTriangle: [size A = "+ getSizeA() + " ] [S = "+ getS() + " ] [O = "+ getO() + " ]";
	}
	

}
