import java.util.*;
public class UserDefinedException {

	public static void main(String[] args) {
		
		int i,j;
		Scanner sc = new Scanner(System.in);
		
		i=sc.nextInt();
		j=sc.nextInt();
		try {
		if(j==0)
			throw new DivideByZeroException("Cannot divide by zero");
		
		
		int k=i/j;
		System.out.println(k);
		}
		catch(DivideByZeroException e)
		{
			System.out.println("Error"+e.getMessage());
		}
		
	}
}
