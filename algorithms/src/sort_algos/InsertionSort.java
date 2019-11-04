package sort_algos;

/**
 * 
 * @author rajesh_melige
 * - time complexity of O(n^2) 
 * - space complexity of O(1)
 */
public class InsertionSort {
	public static void main(String[] args) {
		int[] a = {5,3,7,6,2,1,9,8,4};
		int[] sortedAscArray = sortAscending(a);
		System.out.println("Ascending sorted array--");
		for(int i=0;i<sortedAscArray.length;i++) {
			System.out.print(sortedAscArray[i]);
		}
		//Descending
		int[] sortedDescArray = sortedDescending(a);
		System.out.println("\nDescending sorted array--");
		for(int i=0;i<sortedDescArray.length;i++) {
			System.out.print(sortedDescArray[i]);
		}
	}

	/**
	 * @param a
	 * @return
	 */
	private static int[] sortedDescending(int[] a) {
		for(int i=1;i<a.length;i++) {
			int j=i-1;
			int key = a[i];
			while(j>=0 && a[j]<key) {
				a[j+1] = a[j];
				j=j-1;
			}
			a[j+1] = key;
		}
		return a;
	}

	/**
	 * @param a
	 * @return
	 */
	private static int[] sortAscending(int[] a) {
		for(int i=1;i<a.length;i++) {
			int j=i-1;
			int key = a[i];
			while(j>=0 && a[j]>key) {
				a[j+1] = a[j];
				j=j-1;
			}
			a[j+1]=key;
		}
		return a;
	}
}
