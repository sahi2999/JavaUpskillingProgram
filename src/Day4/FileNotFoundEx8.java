package Day4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFoundEx8 {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("C:\\Users\\pesahity\\Downloads\\Java.txt");
			BufferedReader bf = new BufferedReader(fr);
			String data = null;

			try {
				while ((data = bf.readLine()) != null) {
					System.out.println(data);
				}
			}catch (FileNotFoundException e) {
				System.out.println(e);
			}

			
		} 
		catch (IOException ex) {
			System.out.println(ex);
		}

	}
}
