
package challenge374;

import java.util.ArrayList;
import java.util.List;

public class Main {
	private static final int MAX_VALUE = 9;

	public static void main(String[] args) {
		int persistenceNumber = 199;
		int loops = 0;
		List<Integer> numberList = new ArrayList();
		do {
			loops++;

			while (persistenceNumber != 0) {
				numberList.add(persistenceNumber % 10);
				persistenceNumber /= 10;
			}

			for (int i = 0; i < numberList.size();) {
				persistenceNumber = persistenceNumber + numberList.get(i);
				numberList.remove(i);

			}

			System.out.println("step: " + loops + " result: " + persistenceNumber);

		} while (persistenceNumber > MAX_VALUE);

		System.out.println("Number of loops: " + loops);
	}
}