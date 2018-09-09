package complexity;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class WriteSimpleUnitsOfCode {

	int value;

	public void one() {
		value = 0;
	}

	public void fiveWithIf() {
		if (value == 0 || value == 2 || value == 5 || value == 7 || value == 11) {
			value++;
		}
	}

	public void fiveWithFor() {
		for (int t = 0; t < 10; t++) {
			value += 1;
		}
		for (int t = 0; t < 10; t++) {
			value += 2;
		}
		for (int t = 0; t < 10; t++) {
			value += 3;
		}
		for (int t = 0; t < 10; t++) {
			value += 4;
		}
		for (int t = 0; t < 10; t++) {
			value += 5;
		}
	}

	public void fiveWithWhile() {
		int t = 0;
		while (t < 10) {
			value += 1;
			t++;
		}
		while (t < 10) {
			value += 2;
			t++;
		}
		while (t < 10) {
			value += 3;
			t++;
		}
		while (t < 10) {
			value += 4;
			t++;
		}
		while (t < 10) {
			value += 5;
			t++;
		}
	}
	
	public void fiveWithSwitch() {
		switch(value) {
		case 0: value++;
		case 1: value++;
		case 2: value++;
		case 3: value++;
		case 4: value++;
		}
	}
	
	public void fiveWithStreamingApi() {
		List<Integer> list = new ArrayList<>();
		list.stream()
			.filter(i -> i > 0)
			.filter(i -> i > 1)
			.filter(i -> i > 2)
			.filter(i -> i > 3)
			.filter(i -> i > 4)
			.collect(Collectors.toList());
	}

}
