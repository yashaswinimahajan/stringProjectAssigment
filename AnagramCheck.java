package stringProjectAssigment;
import java.util.Arrays;
public class AnagramCheck {
	
		public static boolean areAnagrams(String str1, String str2) {
			String cleaned1 = str1.replaceAll("\\s+", "").toLowerCase();
			String cleaned2 = str2.replaceAll("\\s+", "").toLowerCase();
			char[] arr1 = cleaned1.toCharArray();
			char[] arr2 = cleaned2.toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			return Arrays.equals(arr1, arr2);
		}
	}

