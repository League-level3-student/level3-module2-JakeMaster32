package _00_Sorting_Algorithms;

import java.util.Random;

public class BogoSorter extends Sorter {
	public BogoSorter() {
		type = "Bogo";
	}
	
	// Bogo sort is a joke sorting algorithm. It is considered the most 
	// inefficient sorting algorithm while still maintaining the possibility
	// of eventually sorting data.
	
	// It works by following these steps:
	// STEP 1. Is the array in order?
	//	if yes, finished; if no, go to step 2.
	// STEP 2. Take two random elements in the array and swap them.
	// STEP 3. Go back to step 1.
	
	//1. Complete the sort method using the Bogo sort algorithm. 
	@Override
	void sort(int[] array, SortingVisualizer display) {
		boolean sorted = false;
while (!(sorted)) {
	if (_00_SortedArrayChecker.intArraySorted(array)) {
		sorted = true;
		break;
	}
	else {
		Random rand = new Random();
		int num = rand.nextInt(array.length);
		int var = array[num];
		int num2 = rand.nextInt(array.length);
		array[num] = array[num2];
		array[num2] = var;
		display.updateDisplay();
		
	}
}
	}
}
