package codeforces.solutions;
import java.util.Scanner;
public class solution467A {
    public static void main(String[] args) {

        Scanner myscanner = new Scanner(System.in);
        int limit = myscanner.nextInt();
        int count=0;
        for(short i=0; i<limit; i++)
        {
            int a = myscanner.nextInt();
            int b = myscanner.nextInt();
            
            if(b-a>=2)
            {
                count++;
            }
        }
        System.out.println(count);
    }
    
}
