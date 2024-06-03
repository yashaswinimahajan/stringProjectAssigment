package stringProjectAssigment;
import java.util.ArrayList;
import java.util.List;

public class FindPermutations {
	
		public static List<String> findPermutations(String str) {
			List<String> permutations = new ArrayList<>();
			permute(str, 0, str.length() - 1, permutations);
			return permutations;
		}

		private static void permute(String str, int l, int r, List<String> permutations) {
			if (l == r) {
				permutations.add(str);
			} else {
				for (int i = l; i <= r; i++) {
					str = swap(str, l, i);
					permute(str, l + 1, r, permutations);
					str = swap(str, l, i);
				}
			}
		}

		private static String swap(String str, int i, int j) {
			char[] charArray = str.toCharArray();
			char temp = charArray[i];
			charArray[i] = charArray[j];
			charArray[j] = temp;
			return String.valueOf(charArray);
		}
	}

