package GUVI_Play;
import java.util.*;

//1,2,6,9,9,1,3,6,2
//12,45,32,65,32,65,45

public class Hunter_findUnique 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int i,size,j,count=1;
		System.out.println("Enter the Array Size: ");
		size = sc.nextInt();
		int[] Array_value = new int[size];
		for(i=0;i<size;i++)
			Array_value[i] = sc.nextInt();
		
		for(i=0;i<size;i++)
		{
			for(j=i+1;j<size;j++)
			{
				if(Array_value[i] == Array_value[j])
				{
					Array_value[i] ='*';
					Array_value[j] ='*';
					++count;
				}
			}
		}
		// Display the Result
		for(i=0;i<size;i++)
		{
			if(count == size-1)
			{
				System.out.println("Sorry All Elements are same");
				break;
			}
			if(Array_value[i] != '*')
				{
					System.out.println("Result: "+Array_value[i]);
				}
		}
		
	}

}
