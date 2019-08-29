package primenumbers;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int x = 0;
		do {
			try {
				Scanner scanner = new Scanner(System.in);
				System.out.print("Type x = ");
				x = scanner.nextInt();
			} catch (InputMismatchException t) {
				System.out.println("Only number, try again");
			}
		} while (x == 0);
		loop: if (x >= 2) {

			for (int i = 2; i < x; i++) {
				while (x % i == 0) {
					System.out.println(x + " isn't prime number");
					break loop;
				}
			}
			System.out.println(x + " is prime number");
			break loop;

		} else if (x < 1) {
			System.out.println(x + " isn't prime number");
		}
	}

}
