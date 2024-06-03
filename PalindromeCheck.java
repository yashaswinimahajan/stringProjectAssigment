package stringProjectAssigment;

public class PalindromeCheck {
	
		public static boolean isPalindrome(String str) {
			String cleaned = str.replaceAll("\\s+", "").toLowerCase();
			String reversed = new StringBuilder(cleaned).reverse().toString();
			return cleaned.equals(reversed);
		}
	}

