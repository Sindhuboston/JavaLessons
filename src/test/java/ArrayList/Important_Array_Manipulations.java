package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;


//----------------------------------  List is Restricted to contain only defined <> data types: -----------------------------------------
//* built-in Search using contains
class Important_Array_Manipulations {

	public static void main(String[] args) {
//Array:
			String[] colcInterfaces= {"List","Queue","DeQue","Set","SortedSet"};
//Convert an Array to a List: "asList"
		/* ArrayList <datatype> ar = new ArrayList <datatype> (); <---- <datatype> is defined.*/
			ArrayList <String> ar = new ArrayList<String>(Arrays.asList(colcInterfaces));
									System.out.println("size: "+ar.size()+" List: "+ar);
//Update(Replace): elements are replaced in the List:							
			ar.set(1,"ArrayList");
			ar.set(2,"LinkedList");
			ar.set(3,"Vector");
			System.out.println("size: "+ar.size()+" List: "+ar);
		
//Insert: insert elements between the List:		
			ar.add(4, "Queue");
			ar.add(5, "DeQue");
			ar.add(6, "Set");
			System.out.println("size: "+ar.size()+" List: "+ar);
		
//Append: new elements get added at the end of the List:
			ar.add("All under Collection Interface.");
			System.out.println("size: "+ar.size()+" List: "+ar);

//Restricts: the type to string if ArrayList is defined to contain only String : "ArrayList<String> colcInter....."
	//ar.add(7, 2);   <---- Error msg: 	The method add(int, String) in the type ArrayList<String> is not applicable for the arguments (int, int)
			System.out.println("size: "+ar.size()+" List: "+ar);
	

			//-------------------------------------- RETRIEVE data from the list --------------------------------------
//Get datat:
			String interName = ar.get(4);
			System.out.println("interName: "+interName);
			
//Search: search is can be done for a specific element.
			System.out.println("***************** Search (built-in ) an element in the List ***************** ");
			if(ar.contains("ArrayList")) {
				System.out.println("ArrayList is in the List");
			}			
			
//For loop: Enhanced for loop;
			System.out.println("***************** Enhanced For Loop ***************** ");
			int i=1;
			for(String str: ar) {
				System.out.println(i+". "+str);
			i++;
			}
			
//Iterator:	
			System.out.println("***************** While with Iterator Loop ***************** ");
			Iterator <String> p = ar.iterator();
			int n=1;
			while(p.hasNext()) {
				String str = p.next();
				System.out.println(n+" "+str);
				n++;
				if (str.contains("All under Collection Interface")) {
					p.remove();
					System.out.println("size: "+ar.size()+" List: "+ar);
				}
			}
			
			
			
//RemoveAll:
			ar.clear();
			System.out.println("Remove all --- size: "+ar.size()+" List: "+ar);
	}
}


// ----------------------------------  List has No Restriction as data type is not defined.  -----------------------------------------
//* built-in Search using contains
class NotStrictDataTypesArrayList{
	
	public static void main(String[] args) {
//Array :		
			String[] groceryList = {"Onions","Tomatoes","Potatoes","Garlic","Ginger","Green Chillies",};

//Convert: an array to a List that's allows all data types:
		/* Imp Note :   as <> does not contain any datatype, this ArrayList will allow all types of data.*/
		/* ArrayList  ar = new ArrayList(); <---- no <datatype> defined.*/
		
			ArrayList ar1 = new ArrayList(Arrays.asList(groceryList));
			System.out.println("size: "+ar1.size()+" List: "+ar1);
		
//No Restriction on data type : This list can be a mixed bag of any data types:
		/* Imp Note :   as <> does not contain any datatype, this ArrayList will allow all types of data.*/
		
			ar1.add(0, 1); //<-- adding an Integer to a String List:
			System.out.println("size: "+ar1.size()+" List: "+ar1);

//Update(Replace): elements are replaced in the List:
			
			ar1.set(3, "Peppers");
			System.out.println("size: "+ar1.size()+" List: "+ar1);
			
// Add/append:
			ar1.add("fruits");
			System.out.println("size: "+ar1.size()+" List: "+ar1);
			

			
//Search: search is can be done for a specific element. 
			if(ar1.contains("Tomatoes")){
				System.out.println("Tomatoes is in the list.");				


//-------------------------------------- RETRIEVE data from the list --------------------------------------
//Get datat: using Object parent class: 
// As the data type is uncertain, Parent class, "Object" is used to define the var type to recieve the value from the element.
			/* Class {@code Object} is the root of the class hierarchy.
			* Every class has {@code Object} as a superclass. All objects,
			* including arrays, implement the methods of this class. */
							
			Object Veggie = ar1.get(6);
			System.out.println("Veggie: "+Veggie);				

//For loop: Enhanced for loop:// cannot be used here as this list has a mixed data type.
				
				
				
				
//Remove All:
			ar1.clear();
			System.out.println("size: "+ar1.size()+" List: "+ar1);
	

			}
	}
	
}