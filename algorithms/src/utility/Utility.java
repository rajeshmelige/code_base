/**
 * 
 */
package utility;

/**
 * @author rajesh_melige
 *
 */
public class Utility {
	/**
	 * Method to swap elements of an array
	 * 
	 * @param <T>
	 * @param a
	 * @param i
	 * @param j
	 */
	public static void swapArray(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
