package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.JavascriptExecutor;

public class shortestArrayListEg {
	
	//Global Variables// Class Properties:
	/* *************** */
	String house;
	int price;
	String town;
	
	public shortestArrayListEg(String house, int price, String town) {
		this.house=house;
		this.price=price;
		this.town=town;
	}

	
	//====================== Add objects created for the above class to ArrayList and fetch each one =====================================================
			public static void main(String[] args)	{
				
				shortestArrayListEg del= new shortestArrayListEg("townhouse",520,"braintree");
				shortestArrayListEg del1= new shortestArrayListEg("singlehome",600,"natick");
				
				ArrayList <shortestArrayListEg> ar = new ArrayList<shortestArrayListEg>();
				ar.add(del);
				ar.add(del1);
				
				Iterator <shortestArrayListEg> it = ar.iterator();
				
				while(it.hasNext()){
					
					shortestArrayListEg v = it.next();
					
					System.out.println(v.house+", "+v.price+", "+v.town);
				}
			}





}
