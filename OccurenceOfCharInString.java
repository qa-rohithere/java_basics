How to get distinct characters and their count in a String?

// Java prorgam to count frequencies of 
// characters in string using Hashmap 
/**
*Declare a Hashmap in Java of {char, int}.
*Traverse in the string, check if the Hashmap already contains the traversed character or not.
*If it is present, then increase its count using get() and put() function in Hashmap.
*Once the traversal is completed, traverse in the Hashmap and print the character and its frequency.
*Below is the implementation of the above approach.
*/
import java.io.*; 
import java.util.*; 
public class OccurenceOfCharInString { 
	static void characterCount(String inputString) 
	{ 
		// Creating a HashMap containing char 
		// as a key and occurrences as a value 
		HashMap<Character, Integer> charCountMap 
			= new HashMap<Character, Integer>(); 

		// Converting given string to char array 

		char[] strArray = inputString.toCharArray(); 

		// checking each char of strArray 
		for (char c : strArray) { 
			if (charCountMap.containsKey(c)) { 

				// If char is present in charCountMap, 
				// incrementing it's count by 1 
				charCountMap.put(c, charCountMap.get(c) + 1); 
			} 
			else { 

				// If char is not present in charCountMap, 
				// putting this char to charCountMap with 1 as it's value 
				charCountMap.put(c, 1); 
			} 
		} 

		// Printing the charCountMap 
	System.out.println(charCountMap);
	} 

	// Driver Code 
	public static void main(String[] args) 
	{ 
		String str = "Ajitj"; 
		characterCount(str); 
	} 
} 
