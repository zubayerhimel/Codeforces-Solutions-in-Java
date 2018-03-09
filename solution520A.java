package codeforces.solutions;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
public class solution520A {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        int limit = myscanner.nextInt();
        myscanner.nextLine();
        String pangram = myscanner.nextLine();
        
        String str = pangram.toLowerCase();
        Set <Integer> alphabet = new HashSet<>(26);
        int flag =0, found =0;
        for (char c : str.toCharArray()) 
        {
        int n = c - 'a';
        if (n >= 0 && n < 26) 
        {
            if (alphabet.add(n)) 
            {
                flag += 1;
                if (flag == 26) 
                {
                    System.out.println("YES");
                    found =1;
                    break;
                }
            }
        }
        }
        if(found == 0)
        {
            System.out.println("NO");
        }
    }
}
