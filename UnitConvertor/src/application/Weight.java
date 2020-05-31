package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

enum Weight {

	g(0.0001), kg(1.0), dkg(0.01), t(1000.0), lb(0.45359237), mg(0.000001), oz(0.0283495231);
	List<Weight> Weights = new ArrayList<Weight>(Arrays.asList(Weight.values()));
	double constant;

	double getConstant() {
		return constant;

	}

	Weight(double constant) {
		this.constant = constant;
	}
}

/*
 * Weight getEnumWeight(String in) { for (int i = 0; i < Weights.size(); i++) {
 * if (Weights.get(i).name().equals(in)) { return Weights.get(i); }
 * 
 * } return null; } }
 */