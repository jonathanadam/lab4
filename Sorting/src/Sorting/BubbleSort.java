package Sorting;
public class BubbleSort {
	/**
	 * bubbleSort				sorts an array of integers using bubble sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] bubbleSort(int[] unsortedArray) {
		if ((unsortedArray == null)||(unsortedArray.length == 0)) return unsortedArray;
    	else{
    		boolean isSorted = false;
    		while (!isSorted){
    			isSorted = true;
    			for (int i = 0; i < unsortedArray.length -1; i++ ){
    				if (unsortedArray[i]> unsortedArray[i+1]) {
    					isSorted = false;
    					int tmp = unsortedArray [i];
    					unsortedArray[i] = unsortedArray[i+1];
    					unsortedArray[i+1] = tmp;
    				}
    			}
    		}
    		return unsortedArray;
    	}
	}
}
