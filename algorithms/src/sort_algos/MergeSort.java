/**
 * 
 */
package sort_algos;

/**
 * @author rajesh_melige
 * Time complexity of O(n*lgn)
 * Space complexity of O(n)
 */
public class MergeSort {

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
	 * @param length
	 * @return
	 */
	private static int[] sortAscending(int[] a) {
		mergeSort(a, a.length, true);
		return a;
	}

	/**
	 * @param a
	 * @param length
	 * @return
	 */
	private static int[] sortDescending(int[] a) {
		mergeSort(a, a.length, false);
		return a;
	}
	
	/**
	 * @param a
	 * @param length
	 */
	private static void mergeSort(int[] a, int length, boolean isAsc) {
		if(length < 2)
			return;
		int mid = length/2;
		int[] l = new int[mid];
		int[] r = new int[length-mid];
		for(int i=0;i<mid;i++) {
			l[i] = a[i];
		}
		for(int i=mid;i<length;i++) {
			r[i-mid] = a[i];
		}
		mergeSort(l, l.length, isAsc);
		mergeSort(r, r.length, isAsc);
		merge(a,l,r,mid,length-mid,isAsc);
	}

	/**
	 * @param a
	 * @param l
	 * @param r
	 * @param mid
	 * @param i
	 * @param isAsc
	 */
	private static void merge(int[] a, int[] l, int[] r, int left, int right, boolean isAsc) {
		int i=0, j=0, k=0;
		while(i<left && j<right) {
			if(isAsc) {
				if(l[i]<=r[j]) {
					a[k++] = l[i++];
				} else {
					a[k++] = r[j++];
				}
			} else {
				if(l[i]>=r[j]) {
					a[k++] = l[i++];
				} else {
					a[k++] = r[j++];
				}
			}
			
		}
		while(i<left) {
			a[k++] = l[i++];
		}
		while(j<right) {
			a[k++] = r[j++];
		}
	}
}
