package codeforces.solutions;

import java.util.Scanner;
public class solution723A {
    
    public static void main(String[] args) {
        
        Scanner myscanner = new Scanner(System.in);
        
        int a,b,c,p1,p;
        
        a = myscanner.nextInt();
        b = myscanner.nextInt();
        c = myscanner.nextInt();
        
        p1 = Math.min(a, (Math.min(b, c)));
        p = Math.max(a, (Math.max(b, c)));
        
        System.out.println(p-p1);
        
    }
}
