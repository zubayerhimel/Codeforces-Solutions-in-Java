package codeforces.solutions;
import java.util.Scanner;
import java.util.Arrays;
public class solution141A {
    public static void main(String[] args) {

        Scanner myscanner = new Scanner(System.in);
        String a = myscanner.next();
        String b = myscanner.next();
        String c = myscanner.next();
        
        String sumofab = a+b;
        
        char arrayofab[] = sumofab.toCharArray();
        Arrays.sort(arrayofab);
        String sortedab = String.valueOf(arrayofab);
        
        char sortc[] = c.toCharArray();
        Arrays.sort(sortc);
        String sortedc = String.valueOf(sortc);
        
        if(sortedab.equals(sortedc))
        {
            System.out.println("YES");
        }
        else 
        {
            System.out.println("NO");
        }
        
    }
    
}
