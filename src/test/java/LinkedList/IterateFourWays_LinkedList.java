package LinkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class IterateFourWays_LinkedList {

	/*Q. How to iterate to fetch all the values in a LinkedList?
		1. for loop
		2. advanced for loop
		3. iterator
		4. while loop
	*/
	
		public static void main(String[] args) {
			
			LinkedList <String> lnk= new LinkedList<String>();
					lnk.add("communication");
					lnk.add("science");
					lnk.add("math");
					
			/*forloop:*/
											System.out.println("******************** 1. for loop********************");
					for(int i=0; i<lnk.size(); i++) {
						System.out.println(lnk.get(i));
					}
					
			/*Advanced for loop:*/
											System.out.println("******************** 2. advanced for loop********************");
					for(String str : lnk) {
						System.out.println(str);
					}
					
			/*forEach-- lambda expression!! -> :*/
											System.out.println("******************** 3. forEach loop -> lambada expression in Java 8  ********************");
					lnk.forEach(subjects ->{
						System.out.println(subjects);
					});
			
			/*forEachRemaining-- lambda expression!! -> :*/
											System.out.println("******************** 3. forEachRemaining() method -> lambada expression in Java 8  ********************");
					ArrayList <String> ary= new ArrayList<String>();		
							ary.add("learn");
							ary.add("test");
							ary.add("interview");
					Iterator<String> itr = ary.iterator();
					
					itr.forEachRemaining(process -> {
						System.out.println(process);
					});
									
			/*iterator :*/	
											System.out.println("******************** 4. iterator ********************");
					Iterator <String> it = lnk.iterator();
					while(it.hasNext()) {
						System.out.println(it.next());
					}
					
			/*while loop :*/	
											System.out.println("******************** 5. while loop ********************");
					int num=0;
					while(lnk.size()>num) {
						System.out.println(lnk.get(num));
						num++;	
					}
		}
}