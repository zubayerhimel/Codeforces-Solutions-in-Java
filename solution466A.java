package codeforces.solutions;

import java.util.Scanner;
public class solution466A {
    
    public static void main(String[] args) {
        
        Scanner myscanner = new Scanner(System.in);
        int n = myscanner.nextInt();
        int m = myscanner.nextInt();
        int a = myscanner.nextInt();
        int b = myscanner.nextInt();
        
        int ans, test, test2;
        
        if((m*a)<=b)
        {
            ans = n*a;
            System.out.println(ans);
        }
        else 
        {
            test = ((n/m)*b)+b;
            test2 = ((n/m)*b) + (n%m)*a;
            ans = Math.min(test, test2);
            System.out.println(ans);
        }
    }
}
