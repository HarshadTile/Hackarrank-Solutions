import java.util.Scanner;

public class Solution18 {

    static boolean isAnagram(String a, String b) {
        // Complete the function
         if (a.length() != b.length()) {
            return false;
        }

        // Convert strings to lowercase
        a = a.toLowerCase();
        b = b.toLowerCase();

        // Initialize frequency array for 26 letters
        int[] frequency = new int[26];

        // Count frequency for each character in both strings
        for (int i = 0; i < a.length(); i++) {
            frequency[a.charAt(i) - 'a']++;
            frequency[b.charAt(i) - 'a']--;
        }

        // Check if all frequency counts are zero
        for (int count : frequency) {
            if (count != 0) {
                return false;
            }
        }

        return true; // Strings are anagrams
        
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}