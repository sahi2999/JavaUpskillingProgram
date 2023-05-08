package Day2;

public class MinValueInArray4 {

	public static void main(String[] args) {
		int[]a= {56,9,92,12,567,46,7,5};
		int min=a[0];
		
	    for(int i=0;i<a.length;i++){
	  	  if(a[i]<min) {
	  		   min=a[i];
	  	  }
	    }
	    System.out.println("smallest number in the array: "+min);
		}

	}


