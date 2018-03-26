package codeforces.solutions;
import java.util.Scanner;
public class solution339A {

    public static void main(String[] args) {
        
        Scanner myscanner = new Scanner(System.in);
        String s = myscanner.next();
        String mathStr = s.replaceAll("+", "");
        int math = Integer.parseInt(mathStr);
        System.out.println(math);
    }
    
}
