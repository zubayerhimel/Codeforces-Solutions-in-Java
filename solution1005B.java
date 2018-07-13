package Codeforces_Solution;
	import java.util.Scanner;
	public class solution1005B {
	
		public static void main(String[] args) {
	
			Scanner myscanner = new Scanner(System.in);
			String firstString = myscanner.next();
			String secondString = myscanner.next();
			
			int i = firstString.length() -1;
			int j = secondString.length() -1;
			int counter=0;
			
			while(i>=0 && j>=0)
			{
				if(firstString.charAt(i) == secondString.charAt(j))
				{
					counter+=2;
				}
				else
				{
					break;
				}
				i--;j--;
			}
			System.out.println((firstString.length() + secondString.length() - counter));
			myscanner.close();
		}
	}
