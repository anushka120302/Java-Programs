import java.util.*;
public class PnC 
{
	 public static int factorial(int num)
	 {
		 int i=1;
		 while(num>0)
		 {
			 i=i*num;
			 num--;
		 }
		 return i;
	 }
     public static void main(String args[])
     {
    	 Scanner sc = new Scanner(System.in);
    	 System.out.println("Enter the value of n, i.e, the total number of items \nEnter the items taken for permutation");
    	 int n=sc.nextInt();
    	 int r=sc.nextInt();
    	 int combination=factorial(n)/(factorial(r)*factorial(n-r));
    	 int permutation=factorial(n)/factorial(n-r);
    	 System.out.println("The permutation is "+permutation);
    	 System.out.println("The combination is "+combination);
	     
     }
}
