package Codeforces_Solution;

import java.util.Scanner;

public class solution791A {

	public static void main(String[] args) {

		Scanner myScanner = new Scanner(System.in);
		int a = myScanner.nextInt();
		int b = myScanner.nextInt();
		
		int i =1;
		while(i>0)
		{
     		a *= 3;
     		b *= 2;
			if(a > b)
			{	
				break;
			}
			i++;
		}
		
		System.out.println(i);
		myScanner.close();
	}
}
