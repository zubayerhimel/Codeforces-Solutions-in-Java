package codeforces.solutions;
import java.util.Scanner;
public class solution263A {
    
    public static void main(String[] args) {
        
        Scanner myscanner = new Scanner(System.in);
        
        for(int i=0; i<5; i++)
        {
            for(int j=0; j<5; j++)
            {
                int x  = myscanner.nextInt();
                if(x!=0)
                {
                    System.out.print(Math.abs(i-2)+ Math.abs(j-2));
                }
            }
        }
    }
}
