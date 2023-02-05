import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionPractice {

	public static void main(String[] args) {
		
		Collection nums= new ArrayList();
		
		
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		
//		System.out.println(nums);//
		
		Iterator it= nums.iterator();
		  
		while(it.hasNext())
		  System.out.println(it.next());
		 
		

	}

}
