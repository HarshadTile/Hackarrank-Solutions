import java.util.Scanner;

public class Solution16 {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        for (int i = 0; i <= s.length() - k; i++) {
        String currentSubstring = s.substring(i, i + k);
        
        // Initialize smallest and largest with the first substring
        if (i == 0) {
            smallest = currentSubstring;
            largest = currentSubstring;
        }
        
        // Compare and update smallest and largest
        if (currentSubstring.compareTo(smallest) < 0) {
            smallest = currentSubstring;
        }
        if (currentSubstring.compareTo(largest) > 0) {
            largest = currentSubstring;
        }
    }
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}