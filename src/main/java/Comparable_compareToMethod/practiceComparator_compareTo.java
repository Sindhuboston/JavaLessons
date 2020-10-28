package Comparable_compareToMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class practiceComparator_compareTo implements Comparable <practiceComparator_compareTo>{

	
	String firstname;
	String lastname;
	int age;
	
	
	public  practiceComparator_compareTo(String firstname, String lastname, int age) {
				this.firstname=firstname;
				this.lastname=lastname;
				this.age=age;
				
		
	}
				// ------------Setters -----------------------
				public void setFirstname(String firstname) {
					this.firstname = firstname;}
				
				public void setLastname(String lastname) {
						this.lastname = lastname;}
				public void setAge(int age) {
					this.age = age;}
				// ------------Getters -----------------------				
				public String getFirstname() {
					return firstname;}
				public String getLastname() {
					return lastname;}
				public int getAge() {
					return age;}
				
				@Override
				public int compareTo(practiceComparator_compareTo o) {
					return this.getLastname().compareTo(getLastname());}
				@Override
				public String toString() {
					return "practiceComparator_compareTo [firstname=" + firstname + ", lastname=" + lastname + ", age="
							+ age + "]";}
					

	public static void main(String[] args) {
		
		List<practiceComparator_compareTo> ar = Arrays.asList(
				new practiceComparator_compareTo("Tom", "Dickonson", 35),
				new practiceComparator_compareTo("Henry", "Cohen", 28),
				new practiceComparator_compareTo("Patricia", "Dungan", 30),
				new practiceComparator_compareTo("Sam", "Adams", 39)
				);
		
		Comparator <practiceComparator_compareTo> com = new Comparator<practiceComparator_compareTo>() {
			
			public int compare(practiceComparator_compareTo p1, practiceComparator_compareTo p2) {
				return p1.getLastname().compareTo(p2.getLastname());
			}
			
		};
		
		Collections.sort(ar, com);
		
		for(practiceComparator_compareTo str: ar) {
			/*if(str.getLastname().startsWith("D")) {
				System.out.println("Lastname starts with ---- "+str);
			}*/
			System.out.println("list of names: "+str);
		}
		
		
		
		
		
		
		
	}
	

}
