package Day2;

import java.util.Arrays;

public class MinimumInArray {

	public static void main(String[] args) {
      int[] a= {23,45,78,16,90,12};
      
      System.out.println("Original Array: ");
      for(int i=0;i<a.length;i++) {
      System.out.print(a[i]+" ");
      }
      System.out.println();
      
      Arrays.sort(a);
      System.out.println("Sorted Array: "+Arrays.toString(a));
      
      int min=a[0];
      System.out.println("Minimum element in the given Array list: "+min);
      
      int max=a[a.length-1];
      System.out.println("Maximumelement in the given Array list: "+max);
      
	}

}
