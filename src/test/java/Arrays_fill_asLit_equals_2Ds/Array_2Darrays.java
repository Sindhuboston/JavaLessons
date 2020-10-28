package Arrays_fill_asLit_equals_2Ds;

import java.util.Arrays;

public class Array_2Darrays {
	
	public static void main(String[] args) {
		
		int[][] evenNos = {
				{12,14,16,18,20}, 			//row 0
				{22,24,26,28,30}, 			//row 1
				{42,44,46,48,50}}; 			//row 2
				System.out.println(evenNos[1][4]); //output --->   30
			
		int[][] evenNos1 = {
				{12,14,16,18,20}, 					//row 0hjhkhk
				{22,24,26,28,30,32,34,36,38,40}, 	//row 1
				{42,44,46,48,50}, 					//row 2
				{},
				{5}};
				System.out.println(evenNos1[1][8]); //output --->   38
			
		/*print entire array contents */		
				System.out.println(Arrays.deepToString(evenNos1));	//[[12, 14, 16, 18, 20], [22, 24, 26, 28, 30, 32, 34, 36, 38, 40], [42, 44, 46, 48, 50], [], [5]]
	
		/* check the # of rows in a Array  */
				System.out.println("No of rows in the Array: "+evenNos1.length);
				
		/* check the # of columns per row in a Array  */
				System.out.println("No of columns in a selected row --- evenNos1[0]: "+ evenNos1[0].length);
				System.out.println("No of columns in a selected row --- evenNos1[1]: "+ evenNos1[1].length);
	
		/* iterate through Array: */
				for(int row=0; row<evenNos1.length; row++) {
					for(int col=0; col<evenNos1[row].length;col++) {
						System.out.print(evenNos1[row][col]+" ");
					}
					System.out.println("");  
					
						//  <---> output <--->  
						// 12 14 16 18 20 
						// 22 24 26 28 30 32 34 36 38 40 
						// 42 44 46 48 50 
						// 
						// 5 
				
				}
				
				
				
	}
}