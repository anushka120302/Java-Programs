import java.util.*;
public class ArrList 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of the elements to be entered in the array");
		int n=sc.nextInt();
        ArrayList<Integer> arl=new ArrayList<Integer>(n);
        for(int i=1;i<=n;i++)
        {
        	arl.add(sc.nextInt());
        }
        System.out.println(arl);
        System.out.println("Enter the index of the element to be deleted ");
        int x=sc.nextInt();
        arl.remove(x);
        System.out.println(arl);
	}

}
