package codeforces.solutions;
import java.util.Scanner;
public class solution734A {
    public static void main(String[] args) {

        Scanner myscanner = new Scanner(System.in);
        int counter=0,counter1=0;
        int limit = myscanner.nextInt();
        myscanner.nextLine();
        String game = myscanner.nextLine();
        
      
        for(int i=0; i<limit; i++)
        {
            if(game.charAt(i) == 'A')
            {
                counter++;
            }
            else
            {
                counter1++;
            }
        }
        if(counter>counter1)
        {
            System.out.println("Anton");
        }
        else if(counter<counter1)
        {
            System.out.println("Danik");
        }
        else 
        {
            System.out.println("Friendship");
        }
    }
}
