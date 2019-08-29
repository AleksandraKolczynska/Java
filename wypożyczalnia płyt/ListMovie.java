import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ListMovie {
	List<Movie> Listm = new ArrayList();

	public void putListm(Object t) {
		Listm.add((Movie) t);

	}

	public void view() {
		Listm.stream().map(Object::toString).forEach(System.out::println);

	}

	public void sort() {
		Collections.sort(Listm, new sortMovie());
	}
}
