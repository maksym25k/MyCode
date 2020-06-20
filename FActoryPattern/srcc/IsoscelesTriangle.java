package cz.spsejecna.novak.c2a.factory;

public class IsoscelesTriangle implements Triangle {
	double sizeA;
	double sizeB;
	public IsoscelesTriangle(double a, double b) {
		this.sizeA = a;
		this.sizeB = b;
	}
	@Override
	public double getSizeA() {
		// TODO Auto-generated method stub
		return sizeA;
	}

	@Override
	public double getSizeB() {
		// TODO Auto-generated method stub
		return sizeB;
	}

	

	@Override
	public double getS() {
		double s = 0;
		//double root = Math.sqrt(number);
		s = (this.sizeB/4)* Math.sqrt(4*(this.sizeA*this.sizeA) - (this.sizeB*this.sizeB));
		return s;
	}

	@Override
	public double getO() {
		double o = 2*this.sizeA + this.sizeB;
		return o;
	}
	@Override
	public String toString() {
		return "IsoscelesTriangle [size A = "+ getSizeA() + " ][size B = "+ getSizeB() + " ] [S = "+ getS() + " ] [O = "+ getO() + " ]";
	}

}
