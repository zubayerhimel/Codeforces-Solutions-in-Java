package codeforces.solutions;
import java.util.Scanner;
public class solution677A {
    public static void main(String[] args) {
        
        Scanner myscanner = new Scanner(System.in);
        int friends[] = new int[1001];
        int numberOfFriends = myscanner.nextInt();
        int height = myscanner.nextInt();
        int counter=0;
        for(int i=0; i<numberOfFriends; i++)
        {
            friends[i] = myscanner.nextInt();
        }
        
        for(int i=0; i<numberOfFriends; i++)
        {
            if(friends[i]<=height)
            {
                counter+=1;
            }
            else
            {
                counter+=2;
            }
        }
        System.out.println(counter);
    }
}
