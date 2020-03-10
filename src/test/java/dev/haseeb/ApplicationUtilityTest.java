package dev.haseeb;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.assertj.core.util.Arrays;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;

public class ApplicationUtilityTest {

	@Test
	public void testWithUniqueIntegers() {
		List<Integer> actualUniqueList = ApplicationUtility
				.uniqueIntegers(Arrays.array(1, 1, 2, 2, 3, 3, 4, 34, 45, 74, 123, 2890, 3456, 67845));
		List<Integer> expectedUniqueList = Lists.newArrayList(1, 2, 3, 4, 34, 45, 74, 123, 2890, 3456, 67845);
		assertTrue(expectedUniqueList.equals(actualUniqueList));

	}

	@Test
	public void testWithReversedString() {
		assertEquals("World Hello", ApplicationUtility.reverseString("Hello World").getReversed());
	}

	@Test
	public void testWithNonUniqueIntegers() {
		List<Integer> actualUniqueList = ApplicationUtility
				.uniqueIntegers(Arrays.array(1, 1, 2, 2, 3, 3, 4, 34, 45, 74, 123, 2890, 3456, 67845));
		List<Integer> expectedUniqueList = Lists.newArrayList(1, 1, 2, 2, 3, 3, 4, 34, 45, 74, 123, 2890, 3456, 67845);
		assertFalse(expectedUniqueList.equals(actualUniqueList));
	}

	@Test
	public void testWithNullIntegers() {
		List<Integer> actualUniqueList = ApplicationUtility.uniqueIntegers(null);
		assertNull(actualUniqueList);
	}

	@Test
	public void testWithUnReversedString() {
		assertNotEquals("Hello World", ApplicationUtility.reverseString("Hello World").getReversed());
	}

	@Test
	public void testWithEmptyString() {
		assertEquals("", ApplicationUtility.reverseString(null).getReversed());
	}
}
