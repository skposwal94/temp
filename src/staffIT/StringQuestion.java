package staffIT;

public class StringQuestion {

	public static String stringModify(double d) {

		String s = String.valueOf(d);

		if (s.charAt(0) == '-') {
			s = "-$" + s.substring(1);
		} else {
			s = "$" + s;
		}

		if (s.charAt(0) == '-') {
			s = s.substring(0, 5) + "," + s.substring(5);
		}

		String[] array = s.split("\\.");

		int n = Integer.valueOf(array[1]);

		while (n > 100) {
			n = n / 10;
		}

		if (n % 10 > 5) {
			n = n + 1;
		}

//		System.out.println(n);

		s = array[0] + "." + n;

		return s;

	}

	public static void main(String[] args) {
		System.out.println(stringModify(-314159.2653));
	}

}
