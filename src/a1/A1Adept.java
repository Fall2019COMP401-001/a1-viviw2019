package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		// itemsNum is the total number of items on the list
		int itemsNum = scan.nextInt();
		
		String[] items = new String[itemsNum];
		double[] price = new double[itemsNum];
		
		for(int i = 0; i < itemsNum; i++) {
			items[i] = scan.next();
			price[i] = scan.nextDouble();
			
		}
		
		// custNum is the total number of customers on the list
		int custNum = scan.nextInt();
		

		String[] custName = new String[custNum];

		double[] cost = new double [custNum];
		
		for (int j = 0; j < custNum; j++) {
			custName[j] = scan.next() + " " +scan.next();
			int itemsEach = scan.nextInt();
			double total = 0.0;
			
			for (int k=0; k<itemsEach; k++) {
				int quantEach = scan.nextInt();
				String itemName = scan.next();
				
				for (int h=0; h<itemsNum; h++) {
					
					if (itemName.equals(items[h])) {
						total += quantEach * price[h];
					}
				}
			}
		cost[j] = total;
			
		}
		
		int maxIndex = 0;
		double max = 0.0;
		for (int a=0; a<custNum; a++) {
			if(cost[a] > max) {
				max = cost[a];
				maxIndex = a;
			}
		}
		
		int minIndex = 0;
		double min = cost[0];
		for (int b=0; b<custNum; b++) {
			if(cost[b] < min) {
				min = cost[b];
				minIndex = b;
			}
		}
		
		double sum = 0.0;
		for (int c=0; c<custNum; c++) {
			sum = sum + cost[c];
		}
		
		double average = sum / custNum;
		scan.close();
		
		System.out.println("Biggest: " + custName[maxIndex] + " (" + String.format("%.2f",max) + ")"  );
		System.out.println("Smallest: " + custName[minIndex] + " (" + String.format("%.2f",min) + ")"  );
		System.out.println("Average: " + String.format("%.2f",average));
	
		
		
	
	}
}
