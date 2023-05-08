package Day2;

public class DuplicateElementInArray12 {

	public static void main(String[] args) {
       int[] a= {1,1,3,8,9,2,3};
       
       
	   System.out.println("Duplicate Elements in the given Array:");

       for(int i=0;i<a.length;i++) {
           for(int j=i+1;j<a.length;j++) {
             if(a[i]==a[j]) {
    	   System.out.println(a[i]);
             }
           }
       }
	}

}
