
public class Main {

	public static void main(String[] args) {

		ListMovie movies = new ListMovie();
		movies.putListm(new Movie("Shrek","Adamson", 51.99));
		movies.putListm(new Movie("Shrek 2","Adamson",50.99));
		movies.putListm(new Movie("Shrek 3","Miller", 59.99));
		System.out.println("Before sorting:");
		movies.view();
		movies.sort();
		System.out.println("After sorting:");
		movies.view();
		
	}
	
}
	
