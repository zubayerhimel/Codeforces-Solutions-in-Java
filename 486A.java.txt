package codeforces.solutions;
import java.util.Scanner;
public class solution486A {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        long sum;
        long limit = myscanner.nextLong();
        
        if(limit%2==0) sum = limit/2;
        else sum = (-1)*(limit/2+1);
        System.out.println(sum);
    }    
}
