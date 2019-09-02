package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int itemsNum = scan.nextInt();
		
		String[] items = new String[itemsNum];
		double[] cost = new double[itemsNum];
		int[] itemNum = new int[itemsNum];
		int[] customer = new int[itemsNum];
		
		for(int i = 0; i < itemsNum; i++) {
			items[i] = scan.next();
			cost[i] = scan.nextDouble();
		}
		
		int cusTotal = scan.nextInt();
		
		String[] custName = new String[cusTotal];
		
		for (int j = 0; j < cusTotal; j++) {
			custName[j] = scan.next() + " " +scan.next();
			int iteamEach = scan.nextInt();
			int[] index = new int[itemsNum];
			for (int k =0; k<iteamEach; k++) {
				int quantity = scan.nextInt();
				String name = scan.next();
				for (int h=0; h<itemsNum; h++) {
					if (name.equals(items[h])) {
						itemNum[h] +=  quantity;
						customer[h] ++;
						index[h]++;
					}
					
				}
		
			
			}

			
		}
		scan.close();
		
		for (int a = 0; a < itemsNum; a++) {
			if (customer[a] != 0) { 
				System.out.println(customer[a] + " customers bought " + itemNum[a] +" " + items[a]);

			} else {
				System.out.println("No customers bought " + items[a]);
			}
		}
	
		
		
		
	}
}
