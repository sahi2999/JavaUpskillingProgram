package pkg140423Day1;

public class StringToDouble {

	public static void main(String[] args) {
       String s="9.5678";
       double d=Double.parseDouble(s);
       System.out.println("By using ParseDouble d="+d);
       
       String st="9.678";
       double di=Double.valueOf(st);
       System.out.println("By using valueOf di="+di);
	}

}
