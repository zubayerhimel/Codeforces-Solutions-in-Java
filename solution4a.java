package codeforces.solutions;
import java.util.Scanner;

public class solution4a {
    
    public static void main(String[] args) {
        
        Scanner myscanner = new Scanner(System.in);
        
        int w = myscanner.nextInt();
        
        if(w>2 && w%2 ==0)
        {
            System.out.println("YES");
        }
        else 
        {
            System.out.println("NO");
        }
    }
}
