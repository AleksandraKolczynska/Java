import java.util.ArrayList; 
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<organism> list = new ArrayList();
		list.add(new Dog(10, "fetching", "male","Morus"));
		list.add(new Dog(8, "digging", "male","Kubus"));
		list.add(new Cat(14, "mouse", "male", "Julek"));
		list.stream().forEach(System.out::println);
		
		
		
	

	}

}
