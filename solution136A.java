package codeforces.solutions;
import java.util.Scanner;
public class solution136A {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        int n = myscanner.nextInt();
        int arr[] = new int [n];
        
        for(int i=0; i<n; i++)
        {
            arr[i] = myscanner.nextInt();
        }
        
        for(int j=1; j<=n; j++)
        {
            for(int i=0; i<n; i++)
            {
                if(arr[i] == j)
                {
                    System.out.print(i+1+" ");
                }
            }
        }
    }
}
