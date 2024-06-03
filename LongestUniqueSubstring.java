package stringProjectAssigment;
import java.util.HashSet;
import java.util.Set;

public class LongestUniqueSubstring {
	
		public static String longestUniqueSubstring(String str) {
			String longest = "";
			String current = "";
			Set<Character> seen = new HashSet<>();
			for (char c : str.toCharArray()) {
				while (seen.contains(c)) {
					seen.remove(current.charAt(0));
					current = current.substring(1);
				}
				seen.add(c);
				current += c;
				if (current.length() > longest.length()) {
					longest = current;
				}
			}
			return longest;
		}
	}

