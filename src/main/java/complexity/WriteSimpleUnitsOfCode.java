package complexity;

public class WriteSimpleUnitsOfCode {

	int value;

	public void one() {
		value = 0;
	}

	/**
	 * Flagged: Yes
	 */
	public void fiveWithIf() {
		if (value == 0 || value == 2 || value == 5 || value == 7 || value == 11) {
			value++;
		}
	}

	/**
	 * Flagged: Yes
	 */
	public void fiveWithFor() {
		for (int t = 0; t < 10; t++) { value += 1; }
		for (int t = 0; t < 10; t++) { value += 2; }
		for (int t = 0; t < 10; t++) { value += 3; }
		for (int t = 0; t < 10; t++) { value += 4; }
		for (int t = 0; t < 10; t++) { value += 5; }
	}

	/**
	 * Flagged: Yes
	 */
	public void fiveWithWhile() {
		int t = 0;
		while (t < 10) { value += 1; t++; }
		while (t < 10) { value += 2; t++; }
		while (t < 10) { value += 3; t++; }
		while (t < 10) { value += 4; t++; }
		while (t < 10) { value += 5; t++; }
	}
	
	/**
	 * Flagged: Yes
	 */
	public void fiveWithSwitch() {
		switch(value) {
		case 0: value++;
		case 1: value++;
		case 2: value++;
		case 3: value++;
		case 4: value++;
		}
	}

}
