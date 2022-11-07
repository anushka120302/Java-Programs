import java.util.*;
public class DiamondPattern 
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int i=0,j=0;
		
		System.out.println("Enter the dimension of diamond");
		int n=sc.nextInt();
		int sp=n-1,st=1;
		
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=sp;j++)
			{
			System.out.print(" ");
			
			}
			for(j=1;j<=st;j++)
			{
				System.out.print("*");
			}
			System.out.println();	
		    sp--;
		    st=st+2;
			
		}
		sp=1;
		st=st-4;      //because by the end of the termination of the first loop it adds two more to the value we have to reduce 2 from
		for(i=1;i<=n-1;i++)
		{
			for(j=1;j<=sp;j++)
			{
			System.out.print(" ");
			
			}
			for(j=1;j<=st;j++)
			{
				System.out.print("*");
			}
			System.out.println();	
		    sp++;
		    st=st-2;	
	}
   }
}
