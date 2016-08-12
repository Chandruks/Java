package GUVI_Play;
import java.util.*;
public class Reverse_digit 
{
	public static void main(String []arg)
	{
		int num;
		int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  number: ");
		num=sc.nextInt();
		int tmp;
		int sum=0;
		tmp=num;
		while(num>0)
		{
			num=num/10;
			++count;
		}
		int i=0;
		num = tmp;
		while(i<count)
		{
			int tmp1 =num%10;
			num = num/10;
			sum =sum+( tmp1 * (int) Math.pow(10, count-(i+1)));
			i++;
			
		}
		
	System.out.println(sum);

	}
}
