package challenge340;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String word = "a";
		Scanner scanner = new Scanner(System.in);
		while ("a".equals(word)) {

			try {
				System.out.print("Type the string: ");
				word = scanner.nextLine();
			} catch (InputMismatchException d) {
				System.out.println("only letter");
			}
		}
		loop: for (int i = 0; i < word.length(); i++) {
			for (int j = i + 1; j < word.length(); j++) {
				if (word.charAt(i) == word.charAt(j)) {
					System.out.println("Repeating letter: " + word.charAt(i));

					break loop;
				}

			}
			System.out.println("Letter: " + word.charAt(i) + " occur only once");
		}

	}
}
