package Comparable_compareToMethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Person implements Comparable<Person>{

	String firstname;
	String lastname;
	int age;
	
	public Person(String firstname, String lastname, int age) {
		this.firstname=firstname;
		this.lastname=lastname;
		this.age=age;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;}
	public void setLastname(String lastname) {
			this.lastname = lastname;}
	public void setAge(int age) {
				this.age = age;}

	
	public String getFirstname() {
		return firstname;}
	public String getLastname() {
		return lastname;}
	public int getAge() {
		return age;}
	
		@Override
		public int compareTo(Person o) {
			return  this.getLastname().compareTo(o.getLastname());
		}


	@Override
		public String toString() {
			return "Person [firstname=" + firstname + ", lastname=" + lastname + ", age=" + age + "]";
		}

	public static void main(String[] args) {
		
		ArrayList <Person> ar = new ArrayList<Person>();
				ar.add(new Person("Tom", "Black", 35));
				ar.add(new Person("Peter", "Ganon", 32));
				ar.add(new Person("Patrick", "Macana", 25));
				ar.add(new Person("Shelly", "Ryan", 28));
				ar.add(new Person("Chris", "Cohen", 38));
				ar.add(new Person("Nancy", "Casey", 40));
		
		
// comparet STRING ---*******************							
		Collections.sort(ar, new Comparator<Person>() {
							public int compare(Person p1, Person p2) {
								return p1.getLastname().compareTo(p2.getLastname());
								}});
		
		
	//public static  PrintLastName(List<>people) {	
		for(Person str: ar) {
				//System.out.println("All the names in the list -- "+str);
				if(str.getLastname().startsWith("C")) {
					System.out.println("Last name with C -- "+str);
				}
		}
	}
		
	}
