package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int custNum = scan.nextInt();
		
		for (int i=0; i<custNum; i++) {
			
			String firstName = scan.next();

			String lastName = scan.next();
			
			int itemEach = scan.nextInt();
			
			double total = 0.0;
			
			for (int j=0; j < itemEach; j++) {
				int quanEach = scan.nextInt();
				String name = scan.next();
				double price = scan.nextDouble();
				total += quanEach * price;
				
			}

			System.out.println(firstName.charAt(0) + ". "+ lastName + ": " + String.format("%.2f", total));
					
		}
		scan.close();
	}
}
