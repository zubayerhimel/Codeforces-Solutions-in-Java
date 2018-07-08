package codeforces.solutions;
import java.util.Scanner;
public class solution313A {
    
    public static void main(String[] args) {
        
        Scanner myscanner = new Scanner(System.in);
        int n = myscanner.nextInt();
        
        if(n>=0)
        {
            System.out.println(n);
        }
        else 
        {
            int a = n/10;           
            int b = n/100*10 + n%10;
            System.out.println(Math.max(a, b));
        }
    }   
}
