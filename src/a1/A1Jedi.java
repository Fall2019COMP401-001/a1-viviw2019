package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int itemsTotal = scan.nextInt();
		
		String[] items = new String[itemsTotal];
		double[] cost = new double[itemsTotal];
		int[] itemNum = new int[itemsTotal];
		int[] customer = new int[itemsTotal];
		
		for(int i = 0; i < itemsTotal; i++) {
			items[i] = scan.next();
			cost[i] = scan.nextDouble();
		}
		
		int cusTotal = scan.nextInt();
		
		String[] custName = new String[cusTotal];
		double[] custCost = new double [cusTotal];
		
		for (int j = 0; j < cusTotal; j++) {
			custName[j] = scan.next() + " " +scan.next();
			int iteamEach = scan.nextInt();
			int[] index = new int[itemsTotal];
			for (int k =0; k<iteamEach; k++) {
				int quantity = scan.nextInt();
				String name = scan.next();
				for (int h=0; h<itemsTotal; h++) {
					if (name.equals(items[h])) {
						itemNum[h] +=  quantity;
						index[h]++;
					}
					
				}
		
			
			}
			for (int l=0; l < itemsTotal ; l++) {
				if (index[l] > 0) {
					customer[l]++;
				}
			}
			
		}
		scan.close();
		
		for (int a = 0; a < itemsTotal; a++) {
			if (customer[a] != 0) { 
				System.out.println(customer[a] + " customers bought " + itemNum[a] +" " + items[a]);

			} else {
				System.out.println("No customers bought " + items[a]);
				
			}
		}
	
		
		
		
	}
}
