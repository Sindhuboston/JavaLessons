package Arrays_fill_asLit_equals_2Ds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class practice {

public static void main(String [] args) {
		
		String[] weekdays= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
//Method 1: ArrayList();
		List <String> arList = new ArrayList(Arrays.asList(weekdays));
		
		System.out.println(arList);
		
		arList.add("rhymes");
		System.out.println(arList);
		
}
	
}
