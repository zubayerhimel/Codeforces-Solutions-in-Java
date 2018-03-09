package codeforces.solutions;
import java.util.Scanner;
public class solution1A {

    public static void main(String[] args) {

        Scanner myscanner = new Scanner(System.in);
        double n = myscanner.nextInt();
        double m = myscanner.nextInt();
        double a = myscanner.nextInt();
        
//        double row = Math.ceil(n/a);
//        double column = Math.ceil(m/a);
//        int result = () (row*column);
//        System.out.println(result);
System.out.println((long)(Math.ceil(n/a) * Math.ceil(m/a)));	
    }
}
