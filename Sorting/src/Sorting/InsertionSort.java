package Sorting;

public class InsertionSort {
	/**
	 * insertionSort			sorts an array of integers using insertion sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] insertionSort(int[] unsortedArray) {
		//TODO: S2 implements insertion sort
		
	int temp;
		
		for (int i = 1; i < unsortedArray.length; i++) {
			for(int j = i ; j > 0 ; j--){
				if(unsortedArray[j] < unsortedArray[j-1]){
					temp = unsortedArray[j];
					unsortedArray[j] = unsortedArray[j-1];
					unsortedArray[j-1] = temp;
				}
			}
		}
	
	return unsortedArray;
	}
		
}
