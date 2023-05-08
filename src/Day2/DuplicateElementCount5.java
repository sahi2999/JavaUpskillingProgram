package Day2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateElementCount5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the Array :");
		int size=sc.nextInt();
        int[] a= new int[size];
        
		System.out.println("Enter the elements of the Array :");
        for(int i=0;i<size;i++) {
        	a[i]=sc.nextInt();
        }
      
		Set<Integer> s = new HashSet<>();
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (a[i] == a[j]) {
					s.add(a[i]);
				}
			}
		}
    
        System.out.println("Count: "+s.size());
	}
}
