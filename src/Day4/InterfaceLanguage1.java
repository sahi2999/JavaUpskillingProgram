package Day4;

interface Language {
	String typeOfLanguage = "Object Oriented Programming Language";
	void getLanguage(String name);
}


class ProgrammingLanguage implements Language {
	@Override
	public void getLanguage(String name) {
		System.out.println("Programming language is " + name);
	}
}


public class InterfaceLanguage1 {
	public static void main(String[] args) {
		Language l = new ProgrammingLanguage();
		l.getLanguage("Java");
		System.out.println(Language.typeOfLanguage);
	}
}
