import java.util.*;
public class MirrorInverse 
{
   public static boolean MirInv(int ar[])
   {
	   for(int i=0; i<ar.length; i++)
	   {
		   if(ar[ar[i]] == i)
	              return true;
	   }
	   return false;
   }
   public static void main(String args[])
   {
	   Scanner sc=new Scanner (System.in);
	   System.out.println("Enter the size of array");
	   int n=sc.nextInt();
	   int ar[]=new int[n];
	   for(int i=0;i<n;i++)
	   {
		   System.out.println("Enter the array elements");
		   ar[i]=sc.nextInt();
	   }
	   if(MirInv(ar))
		   System.out.println("Array is Mirror Inverse");
	   else
		   System.out.println("Array is not Mirror Inverse");
   }
}
