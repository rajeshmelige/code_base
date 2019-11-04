/**
 * 
 */
package sort_algos;

import utility.Utility;

/**
 * @author rajesh_melige
 * - time complexity of O(n^2) 
 * - space complexity of O(1)
 */
public class BubbleSort {

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
	 * @param a
	 * @return
	 */
	private static int[] sortDescending(int[] a) {
		for(int i=0;i<a.length;i++) {
			for(int j=1;j<a.length-i;j++) {
				if(a[j-1]<a[j]) {
					Utility.swapArray(a, j-1, j);
				}
			}
		}
		return a;
	}

	/**
	 * @param a
	 * @return
	 */
	private static int[] sortAscending(int[] a) {
		for(int i=0;i<a.length;i++) {
			for(int j=1;j<a.length-i;j++) {
				if(a[j-1]>a[j]) {
					Utility.swapArray(a, j-1, j);
				}
			}
		}
		return a;
	}
}
