import java.util.Comparator;

public class sortMovie implements Comparator<Movie> {

	@Override
	public int compare(Movie a, Movie b) {
		if(a.price > b.price)
			return -1;
		else if (a.price < b.price)
			return 1;
		
		return 0; 
	}
	

}
