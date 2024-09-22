import java.util.Scanner;

public class Solution4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read inputs
        int intValue = scanner.nextInt();
        double doubleValue = scanner.nextDouble();
        // Consume the newline character left after nextDouble(), before reading the String
        scanner.nextLine();
        String stringValue = scanner.nextLine();

        // Print outputs
        System.out.println("String: " + stringValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("Int: " + intValue);

        scanner.close();
    }
}