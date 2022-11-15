package staffIT;

public class StockQues {

	public static void stockEstimator(int[] a) {

		int buyingDay = 0;;
		int sellingDay = 0;

		int profit = 0;

		for (int i = a.length - 1; i >= 0; i--) {

			for (int j = 0; j < i; j++) {
				int temp;
				temp = a[i] - a[j];
				if (temp > profit) {
					profit = temp;
					buyingDay = i + 1;
					sellingDay = j + 1;
				}
			}
		}
		
		System.out.println("Buying day: " + buyingDay);
		System.out.println("Selling day: " + sellingDay);
		System.out.println("Profit is: " + profit);


	}

}
