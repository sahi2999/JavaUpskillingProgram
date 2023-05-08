package Collections;

import java.util.Comparator;

public class FilmsNameComparisions  implements Comparator<Film>{
	public int compare(Film m1,Film m2)
    {
//		String y1=m1.getMovieName();
//		String y2=m2.getMovieName();
//		return y1.compareTo(y2);
		return m1.getMovieName().compareTo(m2.getMovieName());
    }
	

}
