package codeforces.solutions;
import java.util.Scanner;
public class solution937A {
    public static void main(String[] args) {
        
        Scanner myscanner = new Scanner(System.in);
        
        int limit = myscanner.nextInt();
        int arr[] = new int [limit];
        
        for(int i=0; i<limit; i++)
        {
            arr[i] = myscanner.nextInt();
        }
       int i,j,count=0;
       for(i=0; i<limit; i++)
       {
           for(j=0; j<i; j++)
           {
               if(arr[i] == arr[j] || arr[j]==0 || arr[i]==0)
               {
                   break;
               }
           }
            if(i==j)
               {
                   count++;
               }
       }
        System.out.println(count);
    }
}
