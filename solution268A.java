package codeforces.solutions;
import java.util.Scanner;
public class solution268A {
    public static void main(String[] args) {

        Scanner myscanner = new Scanner(System.in);
        int limit = myscanner.nextInt();
        
        int h[] = new int [101];
        int aw[] = new int [101];
        int count=0;
        for(int i=0; i<limit; i++)
        {
            h[i] = myscanner.nextInt();
            aw[i] = myscanner.nextInt();
        }
        
        for(int i=0; i<limit; i++)
        {
            for(int j=0; j<limit; j++)
            {
                if((i!=j) && h[i]==aw[j])
                {
                    count++;
                }
            }
        }
        
        System.out.println(count);
    }
    
}
