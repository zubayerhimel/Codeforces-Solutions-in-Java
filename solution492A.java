package Codeforces_Solution;

import java.util.Scanner;

public class solution492A {

	public static void main(String[] args) {

		Scanner myScanner = new Scanner(System.in);
		int cubeNumber = myScanner.nextInt();
		int i =1;
		int sum =0, temp=0, height=0;
		while(i>0)
		{
			sum +=i; temp+=sum;
			if(temp > cubeNumber)
			{
				break;
			}
			height++;
			i++;
		}
		System.out.println(height);
		myScanner.close();
	}

}
