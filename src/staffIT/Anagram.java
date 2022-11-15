package staffIT;

import java.util.Arrays;

public class Anagram {
	
	public static boolean isAnagram(String s1, String s2) {
		
		char[] a = s1.toCharArray();
		char[] b = s2.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);

		if(Arrays.equals(a, b)) {
			return true;
		}
	
		return false;
		
	}

}
