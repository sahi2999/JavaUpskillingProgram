package Day2;

public class CloneOfArray17 {

	public static void main(String[] args) {
		//Using clone Method
		int[] a= {1,4,5};
		int[] b=a.clone();
		//b[0]++;
		
		System.out.println("Using clone() Method");
		
		System.out.println("contents of a[]");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
		System.out.println();
		
		System.out.println("contents of b[]");
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
		
		//Using arraycopy(Object src, int srcPos, Object dest,int destPos, int length) method
		
		int[] c= {11,14,5,6};
		int[] d=new int[c.length];
		
		System.arraycopy(c, 0, d, 0, 4);
		//d[0]++;
		
		System.out.println();
		System.out.println("Using arraycopy() Method");
		

		System.out.println("contents of c[]");
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+" ");
		}
		
		System.out.println();
		
		System.out.println("contents of d[]");
		for(int i=0;i<d.length;i++) {
			System.out.print(d[i]+" ");
		}

	}

}
