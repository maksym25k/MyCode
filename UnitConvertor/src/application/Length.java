package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

enum Length {

	MM(0.001), CM(0.01), DM(0.1), M(1.0), KM(1000), INCH(0.0254), FOOT(0.3048), YARD(0.9144), MILE(1609.344),
	LEAGUE(4828.032);
	List<Length> Lengths = new ArrayList<Length>(Arrays.asList(Length.values()));

	/*Length getEnumLength(String in) {
		for (int i = 0; i < Lengths.size(); i++) {
			if (Lengths.get(i).name().equals(in)) {
				return Lengths.get(i);
			}

		}
		return null;
	}
*/
	double getConstant() {
		return this.constant;
	}

	double constant;

	Length(double constant) {

		this.constant = constant;

	}

}