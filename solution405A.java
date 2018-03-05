package codeforces.solutions;
import java.util.Scanner;
public class solution405A {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        int gravity = myscanner.nextInt();
        int arr[] = new int [gravity];
        for(int i=0; i<gravity; i++)
        {
            arr[i] = myscanner.nextInt();
        }
       int temp;
        for(int i=0; i<gravity; i++)
        {
            int flag = 0;
            for(int j= 0; j<gravity-1-i; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = 1;
                }
            }
            if(flag == 0)
            {
                break;
            }
        }
        
        for(int x: arr)
        {
            System.out.print(x+" ");
        }
    }
}
