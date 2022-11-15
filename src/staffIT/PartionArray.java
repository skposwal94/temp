package staffIT;

public class PartionArray {

	public static boolean ispartitionArray(int[] array) {

		if (array.length <= 1) {
			return false;
		}

		int product = 1;

		for (int i : array) {
			product = product * i;
		}

		for (int j : array) {
			if (product / j == j) {
				return true;
			}

		}

		return false;

	}

	public static boolean ispartitionArray2(int[] array) {
		
		if (array.length <= 1) {
			return false;
		}
		
		for(int i  = 0; i < array.length ; i++) {
			int product = 1;
			for (int j = 0; j < array.length; j++) {
				if(j != i) {
					product = product * array[j];
				}
			}
			
			if(product == array[i]) {
				return true;
			}
			
		}
		
		return false;

	}
}
