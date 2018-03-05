package codeforces.solutions;
import java.util.Scanner;
public class solution318A {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        long limit = myscanner.nextLong();
        long k = myscanner.nextLong();
        long p,out;
        if(limit%2==0)
        {
            p = limit/2;
        }
        else 
        {
            p =(limit/2)+1;
        }
        
        if(k<=p)
        {
            out = (2*k)-1;
        }
        else 
        {
            out = (k-p)*2;
        }
        System.out.println(out);
    }
}
