import java.util.Scanner;

public class Solution19 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String s = scan.nextLine();
    int count = 0;
    String a = "[^A-Za-z]+";
    s = s.trim();
    String [] x = s.split(a);
    // System.out.println(x.length);
      if(s.isEmpty()){
        count = 0;
    }else {
        for (String s1 : x) {
            count++;
        }
    }
    System.out.println(count);
     for(String s1 : x){
        if(!s1.isEmpty()){
        System.out.println(s1);
        }
    }
    // Write your code here.
    scan.close();
}
        
    
}
