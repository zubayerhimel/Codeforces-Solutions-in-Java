package Codeforces_Solution;
import java.util.Scanner;
public class solution236A {

	public static void main(String[] args) {

		Scanner myscanner = new Scanner(System.in);
		String userName = myscanner.next();
		if(countDistinctNumber(userName) %2 == 0)
		{
			System.out.println("CHAT WITH HER");
		}
		else
		{
			System.out.println("IGNORE HIM!");
		}
	
		myscanner.close();
	}
	
	public static int countDistinctNumber(String str)
	{
		return  (int) str.chars().distinct().count();
	}
}
