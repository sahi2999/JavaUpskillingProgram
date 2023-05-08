package Day3;

import java.util.HashSet;
import java.util.Set;

public class CommonNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Set<Integer> c=new HashSet<>();
		int[] a= {1,4,5,6,7,8,9,6,7,6,7,7,7};
		int[] b= {3,6,7,99,77,7,7,7,7};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]){
					c.add(a[i]);
					
				}
			}
			
		}
		System.out.println(c);

	}

}
