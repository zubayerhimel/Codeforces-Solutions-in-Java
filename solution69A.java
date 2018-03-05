package codeforces.solutions;
import java.util.Scanner;
public class solution69A {
    public static void main(String[] args) {

        Scanner myscanner = new Scanner(System.in);
        int limit = myscanner.nextInt();
        int sum1=0,sum2=0,sum3=0,x=0,y=0,z=0;
        for(short i=0; i<limit; i++)
        {
            x = myscanner.nextInt();
            y = myscanner.nextInt(); 
            z = myscanner.nextInt();
            sum1+=x; 
            sum2+=y;sum3+=z;
           
        }
         if(sum1==0&& sum2==0 && sum3== 0)
            {
                System.out.println("YES");
            }
            else 
            {
                System.out.println("NO");
            }
    }
    
}
