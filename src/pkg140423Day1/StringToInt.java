package pkg140423Day1;

public class StringToInt {

	public static void main(String[] args) {

		String s="90";
		int j=Integer.parseInt(s);
		System.out.println("By using parseInt j="+j);
		
		String str="567";
		int i=Integer.valueOf(str);
		System.out.println("By using valueOf i="+i);
	}

}
