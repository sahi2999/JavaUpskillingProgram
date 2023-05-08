package Day2;

public class ReverseOfArray13 {

	public static void main(String[] args) {
		
		int[] a = { 2, 4, 7, 16, 90, 12 };

		System.out.println("Original Array: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		System.out.println();
		System.out.println("Elements of the array Reverse order: ");
		for (int k = a.length - 1; k >= 0; k--) {
			System.out.print(a[k] + " ");
		}

	
	}
}
