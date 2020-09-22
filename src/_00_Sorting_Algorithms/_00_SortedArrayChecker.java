package _00_Sorting_Algorithms;

public class _00_SortedArrayChecker {
	//1. Write a static method called intArraySorted. 
	//   This method takes in an array of integers
	//   and it returns a boolean.
	//   The method returns true if the integer
	//   array is in ascending order and false otherwise
static boolean intArraySorted (int array1[]) {
	for (int x = 0; x<array1.length-1; x++) {
		if (!(array1[x] <= array1[x+1])) {
			return false;
		}
		
	}
	return true;
}
	
	//2. Write a static method called doubleArraySorted. 
	//   This method takes in an array of doubles
	//   and it returns a boolean.
	//   The method returns true if the double
	//   array is in ascending order and false otherwise
static boolean doubleArraySorted (double array2[]) {
	for (int y = 0; y<array2.length-1; y++) {
		if (!(array2[y] <= array2[y+1])) {
			return false;
		}
		
	}
	return true;
}
	
	//3. Write a static method called charArraySorted. 
	//   This method takes in an array of characters
	//   and it returns a boolean.
	//   The method returns true if the character
	//   array is in alphabetical order and false otherwise
	//   (You can compare characters just like integers)
static boolean charArraySorted (char array3[]) {
	for (int z = 0; z<array3.length-1; z++) {
		if (!(array3[z] < array3[z+1])) {
			return false;
		}
		
	}
	return true;
}
	
	//4. Write a static method called stringArraySorted. 
	//   This method takes in an array of Strings
	//   and it returns a boolean.
	//   The method returns true if the String
	//   array is in alphabetical order and false otherwise
	//   (Use the compareTo(String) method)
static boolean stringArraySorted (String array4[]) {
	for (int a = 0; a<array4.length-1; a++) {
		if  ((array4[a].compareTo(array4[a+1]) > 0)){
			return false;
		}
		
	}
	return true;
}
}
