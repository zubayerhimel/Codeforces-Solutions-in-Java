package codeforces.solutions;
import java.util.Scanner;
public class solution228A {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        int sock[] = new int [4];
        for(int i = 0; i<4; i++)
        {
            sock[i] = myscanner.nextInt();
        }
        int counter =1, result =0;
        if(sock[0]!= sock[1] && sock[0]!= sock[2] && sock[0]!= sock[3])
        {
            counter++;
        }
        if(sock[1]!= sock[2] && sock[1]!= sock[3])
        {
            counter++;
        }
        if(sock[2]!= sock[3])
        {
            counter++;
        }
        result = 4-counter;
        System.out.println(result);
        
    }
}
