import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		Main objectMain = new Main();

		List<Long> numbers = new ArrayList<>();
		long number = 400456304;

		while (number != 0) {
			numbers.add(number % 10);
			number /= 10;
		}
		objectMain.removeZerosFromArray(numbers);
		objectMain.sortArray(numbers);
		objectMain.checkArrayLength(numbers);
	}

	public List<Long> removeZerosFromArray(List<Long> numbers) {
		System.out.println(numbers);
		List<Long> zero = numbers.stream().filter(value -> value == 0).collect(Collectors.toList());
		numbers.removeAll(zero);
		return numbers;

	}

	public List<Long> sortArray(List<Long> numbers) {
		System.out.println(numbers);
		Collections.sort(numbers);
		System.out.println(numbers);
		Collections.reverse(numbers);
		System.out.println(numbers);

		return numbers;
	}

	public List<Long> checkArrayLength(List<Long> numbers) {
		long y = numbers.get(0);
		numbers.remove(0);
		System.out.println(numbers.size() < y);

		for (int i = 0; i < numbers.size(); i++) {
			numbers.set(i, (numbers.get(i) - 1));

		}
		return numbers;
	}

}
