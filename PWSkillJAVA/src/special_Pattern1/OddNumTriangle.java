package special_Pattern1;

import java.util.Scanner;

public class OddNumTriangle 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = sc.nextInt();
		
		//Method 1
//		for(int i = 1; i<= n; i++)
//		{
//			for(int j = 1; j<= i; j++)
//			{
//				System.out.print(2*j-1 + " ");
//			}
//			System.out.println();
//		}
		
		//Method 2
//		for(int i = 1; i<= n; i++)
//		{
//			for(int j = 1; j<=2*i-1; j+=2)
//			{
//				System.out.print(j + " ");
//			}
//			System.out.println();
//	}

		for(int i = 1; i<=n; i++)
		{
			int a =1;
			for(int j=1;j<=i;j++)
			{
				System.out.print(a + " ");
				a +=2;
			}
			System.out.println();
		}
}
}