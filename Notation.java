package Hunter;
import java.util.*;

public class Notation {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array size: ");
		int size = sc.nextInt();
		int i;
		int[] Array_Num = new int[size];
		
		for(i=0;i<size;i++)
			Array_Num[i] = sc.nextInt();
		Arrays.sort(Array_Num);
		
		for(i=0;i<size-1;i++)
		{
			if(Array_Num[i]== Array_Num[i+1])
				System.out.println("Repeated Number is: "+Array_Num[i]);
		}
	}
}
