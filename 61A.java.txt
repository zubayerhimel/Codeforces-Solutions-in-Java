package codeforces.solutions;
import java.util.Scanner;
public class solution61A {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        String one = myscanner.next();
        String two = myscanner.next();
        
        int len = one.length();
        
        for(int i=0; i<len; i++)
        {
            char a = one.charAt(i);
            char b = two.charAt(i);
            
            if((a == '0' && b=='0') || (a=='1' && b == '1'))
               {
                    System.out.print("0");
               }
               else 
               {
                    System.out.print("1");
               }
       }
    }
}
