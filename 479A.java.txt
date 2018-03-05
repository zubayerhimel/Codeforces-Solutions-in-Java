package codeforces.solutions;
import java.util.Scanner;
public class solution479A {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        int a = myscanner.nextInt();
        int b = myscanner.nextInt();
        int c = myscanner.nextInt();
        
        int sum,max;
        sum = a+b*c;
        max = sum;
        sum = a*(b+c);
        if(sum>max)
            max = sum;
        sum = a*b*c;
        if(sum>max)
            max = sum;
        sum = (a+b)*c;
        if(sum>max)
            max = sum;
        sum = a*b+c;
        if(sum>max)
            max = sum;
        sum = a+(b*c);
        if(sum>max)
            max = sum;
        sum = a+b+c;
        if(sum>max)
            max = sum;
        
        System.out.println(max);
    } 
}
