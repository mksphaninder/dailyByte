public class Stocks {
	public static void main(String[] args) {
		int[] sample1 = { 4, 5, 2, 1, 6, 10, 4, 9, 11 };
		int[] sample2 = { 1, 2, 3, 4, 5 };
		int[] sample3 = { 33, 18, 8, 2 };
		System.out.println(bestStocks(sample1));
		System.out.println(bestStocks(sample2));
		System.out.println(bestStocks(sample3));
	}

	public static int bestStocks(int[] stocks) {
		int min = stocks[0];
		int max = stocks[0];
		int minIndex = 0;
		int maxIndex = 0;
		for (int i = 0; i < stocks.length; i++) {

			if (min > stocks[i]) {
				min = stocks[i];
				minIndex = i;
			}

			if (max < stocks[i]) {
				max = stocks[i];
				maxIndex = i;
			}
		}

		if (minIndex > maxIndex) {
			return 0;
		} else {
			return max - min;
		}
	}
}
