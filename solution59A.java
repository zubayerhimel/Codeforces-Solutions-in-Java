package codeforces.solutions;
import java.util.Scanner;
public class solution59A {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        String str = myscanner.next();
        int lower=0,upper=0;
        for(int i=0; i<str.length();i++)
        {
            if(str.charAt(i)>='a' && str.charAt(i)<='z') 
            {
                lower++;
            }
        }
        for(int i=0; i<str.length();i++)
        {
            if(str.charAt(i)>='A' && str.charAt(i)<='Z') 
            {
                upper++;
            }
        }
        System.out.print(lower);
        System.out.println(upper);
                
        if(upper> lower)
        {
            System.out.print(str.toUpperCase());
        }
        else 
        {
            System.out.print(str.toLowerCase());
        }          
    } 
}
