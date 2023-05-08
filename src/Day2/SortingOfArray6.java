package Day2;

public class SortingOfArray6 {

	public static void main(String[] args) {
		int[]a= {5,12,8,7,1};
		int temp=0;
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					 temp = a[i];    
	                   a[i] = a[j];    
	                   a[j] = temp;    
				}
			}		
		}

		
		System.out.println("Elements of array sorted in descending order: ");
		for (int k = 0; k < a.length; k++) {
			System.out.print(a[k] + " ");
		}

		System.out.println();
		System.out.println("Elements of array sorted in Ascending order: ");
		for (int k = a.length - 1; k >= 0; k--) {
			System.out.print(a[k] + " ");
		}

	}

}
