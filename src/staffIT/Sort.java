package staffIT;

public class Sort {

	public static int[] sortmethod(int[] a) {

		for (int i = 0; i < a.length; i++) {

			for (int j = i; j < a.length; j++) {
				int temp;

				if (a[j] < a[i]) {
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		
//		Arrays.sort(a);

		return a;

	}
	
	int[][] b = new int[2][2];
	
	public static int[][] sortmethod2(int[][] a) {
		
		for(int row = 0; row < a.length; row++) {
			
			sortmethod(a[row]);
		}
		
		for(int i = 0; i < a.length; i++) {
			
			for (int j = i; j < a.length; j++) {
				int[] temp;

				if (a[j][0] < a[i][0]) {
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
			
		}
		
		
		return a;
		
	}
	
	
	}

	
	


