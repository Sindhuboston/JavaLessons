package CollectionsAPI;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class APIs {

	public static void main(String[] args) {

//---------------------------------------COLLECTION INTERFACE ---------------------------------------------------
		System.out.println("------------------ Collection interface reference with ArrayList class object -----------------");
		System.out.println("-----Collection doesn't support index : -----------------");
		
		Collection cln = new ArrayList(); 
		cln.add(4);
		cln.add(8);
		cln.add(2);
		
		Iterator  it = cln.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

//---------------------------------------LIST INTERFACE + ArrayList class ---------------------------------------------------	
	System.out.println("------------------ List interface reference with ArrayList class object -----------------");
	System.out.println("-----1.List uses index: allows insertion of a new element -----------------");
	System.out.println("-----2.List adds only Objects: -----------------");
	System.out.println("-----3.This List example, object type is NOT defined therefore a String is also allowed: -----------------");
	System.out.println("-----4.List is Mutable as we can change the values of the list / ascending, descending orders-----------------");
	
	System.out.println("");
	List lst = new ArrayList(); 
	lst.add(4); // Integer i = new Integer(4);  <<---- 4 is not an int it's an object.
	lst.add(8);
	lst.add(2);
	
	Iterator  itr = lst.iterator();
	while(itr.hasNext()) {
		System.out.println("Original list: "+itr.next());
	}
	
	lst.add(2,1); //<<-------- inserting value "1" between the values "8" & "2."
	lst.add(3, "I'mAnewStringvalue");  //<<-------- inserting String value 
	System.out.println("");
	for(Object o : lst) {
		System.out.println("List after adding new values: "+o);
	}
	
	System.out.println("");
	//--------------------------------------- Collection.sort(list)---------------------------------------------------
	System.out.println("------------------ Collection.sort(list) ASCENDING order-----------------");
	System.out.println("------------------ Collection = class // sort = static method() -----------------");
	List <Integer> ls = new ArrayList<Integer>();
		ls.add(4);
		ls.add(7);
		ls.add(2);
		ls.add(3);
		ls.add(6);
	
	Collections.sort(ls);
	
	for(Object l: ls) {
		System.out.println("Ascending order: "+l);
	}
	System.out.println("------------------ Collection.reverse(list) DESCENDING order-----------------");	
	
	Collections.reverse(ls);
	Iterator e = ls.iterator();
	while(e.hasNext()) {
		System.out.println("Descending order: "+e.next());
	}
// ------------------------------ OVERRIDE --- >>  Collection.sort() with Comparator interface -----------------------
	System.out.println("------------------------------ OVERRIDE --- >>  Collection.sort() with Comparator interface -----------------------");
	System.out.println("------------------------------ Sort by the third digit of the number -->' %10' -----------------------");
	List <Integer> ls1 = new ArrayList<Integer>();
	ls1.add(402);
	ls1.add(589);
	ls1.add(604);
	ls1.add(396);
	ls1.add(223);
	
	/*Comparator <Integer> com = new Comparator<Integer>() {
							@Override
							public int compare(Integer i, Integer j) {
								
								return i %10 > j %10 ?1:-1;}};  // << "%10" means that the last digit of the # will be used to sort by.
								---------- OR --------------		
								  if(i%10> j%10)
										return 1;
									else 
										return -1;
								------------------------
								lambda expression:
								------------------------
								Collections.sort(lst,(i,j)-> return i %10 > j j %10);	
								*/
	System.out.println("------------------------------ lambda expression: --- >>  Collections.sort(ls1, (i,j)-> i %10 > j %10 ? 1: -1); -----------------------");
	Collections.sort(ls1, (i,j)-> i %10 > j %10 ? 1: -1);  // << "%10" means that the last digit of the # will be used to sort by.
	
	for (Object c: ls1) {
		System.out.println("Override sort using Comparator: "+c);
	}
	System.out.println("");
	
	//---------------------------------------SET INTERFACE + HashSet class ---------------------------------------------------	
	System.out.println("------------------ Set interface reference with HashSet class object -----------------");
		System.out.println("---------------------------------- Set + HashSet-- UnOrdered & Unique elements -----------------");
	Set<Integer> st = new HashSet<>();
			st.add(25);
			st.add(30);
			st.add(10);
			st.add(42);
			System.out.println("Size of the Set list--- before add: "+st.size());
	for(Object o: st) {
		System.out.println( "Set + HashSet never sorts. It does random fetch--- : "+o);
	}		
			st.add(30); //<--- duplicate value 
			
			System.out.println("-------------------------------- Duplicate NOT added in Set: --------------------------------");	
			System.out.println("Size of the Set list--- after add: "+st.size());	
	Iterator<Integer> it1 = st.iterator();
	while(it1.hasNext()) {
		System.out.println("Set does not allow duplicates, #30 is not repeated: "+it1.next());
	}
	System.out.println("");
	//---------------------------------------SET INTERFACE + TreeSet class ---------------------------------------------------	
	System.out.println("------------------ Set interface reference with TreeSet class object -----------------");
	System.out.println("---------------------------------- Set + TreeSet--  Ordered & Unique elements -----------------");	
	Set<Integer> stree = new TreeSet<>();
			stree.add(25);
			stree.add(30);
			stree.add(10);
			stree.add(42);
	System.out.println("Size of the Set list--- before add: "+stree.size());
	for(Object o: stree) {
		System.out.println( "Set + TreeSet always sorts. It does sequence fetch--- : "+o);
		}
	
	stree.add(30); //<--- duplicate value 
	
			System.out.println("-------------------------------- Duplicate NOT added in Set: --------------------------------");	
			System.out.println("Size of the Set list--- after add: "+stree.size());	
	Iterator<Integer> it2 = stree.iterator();
	while(it2.hasNext()) {
	System.out.println("Set does not allow duplicates, #30 is not repeated: "+it2.next());
	}	
		

	
	System.out.println("");/*System.out.println("https://youtu.be/W1NXZnmKcGM");  */
	//---------------------------------------MAP + HashMap ---------------------------------------------------	
	System.out.println("----------------------------------  Map interface + HashMap class --  <Key, Value> pair -----------------");	
	System.out.println("------------NEW >>>------Values are stored in their Keys and not using Index as in List/ArrayList.  -----------------");
	System.out.println("------------NEW >>>------Set<String> k = mp.keySet();  to collect all the created keys in a Set -----------------");
	System.out.println("");
	
	Map<String, String> mp= new HashMap<>();
			mp.put("Firstname", "John");
			mp.put("Lastname", "Loomis");
			mp.put("Role", "Developer");
			
					System.out.println("---------- for loop is different as Map uses ---- Key & not Index ----- to store it's elements.---------- ");
					System.out.println("-----------------//  mp.get(str) to retrieve the value of the key ----------------------------------------");
			Set<String> k = mp.keySet(); //<--- keySet() collects all keys in the reference.
			
			for(String str: k) {
				System.out.println(str+": "+ mp.get(str)); //<--- points at a Key & get() retrieves the value of the key.
			}
			
					System.out.println("-------------- Duplicate keys will update with new value when repeated.---------------------------");
		
		mp.put("Role", "Scrum Master");
		mp.put("Developer", "Loomis");
		 
		for(String str1: k) {
		System.out.println("Role key is updated with new value --- :  "+str1+": "+mp.get(str1));
		}
		
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}}
