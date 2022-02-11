import java.util.*;
public class Transpose 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows ");
		int r=sc.nextInt();
		
		int a[][]=new int[r][r];
		int b[][]=new int[r][r];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<r;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<r;j++)
			{
				b[i][j]=a[j][i];
			}
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<r;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("\n");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<r;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}
}
