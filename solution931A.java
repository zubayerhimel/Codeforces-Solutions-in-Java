package ContestRound468;
import java.util.Scanner;
public class solution931A {
    public static void main(String[] args) {
        
        Scanner myscanner = new Scanner(System.in);
        
        int firstnumber = myscanner.nextInt();
        int secondnumber = myscanner.nextInt();
        int sum = firstnumber+secondnumber;
        
        int div = (sum/2);
        
        double result = Math.ceil(div);
        
        int count=0,count1=0,b=0,c=0;
        if(firstnumber<result)
        {
            for(int i=firstnumber; i<result; i++)
            {
                b+=1;
                count+=b;
            }
        }
        else 
        {
            for(int i=firstnumber; i>result; i--)
            {
                b +=1;
                count+=b;
            }
        }
        
        if(secondnumber<result)
        {
            for(int i=secondnumber; i<result; i++)
            {
                c+=1;
                count1+=c;
            }
        }
        else 
        {
             for(int i=secondnumber; i>result; i--)
            {
                c+=1;
                count1+=c;
            }
        }
        
        System.out.println((count+count1));
        
    }
}
