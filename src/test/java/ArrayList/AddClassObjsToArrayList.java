package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

	public class AddClassObjsToArrayList {
		
	//Global Variables(Class Properties)
		String name;
		int age;
		String dept;

				public AddClassObjsToArrayList(String name,int age,String dept) { // <--- constructor
						this.name=name;
						this.age=age;
						this.dept=dept;
						
				}
	
/* --------------------------------------  Execution begins here: --------------------------------------*/	
				
		public static void main(String[] args) {
					
			/* ------------------- CREATE ArrayList Object with Class Objects:-----------------  */
						
				//1.Class objects created: each of them with a new set of parameters:
			AddClassObjsToArrayList e = new AddClassObjsToArrayList("Tom", 25, "QA");
			AddClassObjsToArrayList e1 = new AddClassObjsToArrayList("Dick", 26, "dev");
			AddClassObjsToArrayList e2 = new AddClassObjsToArrayList("Harry", 25, "scrum");
			AddClassObjsToArrayList e3 = new AddClassObjsToArrayList("Charlie", 30, "PO");
						
				//2.ArrayList Object create: to build a List of these class objs created above:
			ArrayList <AddClassObjsToArrayList> ar = new ArrayList<AddClassObjsToArrayList>();
						//3.add all the Employee class objects created above to the ArrayList object created above:
							ar.add(e);
							ar.add(e1);
							ar.add(e2);
							ar.add(e3);
			
			/* ------------------READ the class objects added to the ArrayList Object:------------------- */	
						
				//4.create an iterator pointer to TRAVERSE through the ArrayList object:
			Iterator<AddClassObjsToArrayList> emp = ar.iterator();
						
				//5.using while loop, iterator through the ArrayList object(ar) to fetch the values newly stored in ArrayList ar:	
						while(emp.hasNext()) {
							AddClassObjsToArrayList empAr = emp.next();
							System.out.println(empAr.name+", "+empAr.age+", "+empAr.dept);
						}
		}
	}
