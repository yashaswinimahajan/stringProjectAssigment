package stringProjectAssigment;
import java.util.Arrays;
import java.util.Collections;

public class ReverseWords {
	
	    public static String reverseWords(String str) {
	        String[] words = str.split("\\s+");
	        Collections.reverse(Arrays.asList(words));
	        return join(" ", words);
	    }

	    private static String join(String delimiter, String[] elements) {
	        StringBuilder sb = new StringBuilder();
	        for (int i = 0; i < elements.length; i++) {
	            sb.append(elements[i]);
	            if (i < elements.length - 1) {
	                sb.append(delimiter);
	            }
	        }
	        return sb.toString();
	    }
	}

