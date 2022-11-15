package staffIT;

import java.util.HashMap;
import java.util.List;

public class ApplePeople {

	public static HashMap<String, Integer> returnMap(List<String> people, List<Integer> apple) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i < people.size(); i++) {
			map.put(people.get(i), apple.get(i));

		}

		return map;

	}

}
