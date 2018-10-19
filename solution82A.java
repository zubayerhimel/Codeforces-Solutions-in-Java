package Code;

import java.util.Scanner;

public class solution82A {
    public static void main(String[] args) {

        Scanner myscanner = new Scanner(System.in);
        String names[] = {"Sheldon", "Leonard", "Penny", "Rajesh", "Howard"};
        int number = myscanner.nextInt();

        while(number>5)
        {
            number = (number/2)-2;
        }
        System.out.println(names[number-1]);

    }
}
