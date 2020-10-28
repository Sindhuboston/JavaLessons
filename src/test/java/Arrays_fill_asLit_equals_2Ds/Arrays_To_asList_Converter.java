package Arrays_fill_asLit_equals_2Ds;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/*Note: Array.asList = 	1. No new elements can be either ADDED or REMOVED from the list. 
							the size of this array is FIXED. 
						2. It is used to convert an Array into a LIST 
						
						3. Update of a value, either made in the converted list or to the original Array will be reflected in the other 		
							This is known as Write-Through Property.
	
 		
 		is used ---- asList  >> to convert an ARRAY INTO A LIST */


				public class Arrays_To_asList_Converter {
				
					public static void main(String[] args) {
						
						int[] evenNos1 = {10,20,30,40,50,60,70,80,90,100};
						int[] evenNos2 = {10,20,30,40,50,60,70,80,90,100};
						
				// Array		
						String[] weekdays= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
				
				// converted to LIST:		
						List <String> days = Arrays.asList(weekdays);
											System.out.println(days);
							
				// updated List will automatically be reflected in Array.  This is known as Write-Through Property:
						days.set(0, "Joes");
							System.out.println("asList ----- "+days);
							System.out.println("array ----- "+weekdays[0]);
						
				// updated List will automatically be reflected in array.  This is known as Write-Through Property:			
						weekdays[0] = "Sunday";
						System.out.println("asList ----- "+days);
						System.out.println("array ----- "+weekdays[0]);
	
	
	
	
	
	
	}

}
