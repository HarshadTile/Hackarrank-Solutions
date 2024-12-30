import java.io.*;
import java.util.*;

public class Solution14 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        
        int Ans1 = A.length();
        int Ans2 = B.length();
        
        System.out.println(Ans1+Ans2);
        
        if(A.compareTo(B)>0){
            System.out.println("Yes");
            
        }
        else
        {
            System.out.println("No");
        }
        
        String capitializeA = A.substring(0,1).toUpperCase()+A.substring(1);
        String capitializeB =B.substring(0,1).toUpperCase()+B.substring(1);
        System.out.println(capitializeA +" "+ capitializeB);
    }
}



