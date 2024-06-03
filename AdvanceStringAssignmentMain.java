package stringProjectAssigment;

public class AdvanceStringAssignmentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				String testStr = "aabcccccaaa";
				String palindromeStr = "A man a plan a canal Panama";
				String str1 = "Listen";
				String str2 = "Silent";
				String uniqueStr = "abcabcbb";
				String removeDupStr = "programming";
				String reverseWordsStr = "Hello World";

				System.out.println("Character Frequency: " + CharFrequency.charFrequency(testStr));
				System.out.println("Is Palindrome: " + PalindromeCheck.isPalindrome(palindromeStr));
				System.out.println("Are Anagrams: " + AnagramCheck.areAnagrams(str1, str2));
				System.out.println("Longest Unique Substring: " + LongestUniqueSubstring.longestUniqueSubstring(uniqueStr));
				System.out.println("Compressed String: " + StringCompression.compressString(testStr));
				System.out.println("All Permutations: " + FindPermutations.findPermutations("DEEP"));
				System.out.println("Remove Duplicates: " + RemoveDuplicates.removeDuplicates(removeDupStr));
				System.out.println("Reverse Words: " + ReverseWords.reverseWords(reverseWordsStr));
			}
		
	}


