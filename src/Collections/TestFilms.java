package Collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TestFilms  {

	public static void main(String[] args) {
		List<Film> mylist = new LinkedList<>();
		mylist.add(new Film("Temper", 2015, 7.4));
		mylist.add(new Film("Simhadri", 2003, 7.3));
		mylist.add(new Film("RRR", 2012, 8.6));
		mylist.add(new Film("Brindavanam", 2010, 8.2));
		mylist.add(new Film("Yamadonga", 2007, 6.8));

		System.out.println("Sorting by Movie release year:");
		FilmsYearComparision mc = new FilmsYearComparision();
		Collections.sort(mylist, mc);
		for (Film f : mylist) {
			System.out.println(f);
		}

		System.out.println();
		System.out.println("Sorting by Movie Rating:");
		FilmsRatingComparision mr = new FilmsRatingComparision();
		Collections.sort(mylist, mr);
		for (Film f : mylist) {
			System.out.println(f);
		}

		
		System.out.println();
		System.out.println("Sorting by Movie Name:");
		FilmsNameComparisions mh = new FilmsNameComparisions();
		Collections.sort(mylist, mh);
		for (Film f : mylist) {
			System.out.println(f);
		}

	}

		
	

}
