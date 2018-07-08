package codeforces.solutions;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class solution4C {
    public static void main(String[] args) {
        
        Scanner myscanner = new Scanner(System.in);
        
        int n = myscanner.nextInt();
        String name[] = new String[n];
        int count =0; 
        
        Map <String, Integer> data = new HashMap<>();
        
        for(int i=0; i<n; i++)
        {
            name[i] = myscanner.next();
            if(data.containsKey(name[i]))
            {
                count++;
                data.put(name[i], count);
                System.out.println(name[i]+count);
            }
            else 
            {
                System.out.println("OK");
                data.put(name[i], 0);
            }
        }
    }
}
