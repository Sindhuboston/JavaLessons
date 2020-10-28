package Arrays_fill_asLit_equals_2Ds;

import java.util.Arrays;

public class Array_fill {

	public static void main(String[] args) {
		//fill can fill out the value in all elements of the array 
		//fill can even empty all the elements of the array.
		
		int[] evenNos1 = {10,20,30,40,50,60,70,80,90,100};
		int[] evenNos2 = {10,20,30,40,50,60,70,80,90,100};
		String[] weekdays= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		
		
// all elements with same value:	
		Arrays.fill(evenNos1, 11);
			System.out.println(Arrays.toString(evenNos1));  // --> output [11, 11, 11, 11, 11, 11, 11, 11, 11, 11]
		
// print all element (single row array):	
		System.out.println(Arrays.toString(weekdays));  // --> output [Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday]
		
// removed all element values:
		Arrays.fill(weekdays, "");
			System.out.println(Arrays.toString(weekdays));	// --> [, , , , , , ]
	}

}
