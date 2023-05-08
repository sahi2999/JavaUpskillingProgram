package Day2;

public class MaximumInArray4 {

	public static void main(String[] args) {
      int[]a= {56,9,56,98,461,76,12};
      int max=a[0];
      for(int i=0;i<a.length;i++){
    	  if(a[i]>max) {
    		   max=a[i];
    	  }
      }
      System.out.println("largest number in the array: "+max);
	}
	

}
