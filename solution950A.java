package codeforces.solutions;
import java.util.Scanner;
public class solution950A {
    public static void main(String[] args) {

        Scanner myscanner = new Scanner(System.in);
        int a = myscanner.nextInt();
        int b = myscanner.nextInt();
        int c = myscanner.nextInt();
        
        int counter=0, counter1=0;
        
        while(a<b && c>0)
        {
            a++;
            c--;
        }
        while(b<a && c>0)
        {
            b++;
            c--;
        }
        
        a+= (c/2);
        b+= (c/2);
        
        System.out.println(2*(Math.min(a, b)));
    }
    
}
