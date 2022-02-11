import java.util.*;
public class ArrList 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of the elements to be entered in the array");
		int n=sc.nextInt();
        ArrayList<Integer> arli=new ArrayList<Integer>(n);
        for(int i=1;i<=n;i++)
        {
        	arli.add(sc.nextInt());
        }
        System.out.println(arli);
        System.out.println("Enter the index of the element to be deleted ");
        int x=sc.nextInt();
        arli.remove(x);
        System.out.println(arli);
	}

}
