package Day2;

import java.util.Arrays;

public class CommonElementsIn2SortedArrays15 {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 9, 8 };
		int[] b = { 4, 8, 6, 3 ,1};

		Arrays.sort(a);
		Arrays.sort(b);

		System.out.println("Sorted 'a' Array " + Arrays.toString(a));
		System.out.println("Sorted 'b' Array " + Arrays.toString(b));

		System.out.println("Common Elements in the 2 sorted Arrays:");

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					System.out.println(a[i]);
				}
			}

		}
	}

}
