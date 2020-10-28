package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListForClassObjs {

	String event;
	int fund;
	int guest;
	
	public  ArrayListForClassObjs(String event, int fund, int guest) {
		this.event=event;
		this.fund=fund;
		this.guest=guest;
	}

	/* ******************************************************************************************************************* */
	// Execution of the above Class starts here: 
	public static void main(String[] args) {
		/* create class objects */
			ArrayListForClassObjs pp= new ArrayListForClassObjs("halloween",200,15);
			ArrayListForClassObjs pp1= new ArrayListForClassObjs("Thanksgiving",500,30);
			ArrayListForClassObjs pp2= new ArrayListForClassObjs("Holiday break",150,15);
		
		/* create arraylist objects */
			ArrayList<ArrayListForClassObjs> ar = new ArrayList<ArrayListForClassObjs>();
				ar.add(pp);
				ar.add(pp1);
				ar.add(pp2);
		/* create iterator to point at the class objects inside the ArrayList:*/
			Iterator<ArrayListForClassObjs> it = ar.iterator();
		
		/* while loop to fetch each class objs in the ArrayList:*/
			while(it.hasNext()) {
				ArrayListForClassObjs v = 	it.next();
				System.out.println("occassion: "+v.event+" // Funding: "+v.fund+"  // Guests expected: "+v.guest);
			}
	}
	/* ******************************************************************************************************************* */
	
}
