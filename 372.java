package challenge372;

import java.util.Scanner;

public class Main {
	private static final char X_LETTER = 'x';
	private static final char Y_LETTER = 'y';

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("type only x or y");
		String letter = scanner.nextLine();

		int numberOfX = 0;
		int numberOfY = 0;

		for (int i = 0; i < letter.length(); i++) {
			if (letter.charAt(i) == X_LETTER) {
				numberOfX++;
			} else if (letter.charAt(i) == Y_LETTER)
				numberOfY += 1;

			else if (letter.charAt(i) != X_LETTER || letter.charAt(i) != Y_LETTER) {
				System.out.println("type only x or y " + letter.charAt(i));

			}

		}
		if (numberOfX == numberOfY) {
			System.out.println("perfect balance");
		} else if (numberOfX > numberOfY) {
			System.out.println("More x than y");
		} else if (numberOfX < numberOfY) {
			System.out.println("More y than x");
		}

	}
}
