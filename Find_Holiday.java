
// 11.Check the given day is a holiday or working day. Return true if it’s a working day.

package GUVI_Play;

import java.util.Scanner;

public class Find_Holiday {

	public static void main(String[] args) 
	{
		//enum day1 {SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Day: ");
		String str = sc.nextLine();
		Holiday holi = new Holiday();
		
		System.out.println("Workingday('"+str+"') ->"+holi.check_day(str));
	}

}

class Holiday
{
	boolean check_day(String str)
	{
		String day[]={"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
		boolean flag = true;
		int a=0;
		str= str.toUpperCase();
		for(String tmp : day)
		{
			if(str.equalsIgnoreCase(tmp))
			{
				a=1;
			}
		}
		if(((str.equals("SUNDAY")) && a==1) || a==0)
		{
			flag = false;
			if(a==0)
				System.out.println("wrong String");
		}
				
	return flag;
	}
}
