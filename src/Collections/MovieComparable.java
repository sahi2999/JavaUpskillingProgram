package Collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class Movie implements Comparable<Movie> {

	private String movieName;
	private int year;
	private double rating;

	public Movie(String movieName, int year, double rating) {
		super();
		this.movieName = movieName;
		this.year = year;
		this.rating = rating;
	}

	public String getMovieName() {
		return movieName;
	}

	public int getYear() {
		return year;
	}

	public double getRating() {
		return rating;
	}

	@Override
	public String toString() {
		return "Movie [movieName=" + movieName + ", year=" + year + ", rating=" + rating + "]";
	}

	@Override
	public int compareTo(Movie m) {
		int id1 = this.year;
		int id2 = m.year;

		if (id1 > id2)
			return 1;
		else
			return -1;

	}

	

}

public class MovieComparable {
	public static void main(String[] args) {
		List<Movie> mylist = new LinkedList<>();
		mylist.add(new Movie("Temper", 2015, 7.4));
		mylist.add(new Movie("Simhadri", 2003, 7.3));
		mylist.add(new Movie("RRR", 2022, 8.6));
		mylist.add(new Movie("Brindavanam", 2010, 8.2));
		mylist.add(new Movie("Yamadonga", 2007, 6.8));

		System.out.println("Sorting by Movie release year:");
		Collections.sort(mylist);
		for (Movie f : mylist) {
			System.out.println(f);
		}

	}

}
