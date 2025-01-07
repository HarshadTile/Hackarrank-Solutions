import java.io.*;
import java.util.*;

public class Solution17 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        
         
        String Palimdrome = "";
        
        for(int i=0;i<A.length();i++){
            Palimdrome = A.charAt(i)+Palimdrome;
        }
        
        
        int k = A.compareTo(Palimdrome);
        if(k==0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}



