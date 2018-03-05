package codeforces.solutions;
import java.util.Scanner;
public class solution546A {
    public static void main(String[] args) {

        Scanner myscanner = new Scanner(System.in);
        int k,n,w,p=1,b=0,cost=0;
        k = myscanner.nextInt();
        n = myscanner.nextInt();
        w = myscanner.nextInt();
        
        while(p<=w)
        {
            b =(p*k);
            cost+=b;
            p++;
        }
        if(cost>n)
        {
            System.out.println((cost-n));
        }
        else 
        {
            System.out.println("0");
        }
                
    }
    
}
