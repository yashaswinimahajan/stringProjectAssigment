package stringProjectAssigment;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
	
		public static String removeDuplicates(String str) {
			StringBuilder result = new StringBuilder();
			Set<Character> seen = new HashSet<>();
			for (char c : str.toCharArray()) {
				if (!seen.contains(c)) {
					seen.add(c);
					result.append(c);
				}
			}
			return result.toString();
		}
	}

