import java.util.Scanner;
import java.util.regex.*;

public class Solution20
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
        
		while(testCases>0){
			String pattern = in.nextLine();
          	//Write your code
           isValidRegex(pattern);
           testCases--;
            
		}
        in.close();
	}
    public static void isValidRegex(String Rg){
        try{
            Pattern.compile(Rg);
            System.out.println("Valid");
        }
        catch(PatternSyntaxException e){
            System.out.println("Invalid");
        }
    }
    
}



