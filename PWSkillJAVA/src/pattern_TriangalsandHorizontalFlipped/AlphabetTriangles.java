package pattern_TriangalsandHorizontalFlipped;

import java.util.Scanner;

public class AlphabetTriangles
{
	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		
int r = sc.nextInt();

for(int i = 1; i<=r; i++)
{
	for(int j = 1; j<= i; j++)
	{
		System.out.print((char)(j+64)+ " ");
	
		
	}
	System.out.println();
}
           
	
	}

	}
	
