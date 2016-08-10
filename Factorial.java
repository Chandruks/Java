package String_demo;

import java.util.*;

public class Factorial {

	public static void main(String[] args) {
		long sum =1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Factorial Number: ");
		long num = sc.nextLong();
		for(int i=1;i<=num;i++)
			sum = sum*i;
		System.out.println(sum);
		

	}

}
