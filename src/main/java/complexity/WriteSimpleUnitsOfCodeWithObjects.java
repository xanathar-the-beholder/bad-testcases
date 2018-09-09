package complexity;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class WriteSimpleUnitsOfCodeWithObjects {

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

	public void fiveWithStreamingApiTwo() {
		List<Integer> list = new ArrayList<>();
		list.stream()
			.filter(i -> i > 0 || i >1 || i > 2 || i>3 || i>4)
			.collect(Collectors.toList());
	}

	public void fiveWithOptionalCondition(Integer value) {
		value = value + Optional.ofNullable(value).orElse(2);
		value = value + Optional.ofNullable(value).orElse(3);
		value = value + Optional.ofNullable(value).orElse(4);
		value = value + Optional.ofNullable(value).orElse(5);
		value = value + Optional.ofNullable(value).orElse(6);
	}
	
}
