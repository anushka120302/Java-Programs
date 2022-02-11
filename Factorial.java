import java.util.*;
public class Factorial 
{
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  int fact=1;
	  int i=1;
	  int n=sc.nextInt();
	  i=n;
	  while(n>0)
	  {
		  fact=fact*n;
		  n--;
	  }
	  System.out.println("The factorial of "+i+" is "+fact);
  }
}
