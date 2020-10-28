package Arrays_fill_asLit_equals_2Ds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_To_ArrayList_Converter {
	
	/* 1. Array is converted to a List using asList:   Arrays.asList(ArrayName);
	 * 2, Converted list is then passed as an argument to ArrayList(asList(ArrayName))*/
	
	
	
	public static void main(String [] args) {
		
		String[] weekdays= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		
	//convert to a list:
		List<String> newList = Arrays.asList(weekdays);
		
	//fixed List "newList" is passed as an argument to a more robust ArrayList:
		List<String> newArList = new ArrayList(Arrays.asList(newList));
		
	//new element ADDED:	
		newArList.add(0, "praise");
			System.out.println(newArList);
		
		System.out.println("Array weekdays --- "+weekdays.length);
		System.out.println("ArrayList newArList --- "+newArList.size());
		
	}
	
	
	

}
