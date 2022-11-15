package staffIT;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ArmsStrong {

	public static boolean isArmStrongNo(int n) {

		double sum = 0;
		int length = 0;
		int n1 = n;
		int n2 = n;

		while (n1 > 0) {
			int temp;
			temp = n1 % 10;
			length++;
			n1 = n1 / 10;
		}

		System.out.println(length);

		while (n2 > 0) {
			int temp;
			temp = n2 % 10;
			sum+= Math.pow(temp, length);
			n2 = n2/10;
		}
		
		System.out.println(sum);

		return false;

	}

	public static void main(String[] args) {
		System.out.println(isArmStrongNo(300));
	}

}
