package String_demo;

import java.util.*;

public class Factorial {

	public static void main(String[] args) {
		long sum =1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Factorial Number: ");
		long num = sc.nextLong();
		if(num>0)
		{
		for(int i=1;i<=num;i++)
			sum = sum*i;
		System.out.println(sum);
		}
		else if(num<0)
			System.out.println("Enter only positive value ");
		else if(num==0)
			{
			sum = 1;
			System.out.println(sum);
			}
		

	}

}
