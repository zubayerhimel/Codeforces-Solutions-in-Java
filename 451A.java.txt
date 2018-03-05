package codeforces.solutions;
import java.util.Scanner;
public class solution451A {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        int x = myscanner.nextInt();
        int y = myscanner.nextInt();
        int min;
        if(x>y) min = y;
        else min = x;
            
        if(min%2==0) System.out.println("Malvika");
        else System.out.println("Akshat");
    }
}
