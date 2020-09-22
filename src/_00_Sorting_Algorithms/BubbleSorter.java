package _00_Sorting_Algorithms;

public class BubbleSorter extends Sorter {
	public BubbleSorter() {
		type = "Bubble";
	}

	// 1. Use the bubble sorting algorithm to sort the array.
	// You can use display.updateDisplay() to show the current
	// progress on the graph.
	@Override
	void sort(int[] array, SortingVisualizer display) {
		for (int x = 0; x < array.length - 1; x++) {
			display.updateDisplay();
			for (int y = 0; y < array.length - 1; y++) {
				if (array[y] > array[y + 1]) {
					int var = array[y];
					array[y] = array[y + 1];
					array[y + 1] = var;
				}
			}
		}
	}

}
