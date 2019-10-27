package challenge377; 

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner number = new Scanner(System.in);
	try {
	System.out.print("smallCratex"  + ":"  );
	int smallCratex = number.nextInt();
	System.out.print("smallCratey"  + ":"  );
	int smallCratey =  number.nextInt();
	System.out.print("bigCrateX"  + ":"  );
	int bigCrateX = number.nextInt();
	System.out.print("bigCrateY"  + ":"  );
	int bigCrateY = number.nextInt();
	System.out.println(rotatex(smallCratex,smallCratey,bigCrateX,bigCrateY));
	
	}
	catch(InputMismatchException t) {
		System.out.println("only numbers");
	}
	}

	public static int notrotate(int smallCratex, int smallCratey, int bigCrateX, int bigCrateY) {
		int sideA = bigCrateX/smallCratex;
		int sideB = bigCrateY/smallCratey;
	
		if(smallCratex > bigCrateX) {
			return 0;		
			}		return sideA * sideB;	
	}
	public static int rotatex (int smallCratex, int smallCratey, int bigCrateX, int bigCrateY) {
		int normal = notrotate(smallCratey, smallCratex, bigCrateX, bigCrateY);
		int rote = notrotate(smallCratex, smallCratey,bigCrateX,bigCrateY);
		return Math.max(rote,normal);	
	}
}
