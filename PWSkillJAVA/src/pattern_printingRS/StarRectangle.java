package pattern_printingRS;

import java.util.Scanner;

public class StarRectangle {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
				System.out.print("Enter Rows & Cols : ");
		int r = sc.nextInt();
		int c = sc.nextInt();
		
		for(int i = 1; i<=r; i++)
		{
			for(int j = 1; j<= c; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
            
	}

}
