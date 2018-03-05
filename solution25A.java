package codeforces.solutions;
import java.util.Scanner;
public class solution25A {
    public static void main(String[] args) {

        Scanner myscanner = new Scanner (System.in);
        int limit = myscanner.nextInt();
        int counter=0, laste=0,lasto=0;
        for(int i=1; i<=limit; i++)
        {
            int number = myscanner.nextInt();
            if(number%2==0)
            {
                counter++;
                 laste = i;
            }
            else{
                counter--;
                lasto = i;
            }
        }
        
       if(counter>0)
       {
           System.out.print(lasto);
       }
       else 
       {
           System.out.print(laste);
       }
    }
    
}
