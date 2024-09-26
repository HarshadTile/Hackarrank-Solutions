import java.util.Scanner;

public class Solution8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int linenumber = 1;
        
        while(scanner.hasNext())
        {
            String String_value = scanner.nextLine();
            System.out.println(linenumber+" "+String_value);
            linenumber++;
        }
        scanner.close();
    }
}
