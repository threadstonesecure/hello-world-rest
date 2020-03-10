package dev.haseeb;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.springframework.util.ObjectUtils;

public class ApplicationUtility {

	public static List<Integer> uniqueIntegers(Integer[] sortedIntegers) {
		List<Integer> uniqueIntegersList = null;
		if (null != sortedIntegers && sortedIntegers.length > 0) {
			uniqueIntegersList = Arrays.stream(sortedIntegers).distinct().collect(Collectors.toList());
		}
		return uniqueIntegersList;
	}

	public static Reversed reverseString(String reverseString) {
		return new Reversed(reverseString);
	}

	public static class Reversed {
		private final String reversed;

		public Reversed(String reversed) {
			this.reversed = ObjectUtils.isEmpty(reversed) ? ""
					: Pattern.compile("\\s").splitAsStream(reversed).reduce((w1, w2) -> w2 + " " + w1).get();
		}

		public String getReversed() {
			return reversed;
		}

	}
}
