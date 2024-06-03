package stringProjectAssigment;
import java.util.HashMap;
import java.util.Map;
public class CharFrequency {
	
	    public static Map<Character, Integer> charFrequency(String str) {
	        Map<Character, Integer> freqMap = new HashMap<>();
	        for (char c : str.toCharArray()) {
	            // Using manual check instead of getOrDefault
	            if (freqMap.containsKey(c)) {
	                freqMap.put(c, freqMap.get(c) + 1);
	            } else {
	                freqMap.put(c, 1);
	            }
	        }
	        return freqMap;
	    }
	}

