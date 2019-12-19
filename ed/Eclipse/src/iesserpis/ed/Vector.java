/**
 * 
 */
package ed;

import java.util.Arrays;

/**
 * @author jeaagu
 *
 */
public class Vector {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int max(int[] v) {
		if (v.length == 0) {
			throw new IllegalArgumentException();
		}
		int max = v[0];
		for (int index = 1; index < v.length; index++) {
			if (v[index] > max) {
				max = v[index];
			}
		}
		return max;
	}

	public static int[] selectionSort(int[] v1) {
		// TODO Auto-generated method stub
		Arrays.sort(v1);
		return v1;
	}

	public static int Min(int[] v) {
		int Min = v[0];
		for (int index = 1; index < v.length; index++) {
			if (v[index] < Min) {
				Min = v[index];
			}
		}
		return Min;
	}
}
