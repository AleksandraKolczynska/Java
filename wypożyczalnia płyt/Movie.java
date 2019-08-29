
public class Movie {
	String title;
	String director;
	double price;

	public Movie(String title, String director, double price) {
		this.director = director;
		this.title = title;
		this.price = price;
	}

	public void settitle(String title) {
		this.title = title;
	}

	public String gettitle() {
		return title;
	}

	public String getdirector() {
		return director;
	}

	public void setdirector(String director) {
		this.director = director;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String toString() {
		return "Title: " + title + " Director: " + director + " Price: " + price + "z³";

	}

}
