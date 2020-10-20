package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		String [] array = {"hi", "hello", "hey", "sup","howdy"};
		String value = "hey";
		assertEquals(2, _00_LinearSearch.linearSearch(array, value));
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int [] array = {0, 1, 2, 3, 4};
		int value = 4;
		assertEquals(4, _01_BinarySearch.binarySearch(array, 0, array.length-1, value));
	}
	
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		int [] array = {100, 200, 300, 400, 500};
		int value = 400;
		assertEquals(3, _02_InterpolationSearch.interpolationSearch(array, value));
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		int [] array = {0, 1, 2, 3, 4};
		int value = 3;
		assertEquals(3, _03_ExponentialSearch.exponentialSearch(array, value));
	}
}
