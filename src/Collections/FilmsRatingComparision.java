package Collections;

import java.util.Comparator;

public  class FilmsRatingComparision implements Comparator<Film> {

	public int compare(Film m1,Film m2)
    {
		double y1=m1.getRating();
		double y2=m2.getRating();
		if(y1>y2) {
			return 1;
		}
		else {
			return -1;
		}	
    }
	

}
