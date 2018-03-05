package codeforces.solutions;
import java.util.Scanner;
public class solution41A {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        String str = myscanner.next();
        String reverse = myscanner.next();
                
        String reverse1 = new StringBuffer(reverse).reverse().toString();
        
        if(reverse1.equals(str))
        {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }           
    }    
}
