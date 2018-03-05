package codeforces.solutions;
import java.util.Scanner;
import java.util.HashSet;
public class solution443A {
    public static void main(String[] args) {

        Scanner myscanner = new Scanner(System.in);
       HashSet<Character> test = new HashSet<>();
		
		String given = myscanner.nextLine();
		
		for(int i=0;i<given.length();i++){
			if(given.charAt(i)>= 'a' && given.charAt(i)<= 'z')
				test.add(given.charAt(i));
		}
		System.out.print(test.size());
    }
}
