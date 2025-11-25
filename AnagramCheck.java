// Import HashMap class for storing character frequencies
import java.util.HashMap;

public class AnagramCheck {

    // Method to check if two strings are anagrams
    public static boolean isAnagram(String s, String t) {
        // Early return: if lengths differ, they cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // Create a HashMap to store character frequencies for string s
        HashMap<Character, Integer> freqS = new HashMap<>();
        // Iterate through each character in string s
        for (char c : s.toCharArray()) {
            // Add character to map or increment its count (getOrDefault returns 0 if key doesn't exist)
            freqS.put(c, freqS.getOrDefault(c, 0) + 1);
        }

        // Create a HashMap to store character frequencies for string t
        HashMap<Character, Integer> freqT = new HashMap<>();
        // Iterate through each character in string t
        for (char c : t.toCharArray()) {
            // Add character to map or increment its count (getOrDefault returns 0 if key doesn't exist)
            freqT.put(c, freqT.getOrDefault(c, 0) + 1);
        }

        // Compare both HashMaps: returns true if they have identical key-value pairs
        return freqS.equals(freqT);
    }

    // Main method to test the anagram checker
    public static void main(String[] args) {
        // Define first test string
        String s = "racecar";
        // Define second test string
        String t = "carrace";
        // Call isAnagram method and store the result
        boolean result = isAnagram(s, t);
        // Print the result to console
        System.out.println("Are they anagrams? " + result);
    }
}
