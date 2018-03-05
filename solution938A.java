package codeforces.solutions;
import java.util.Scanner;
public class solution938A {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        int n = myscanner.nextInt();
        String str = myscanner.next();
        int k=0;
        for(int i=0; i<n; i++)
        {
            if((str.charAt(i)=='a' || str.charAt(i)=='e' ||str.charAt(i)=='i'||str.charAt(i)=='o')||str.charAt(i)=='u'||str.charAt(i)=='y')
            {
                k++;
            }
            else k=0;
           if(k<=1) System.out.printf("%c", str.charAt(i));
        }
    }
}
