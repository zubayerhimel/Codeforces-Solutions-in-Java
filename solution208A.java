package codeforces.solutions;
import java.util.Scanner;
public class solution208A {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        String str = myscanner.next();
        System.out.println(str.replaceAll("WUB", " ").trim());
    }
}
