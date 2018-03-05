package codeforces.solutions;
import java.util.Scanner;
public class solution460A {
    public static void main(String[] args) {

        Scanner myscanner = new Scanner(System.in);
        
        int initialSocks = myscanner.nextInt();
        int buyingSocks = myscanner.nextInt();
        
        int sum = initialSocks;
        while(initialSocks>= buyingSocks)
        {
            int division = initialSocks/buyingSocks;
            sum +=division;
            int mod = (initialSocks%buyingSocks);
            initialSocks = (division+mod);
        }
        
        System.out.println(sum);
    }
    
}
