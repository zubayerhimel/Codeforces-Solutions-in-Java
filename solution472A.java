package codeforces.solutions;
import java.util.Scanner;
public class solution472A {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        int n = myscanner.nextInt();
        
        if(n%2==0)
        {
            System.out.print(8+" "+(n-8));
        }
        else 
        {
            System.out.print(9+" "+(n-9));
        }
    }   
}
