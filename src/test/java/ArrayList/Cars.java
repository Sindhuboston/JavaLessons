package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Cars {

	String cartype;
	int price;
	String engine;
	int doors;
	String theftSafety;
	
	
	public Cars(String cartype, int price, String engine, int doors, String theftSafety) {
		this.cartype=cartype;
		this.price=price;
		this.engine=engine;
		this.doors=doors;
		this.theftSafety=theftSafety;
	}
	public static void main(String[] args) {
		
		/* 1. create class object
		 * 2. create arraylist object
		 * 3. add class object to the arraylist
		 * 4. create iterator pointer
		 * 5. use while loop to fetch each class objects from the arraylist object.*/
		
		Cars c = new Cars("BMW", 35,"automatic", 2,"yes");
		Cars c1 = new Cars("Audi", 55,"automatic",4,"yes");
		Cars c2 = new Cars("Acura", 50,"automatic",4,"yes");
		Cars c3 = new Cars("Mercedes", 65,"automatic",4,"yes");
	
		ArrayList <Cars> ar= new ArrayList<Cars>();
			ar.add(c);
			ar.add(c1);
			ar.add(c2);
			ar.add(c3);
			
		Iterator <Cars> ic = ar.iterator();
		
		while(ic.hasNext()) {
			Cars vCar = ic.next();
			System.out.println(vCar.cartype+", "+vCar.price+", "+vCar.engine+", "+vCar.doors+", "+vCar.theftSafety);
			
		}
	}
}
