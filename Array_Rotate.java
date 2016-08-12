package GUVI_Play;

import java.util.*;
public class Array_Rotate {

	public static void main(String[] args)
	{
		//BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		Scanner br = new Scanner(System.in);
		System.out.println("Enter the Array Size: ");
		int n = br.nextInt();
		System.out.println("Enter the Rotation posion: ");
		int k = br.nextInt();
		int i;
		int arr[] = new int[n];
		System.out.println("Enter the Array Value: ");
		for(i=0;i<n;i++)
			arr[i] = br.nextInt();
		int tmp[] = new int[n];
		int j=0;
		for(i=(n-k);i<n;)
		{
			tmp[j]=arr[i];
			j++;
			i++;
			if(i==n)
				i=0;
			
			if(i == (n-k))
				break;
		}
		for(i=0;i<n;i++)
			System.out.print(tmp[i]);
	}

}
