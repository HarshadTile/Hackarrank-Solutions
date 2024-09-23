import java.util.Scanner;

public class Solution5 {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     
     System.out.println("==========================");
     
     while(scanner.hasNext())
     {
    	 String str =scanner.next();
    	 int num = scanner.nextInt();
    	 
    	 System.out.printf("%-15s%03d\n",str,num);
     }
     System.out.println("============================");
     scanner.close();
    }
}




