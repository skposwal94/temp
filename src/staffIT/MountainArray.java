package staffIT;

public class MountainArray {

	public static boolean isMounainArray(int[] a) {

		if (a.length < 3) {
			return false;
		}

		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < a[i+1]) {
				count++;
			} else
				break;
		}

		if (count == 0 || count == a.length - 1) {
			return false;
		}

		for (int i = count + 1; i < a.length; i++) {
			if (a[i - 1] > a[i]) {
				count++;
			} else
				break;

		}

		if (count == a.length - 1) {
			return true;
		} else
			return false;

	}

	public static void main(String[] args) {
		
		int[] a1 = { 1, 2, 3, 4, 9, 8, 7, 6, 4 };

		System.out.println(isMounainArray(a1));

	}

}
