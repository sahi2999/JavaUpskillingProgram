package Collections;

class Film {
	private String movieName;
	private int year;
	private double rating;

	  public Film(String movieName, int year, double rating) {
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

}
