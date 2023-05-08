package pkg180423;

public class StringBufferMethods {

	public static void main(String[] args) {
      StringBuffer sb= new StringBuffer();
      System.out.println(sb.capacity());
      
      StringBuffer sb1= new StringBuffer("Sahitya");
      System.out.println(sb1.capacity());
      
      sb1.append(" P");
      System.out.println(sb1);
      
      sb1.deleteCharAt(2);
      System.out.println(sb1);
      
      String s=sb1.toString();
      System.out.println(s);


      

      
	}

}
