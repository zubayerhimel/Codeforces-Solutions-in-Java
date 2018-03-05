package codeforces.solutions;
import java.util.Scanner;
public class solution158B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		int[] storage = new int[3];
		int groups = input.nextInt();
		int num;
		int result = 0;
		input.nextLine();
		for(int i = 0; i<groups; i++){
			num = input.nextInt();
			if(num == 4)
				result++;
			else
				storage[num-1]++;
		}
		
		result += Math.min(storage[0], storage[2]);
		result += storage[2] - Math.min(storage[0], storage[2]);
		storage[0] -= Math.min(storage[0], storage[2]);
		result+= storage[1]/2;
		storage[1] = storage[1]%2;
		if(storage[1] == 1){
			result++;
			storage[0]-=2;
		}
		if(storage[0] > 0){
			if(storage[0]%4 > 0)
				result++;
			result+= storage[0]/4;
		}
		System.out.println(result);
    }
}
