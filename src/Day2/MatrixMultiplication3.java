package Day2;

public class MatrixMultiplication3 {

	public static void main(String[] args) {
      int[][]a= {{1,2,3},{2,6,9}};
      int[][]b= {{3,9,6},{1,2,3},{4,5,6}};
      
      int[][]c=new int[2][3];
      for(int i=0;i<2;i++) {
    	  for(int j=0;j<3;j++) {
    		  c[i][j]=0;
        	  for(int k=0;k<3;k++) {
        		  c[i][j]+=a[i][k]*b[k][j];
    	  }
        	  System.out.print(c[i][j]+" ");
      }
    	  System.out.println();
    	//  int d[]= {12,34};

	}

}
}