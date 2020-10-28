package LinkedList;

import java.util.LinkedList;

public class LinkedListConcepts {


	
	public static void main(String[] args) {
		
		LinkedList<String> lnk= new LinkedList<String>();
			lnk.add("science");
			lnk.add("math");
			lnk.add("programming");
			System.out.println("Contents of LinkedList --- "+lnk);

	/*addFirst() -- adds a value to the top of the list -- 1st position:*/
			lnk.addFirst("communication");
			System.out.println("udpated addFirst of LinkedList --- "+lnk);
	
	/*addLast() -- adds a value to the end of the list -- last position:*/
			lnk.addLast("sports");
			System.out.println("updated addLast of LinkedList --- "+lnk);
	
	/*get() -- fetches the value as per the index# */
			System.out.println(lnk.get(2));
			
	/*set() -- REPLACE a value as per the index# */		
			lnk.set(3, "Automation");
			System.out.println("updated set() of LinkedList --- "+lnk);
	
	/*removeFirst() removeLast() -- first(index#0) and last nodes: */	
			lnk.removeFirst();
			lnk.removeLast();
			System.out.println("Contents of LinkedList --- "+lnk);
	
	/*remove(index#) -- first(index#0) and last nodes: */	
			lnk.remove(2);
			System.out.println("Contents of LinkedList --- "+lnk);
	}
}