package pattern_printingRS;

import java.util.Scanner;

public class alphabetAAA {

	public static void main(String[] args)
	{
		  Scanner sc = new Scanner(System.in);
			System.out.print("Enter Number: ");
			
	           int r = sc.nextInt();

	for(int i = 1; i<=r; i++)
	{
		for(int j = 1; j<= r; j++)
		{
			System.out.print((char)(i+64) +" ");
		}
		System.out.println();
	}

	}

}
