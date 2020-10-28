package Arrays_fill_asLit_equals_2Ds;

import java.util.Arrays;

public class Arrays_equals {

	public static void main(String[] args) {
		int[] evenNos1 = {10,20,30,40,50,60,70,80,90,100};
		int[] evenNos2 = {10,20,30,40,50,60,70,80,90,100};
		int[]  oddNos = {11,21,31,41,51,61,71,81,91,101};		
		
		if(Arrays.equals(evenNos1, evenNos2)) {
			System.out.println("Both arrays are a match.");
		}
	}
}
