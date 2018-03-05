package codeforces.solutions;
import java.util.Scanner;
public class Solution2 {
    public static void main(String[] args) 
    {
        Scanner myscanner = new Scanner(System.in);
        int limit = myscanner.nextInt();
        for(int i=0; i<limit; i++)
        {
            String str = myscanner.next();
            int n = str.length();           
            if (n<10)
            {
                System.out.println(str);
            }
            else 
            {
                 char firstChar = str.charAt(0);
                 char lastChar = str.charAt(str.length()-1);
                 int total = str.length()-2;
                 System.out.printf("%c%d%c\n", firstChar,total,lastChar);
            }
        }
    }
}
