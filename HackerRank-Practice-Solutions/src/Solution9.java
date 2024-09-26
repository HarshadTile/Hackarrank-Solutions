import java.util.Scanner;

public class Solution9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int intvalue = scanner.nextInt();
        double doublevalue = scanner.nextDouble();
        scanner.nextLine(); // Consume the leftover newline character
        String svalue = scanner.nextLine();
        
        System.out.println("String: " + svalue);
        System.out.println("Double: " + doublevalue);
        System.out.println("Int: " + intvalue);
    }
}
