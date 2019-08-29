import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
		for (int i = 0; i < numbers.size(); i++) {

			if (numbers.get(i) == 0) {
				numbers.remove(i);
				i--;
			}
		}
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
		if (numbers.size() < y) {
			System.out.println(true);
		} else
			System.out.println(false);

		for (int i = 0; i < numbers.size(); i++) {
			numbers.set(i, (numbers.get(i) - 1));

		}
		return numbers;
	}

}