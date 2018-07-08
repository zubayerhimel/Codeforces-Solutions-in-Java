package codeforces.solutions;
import java.util.Scanner;
public class solution469A {
    
    public static void main(String[] args) {
        
        Scanner myscanner = new Scanner(System.in);
        
        int level = myscanner.nextInt();
        int array[] = new int [level*2];
        int count =0;
        
        int x = myscanner.nextInt();
        for(int i=0; i<x; i++)
        {
            array[i] = myscanner.nextInt();
        }
        
        int y = myscanner.nextInt();
        for(int i=0; i<y; i++)
        {
            array[i] = myscanner.nextInt();
        }
        
        
        for(int k=0; k<level; k++)
        {
            for(int i=0; i<(x+y); i++)
            {
                if(k == array[i])
                {
                    count++;
                }
            }
        }
        
        if(count == level)
        {
            System.out.println("I become the guy.");
        }
        else 
        {
            System.out.println("Oh, my keyboard!");
        }
        
    }
}
