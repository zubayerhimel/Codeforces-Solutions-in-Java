package codeforces.solutions;
import java.util.Scanner;
public class solution617A {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        int limit = myscanner.nextInt();
        int result = limit/5;
        
        if(limit%5==0)
        {
            System.out.println(result);
        }
        else 
        {
            System.out.println(result+1);
        }
    }
}
