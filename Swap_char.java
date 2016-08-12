// Swap the even and odd characters in a given string.


package GUVI_Play;

import java.util.*;
public class Swap_char {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str= sc.nextLine();
		char name[] = str.toCharArray();
		int j=0;
		for(int i=0;i<name.length-1;i=i+2)
		{
			char tmp=name[i];
			name[i]=name[i+1];
			name[i+1] = tmp;			
		}
		System.out.println(name);
	}

}
