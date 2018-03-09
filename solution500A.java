package codeforces.solutions;
import java.util.Scanner;
public class solution500A {

    public static void main(String[] args) {

        Scanner myscanner = new Scanner(System.in);
        int limit = myscanner.nextInt();
        int t = myscanner.nextInt();
        
        int arr[] = new int [limit-1];
        
        for(int i=0; i<limit-1; i++)
        {
            arr[i] = myscanner.nextInt();
        }
        
        for(int i=0; i<limit-1;)
        {
             i= i+arr[i];
            if(i == (t-1))
            {
                System.out.println("YES");
                System.exit(0);
            }
        }
        System.out.println("NO");
        
    }
}
