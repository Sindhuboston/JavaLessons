package Comparable_compareToMethod;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class warmup implements Comparable<warmup>{

	String fistname;
	String lastname;
	int age;
		public warmup(String firstname, String lastname, int age) {
			this.fistname=firstname;
			this.lastname=lastname;
			this.age=age;
	}	
	//--------- Setters ----------
		public void setFistname(String fistname) {
			this.fistname = fistname;}
		public void setLastname(String lastname) {
			this.lastname = lastname;}
		public void setAge(int age) {
			this.age = age;}
	//--------- Getters ----------
		public String getFistname() {
			return fistname;}
		public String getLastname() {
			return lastname;}
		public int getAge() {
			return age;}
	
	@Override
		public int compareTo(warmup o) {
			return this.getLastname().compareTo(o.getLastname());}
	@Override
		public String toString() {
			return "warmup [fistname=" + fistname + ", lastname=" + lastname + ", age=" + age + "]";}
			
	//--------------------------------------------------------- Execution starts ---------------------------------------------------------
	public static void main(String[] args) {
		List <warmup> ar = Arrays.asList(new warmup("Tom", "Bartlett",32),
						new warmup("Patricia","Clark",42),
						new warmup("Nancy","Shewsberry",28),
						new warmup("Angela","Cohen", 29),
						new warmup("Nancy", "Drew", 40),
						new warmup("Shanaiya","Black", 26));
		Comparator <warmup> com = new Comparator<warmup>() {
			public int compare(warmup o1, warmup o2) {
				return o1.getFistname().compareTo(o2.getFistname());}};
		
		Collections.sort(ar);
		
		printAll(ar);
		
		printConditionally(ar, new Condition() {
			@Override
			public boolean test(warmup str) {
				return str.getLastname().contains("B");
			}
			
		});
			
	
		printConditionally(ar,new Condition() {
			@Override
			public boolean test(warmup str) {
				return str.getFistname().contains("N");
			}
			
		});
		
	}
	//--------------------------------------------------------- Execution Ends ---------------------------------------------------------
	private static void printAll(List<warmup> ar) {
		System.out.println("------------- Sorted by Lastname of all names: -------------");
		for(warmup str: ar) {
			System.out.println(str);}
	}
	
	private static void printConditionally(List<warmup> ar, Condition icondition) {
		System.out.println("-------------  Print name with a condition: -------------");
		for(warmup str: ar) {
			if(icondition.test(str))
				System.out.println(str);
		}
	}
	
	interface Condition{
		boolean test(warmup str);
	}
	
	
}