import java.util.Scanner;

public class Factorial_Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 0;
		int fnum1 = 0, fnum2 =1, output=0;
		
		Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value: ");	
	num1 = sc.nextInt();
	output = fnum1+fnum2;
	for (int i=1;i<=num1;i++)
	{
		if(i != (num1))
			System.out.print(output +" + ");
		else
			System.out.print(output);
		output = fnum1+fnum2;
		fnum1 = fnum2;
		fnum2 = output;
	}
	}

}
