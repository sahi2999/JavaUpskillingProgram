package Day2;

public class AnonymousArray16 {
	
	public static void sum(int[] a) {
		int result=0;
		for(int i:a) {
			result+=i;
		}
		System.out.println("Sum of the elements in the Anonymous Array are :"+result);
	}

	public static void main(String[] args) {
     sum(new int[]{10,5,15,20});
	}

}
