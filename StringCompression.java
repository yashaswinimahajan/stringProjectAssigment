package stringProjectAssigment;

public class StringCompression {
	
		public static String compressString(String str) {
			StringBuilder compressed = new StringBuilder();
			int count = 1;
			for (int i = 1; i <= str.length(); i++) {
				if (i < str.length() && str.charAt(i) == str.charAt(i - 1)) {
					count++;
				} else {
					compressed.append(str.charAt(i - 1)).append(count);
					count = 1;
				}
			}
			return compressed.length() < str.length() ? compressed.toString() : str;
		}
	}

