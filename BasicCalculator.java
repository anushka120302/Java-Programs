import java.util.*;
public class BasicCalculator 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		char operation;
		double n1,n2;
		
		System.out.println("Enter the first number");
		n1=sc.nextDouble();
		System.out.println("Enter the operator");
		operation=sc.next().charAt(0);
		System.out.println("Enter the second number");
		n2=sc.nextDouble();
		
		
		switch(operation)
		{
			case '+':
				System.out.println(n1+" + "+n2+" = "+(n1+n2));
				break;
			case '-':
				System.out.println(n1+" - "+n2+" = "+(n1-n2));
				break;
			case '*':
			    System.out.println(n1+" * "+n2+" = "+(n1*n2));
			    break;
			case '/':
				System.out.println(n1+" / "+n2+" = "+(n1/n2));
				break;
			default:
					System.out.println("invalid operator");
					break;
		}
	}

}
