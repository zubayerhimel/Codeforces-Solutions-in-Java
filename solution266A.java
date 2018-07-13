package DIU_ICPC;
import java.util.Scanner;
public class Main_Stone {

	public static void main(String[] args) {
		Scanner myscanner = new Scanner(System.in);
		int limit = myscanner.nextInt();
		String str = myscanner.next();
		int count=0;
		for(int i=1; i<limit; i++)
		{
			if(str.charAt(i) == str.charAt(i-1))
			{
				count++;
			}
		}
		System.out.println(count);
		myscanner.close();
	}
}
