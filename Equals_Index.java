// GUvi Hunter Set-1 in 3rd Problem.
package GUVI_Play;
import java.util.*;
public class Equals_Index
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Enter the Array size: ");
		int size=sc.nextInt();
		int i=0;
		int[] Number = new int[size];
		//Read the Input from Keyboard
		System.out.println("Enter the Integer Number: ");
		for(i=0;i<size;i++)
			Number[i]=sc.nextInt();
		
		//Sorting the Input values.
		Unique obj_Unique = new Unique();
		obj_Unique.sorting(Number,size);
		
		

	}
}

class Unique
{
		int i=0,key,j,count = 0;
		void sorting(int[] tmp_Array,int N)
		{
			for(i=0;i<N;i++)
			{
				key= tmp_Array[i];
				
				for(j=i;((j>0)&& (tmp_Array[j-1]>key));j--)
				{
					tmp_Array[j] = tmp_Array[j-1];			
				}
				tmp_Array[j] = key;
			}
						
			System.out.println("");
			for(i=0;i<N;i++)
			{
				if(i == tmp_Array[i])
				{
					System.out.println("The Number "+tmp_Array[i]+" equals its index "+i);
					++count;
				}
			}
			if(count  == 0)
				System.out.println("All Enements are Not match with Index ");

		}
}


