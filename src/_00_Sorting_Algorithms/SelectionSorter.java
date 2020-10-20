package _00_Sorting_Algorithms;

public class SelectionSorter extends Sorter {
	public SelectionSorter() {
		type = "Selection";
	}
	
	//  You can use display.updateDisplay() to show the current
	//   progress on the graph.
	@Override
	void sort(int[] array, SortingVisualizer display) {
		//1. make a for loop to iterate through all but the last 
		//   element of the array
		for (int x = 0; x<array.length-1; x++) {
			
		
			//2. create an integer called index and set it equal to i
			int index = x;
			//3. make another for loop that starts at i + 1 and
			//   goes through the entire array
			for (int y = x+1; y<array.length; y++) {
				
			
				//4. if the array element at j is less than the 
				//   element at index, then set index equal to j
				if (array[y]<array[index]) {
					index = y;
				}
			}	
			//5. swap the array element at index with the array element at i
			int var = array[index];
			array[index] = array[x];
			array[x] = var;
			display.updateDisplay();
		}
	}
}
