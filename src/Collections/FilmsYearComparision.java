package Collections;

import java.util.Comparator;

public class FilmsYearComparision implements Comparator<Film> {

	@Override
	public int compare(Film m1, Film m2) {
		int y1=m1.getYear();
		int y2=m2.getYear();
		if(y1>y2) {
			return 1;
		}
		else {
			return -1;
		}	
	}

	

}
