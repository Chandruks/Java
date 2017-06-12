package Hunter;

import java.util.Arrays;
import java.util.Scanner;

public class Only_One_Appears
{
	public static void main(String[] args)
	{
		int size,i,j,k=0;
		System.out.println("Enter the Array Size: ");
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		int[] Number = new int[size];
		String[] tmp = new String[size];
		System.out.println("Enter the Array Element: ");
		for(i=0;i<size;i++)
		{
			Number[i] = sc.nextInt();
			tmp[i] = Integer.toString(Number[i]);
		}
		for(i=0;i<size;i++)
		{
			for(j=i+1;j<size;j++)
			{
				if((tmp[i]).equals(tmp[j]))
				{
					++k;
					tmp[j]="*";
					break;
				}
			}
			if(0<k)
				tmp[i]="*";
			k=0;
		}
		
		for(i=0;i<size;i++)
		{
			if(!(tmp[i]).equals("*"))
			{
				k++;
				System.out.println("Only onece appear in array: "+Integer.parseInt(tmp[i]));
			}
		}
		if(k==0)
			System.out.println("All element repeated");
	}
}
