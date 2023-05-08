package Day4;

public class TrafficLightusingEnum3 {
	
	enum Colors{
		RED,YELLOW,GREEN  //: is optional
	}

	public static void main(String[] args) {
		Colors co = Colors.GREEN;
		System.out.println(co);

		System.out.println("Colours in the Traffic Light are: ");

		for (Colors s : Colors.values()) {
			System.out.println(s + " at index " + s.ordinal());
		}
		System.out.println(Colors.valueOf("GREEN"));
		
	}

}
