/**
 * 
 */
package sort_algos;
import utility.*;

/**
 * @author rajesh_melige
 * Selection sort has 
 * - time complexity of O(n^2) [(n-1)+(n-2)+(n-3)+.....+2+1 comparisons]
 * - space complexity of O(1)
 */
public class SelectionSort {
	
	public static void main(String[] args) {
		int[] a = {5,3,7,6,2,1,9,8,4};
		int[] sortedAscArray = sortAscending(a);
		System.out.println("Ascending sorted array--");
		for(int i=0;i<sortedAscArray.length;i++) {
			System.out.print(sortedAscArray[i]);
		}
		int[] sortedDescArray = sortDescending(a);
		System.out.println("\nDescending sorted array--");
		for(int i=0;i<sortedDescArray.length;i++) {
			System.out.print(sortedDescArray[i]);
		}
	}
	
	/**
	 * Returns the sorted array in ascending order
	 * 
	 * @param arr
	 * @return
	 */
	public static int[] sortAscending(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			int minIndex = i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[minIndex]) {
					minIndex = j;
				}
			}
			if(minIndex!=i) {
				Utility.swapArray(arr,i,minIndex);
			}
		}
		return arr;
	}
	
	/**
	 * Returns the array in descending order
	 * 
	 * @param arr
	 * @return
	 */
	public static int[] sortDescending(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			int maxIndex = i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]>arr[maxIndex]) {
					maxIndex=j;
				}
			}
			if(maxIndex!=i) {
				Utility.swapArray(arr, i, maxIndex);
			}
		}
		return arr;
	}
	
}
