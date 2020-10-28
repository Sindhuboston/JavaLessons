package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class AllExamplesArrayList {
	//Global Variables// Class Properties:
	/* *************** */
	String name;
	int age;
	String dept;

	public AllExamplesArrayList(String name,int age,String dept) { // <--- constructor
			this.name=name;
			this.age=age;
			this.dept=dept;
			
	}
	
	public static void main(String[] args) {
	int a[] = new int[3]; //Problem: ---- static array. Size is fixed and cannot be changed later. 
		
		/* Solutions: ArrayList class*/
		/* ***************************/
		ArrayList<Integer> ary = new ArrayList<Integer>();
		ary.add(150);
		ary.add(201);
		ary.add(150); //<-- allows duplicate values.
		System.out.println(ary.size());
		ary.add(104);
		ary.add(7987);
		ary.add(984);
		System.out.println(ary.size());
		
		System.out.println(ary.get(4));
		/* ArrayList class 
 		1. size is not fixed.
		2. maintains insertion order
		3. synchronized
		4. allows random access to fetch a value because it stores them on the basis of indexes. 
		5. allows duplicate value/element*/
		
		ArrayList <Integer> ar = new ArrayList<Integer>();
		ar.add(25);
		ar.add(17);
		System.out.println(ar.size());
		System.out.println(ar.get(1));
	
	//CREATE arraylist:
		ArrayList <String> ar1 = new ArrayList<String>();
		ar1.add("Tom");
		ar1.add("QA");
		ArrayList <String> a2 = new ArrayList<String>();
		a2.add("email.com");
		a2.add("Team");
				System.out.println("ar1 data size: "+ar1.size());
				System.out.println("a2 data size: "+a2.size());
		
	//ADD(merge) two array object Lists:		
				System.out.println("****** Add a2 data to ar1 ****** ");
		ar1.addAll(a2);
		System.out.println("ar1 data size: "+ar1.size());
		System.out.println("a2 data size: "+a2.size());
		
				for(int i=0; i<ar1.size(); i++) {
					System.out.println("ar1 now has ---- "+ar1.get(i));
				}
				
	//REMOVE one arraylist object from another arraylist object:			
				System.out.println("****** Remove a2 data from ar1 ****** ");
		ar1.removeAll(a2);
		System.out.println("ar1 data size: "+ar1.size());
				for(int i=0; i<ar1.size(); i++) {
					System.out.println("ar1 now has ---- "+ar1.get(i));
				}
	//RETAIN ALL: common values, in first arraylist will be retained /matched in the second arraylist
				ArrayList <String> a1 = new ArrayList<String>();
				a1.add("test");
				a1.add("selenium");
				a1.add("qtp");
				ArrayList <String> ar2 = new ArrayList<String>();
				ar2.add("test");
				ar2.add("java");	
				ar2.add("javascript");
				ar2.add("selenium");
			a1.retainAll(ar2);
			for(int i=0; i<a1.size(); i++) {
				System.out.println(a1.size());
				System.out.println("Retain All: common values are retained --- "+a1);	
			}
			for(int i=0; i<ar2.size(); i++) {
				System.out.println(ar2.size());
				System.out.println("Retain All: common values are retained --- "+ar2);	
			}
				
				
	//CLASS OBJECTS stored in ARRAYLIST:
		
		/* Create Class Objects: AllExamplesArrayList class*/		
		AllExamplesArrayList emp = new AllExamplesArrayList("Tom", 25, "QA");
		AllExamplesArrayList emp1 = new AllExamplesArrayList("Dick", 26, "Dev");
		AllExamplesArrayList emp2 = new AllExamplesArrayList("Harry", 26, "Scrum");
		AllExamplesArrayList emp3 = new AllExamplesArrayList("Charlie", 25, "PO");

		/* Create ArrayList: AllExamplesArrayList objects created above:*/		
		ArrayList<AllExamplesArrayList> arEmp = new ArrayList<AllExamplesArrayList>();
		arEmp.add(emp);
		arEmp.add(emp1);
		arEmp.add(emp2);
		arEmp.add(emp3);
		
										/* To PRINT all objects values in ArrayList:*/
											//1. use while loop through Objects  & use for loop for Variables
											//2. iterator = used for Object list.  does not work on index & it uses hasNext() instead. 
		/* Use iterator to loop through objects*/
		Iterator<AllExamplesArrayList> it = arEmp.iterator();
		while(it.hasNext()) {
			AllExamplesArrayList e = it.next();
			System.out.println(e.name+", "+e.age+", "+e.dept);
		}
	}
}

/* *interview Questions:
	1. Create a constructor of the class --- same class name with param
	2. Create class object for each data set --- object per data set 
	3. Create ArrayList object with class name type.
	4. Add all of the class objects in the arraylist using add(). 
	5. Iterate through the object list using while loop/hasnext/next.
*/
