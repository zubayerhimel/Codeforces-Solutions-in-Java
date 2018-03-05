package codeforces.solutions;
import java.util.Scanner;
public class solution379A {

    public static void main(String[] args) {
	
		Scanner myscanner  = new Scanner(System.in);
		int a = myscanner.nextInt();
		int b = myscanner.nextInt();
		int rest = 0;
		int count  = 0;
		while(a > 0){
			count+= a;
			rest += a%b;
			a = a/b;
			if(rest >= b){
				a+=1;
				rest -= b;
			}
		}
		System.out.println(count);
	}
}
    

