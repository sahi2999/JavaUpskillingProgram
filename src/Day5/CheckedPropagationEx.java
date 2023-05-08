package Day5;

import java.io.IOException;

public class CheckedPropagationEx {
	void m() throws IOException {
		throw new IOException("Device Error");
	}

	void n() throws IOException {
		m();
	}

	void p() {
		try {
			n();
		} catch (Exception e) {
			System.out.println("Exception is Handled");
		}
	}

	public static void main(String[] args) {
		CheckedPropagationEx obj = new CheckedPropagationEx();
		obj.p();
		System.out.println("Normal flow of the program");

	}

}
