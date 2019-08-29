package challenge372;

import java.util.Scanner;

public class Main {
	private static final char X_LETTER = 'x';

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("type only x or y");
		String letter = scanner.nextLine();

		int x = 0;
		int y = 0;

		for (int i = 0; i < letter.length(); i++) {
			if (letter.charAt(i) == X_LETTER) {
				x++;
			} else if (letter.charAt(i) == 'y')
				y += 1;

			else if (letter.charAt(i) != 'x' || letter.charAt(i) != 'y') {
				System.out.println("type only x or y " + letter.charAt(i));

			}

		}
		if (x == y) {
			System.out.println("perfect balance");
		} else if (x > y) {
			System.out.println("x is better");
		} else if (x < y) {
			System.out.println("y is better");
		}

	}
}