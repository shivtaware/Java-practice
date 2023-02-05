import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListInterface {

	public static void main(String[] args) {
		
		List nums= new ArrayList();
		
		nums.add(0,1);
		nums.add(1,2);
		nums.add(2,4);
		nums.add(3,3);
		
		/*
		 * for (int i = 0; i<nums.size();i++) { System.out.println(nums.get(i)); }
		 */
		
		for (Object object : nums) {
			System.out.println(object);
		}

	}

}
