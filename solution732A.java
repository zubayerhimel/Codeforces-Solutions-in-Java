package Codeforces_Solution;

import java.util.Scanner;

public class solution732A {

	public static void main(String[] args) {

		Scanner myscanner = new Scanner(System.in);
		int k = myscanner.nextInt();
		int r = myscanner.nextInt();
		int noOfShovel = 0, i=1;
		
		while(i>0)
		{
			if(k * i % 10 == 0 || k * i % 10 == r)
			{
				noOfShovel = i;
				break;
			}
			i++;
		}
		System.out.println(noOfShovel);
		myscanner.close();
	}

}
