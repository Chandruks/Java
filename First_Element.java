package Hunter;
import java.util.*;
public class First_Element {

	public static void main(String[] args) 
	{
		System.out.println("Enter the Array Size: ");
		int size,i,j,k=0;
		
		Scanner sc = new Scanner(System.in);
		
		size = sc.nextInt();
		int[] Number = new int[size];
		System.out.println("Enter the Array Element: ");
		for(i=0;i<size;i++)
		{
			Number[i] = sc.nextInt();
		}
		//int compare_ele = Number[0];
		for(i=0;i<size;i++)
		{
			for(j=i+1;j<size;j++)
			{
				if(Number[i] == Number[j])
				{
					System.out.println("First Repeate Element is: "+Number[i]);
					++k;
					break;
				}
			}
			if(k==1)
				break;
		}
		if(i == size)
			System.out.println("No Repeate Element");
	}

}
