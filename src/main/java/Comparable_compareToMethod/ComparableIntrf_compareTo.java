package Comparable_compareToMethod;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableIntrf_compareTo implements Comparable<ComparableIntrf_compareTo> {

	private String laptop;
	private int ram;
	private int price;
	
	public ComparableIntrf_compareTo(String laptop, int ram, int price) {
		this.laptop=laptop;
		this.ram=ram;
		this.price=price;
	}
		// -------- Setters ------------
			public void setLaptop(String laptop) {
				this.laptop = laptop;}
			public void setRam(int ram) {
				this.ram = ram;}
			public void setPrice(int price) {
				this.price = price;}
	
		// -------- Getters ------------	
			public String getLaptop() {
				return laptop;}
			public int getRam() {
				return ram;}
			public int getPrice() {
				return price;}
		
		@Override
			public String toString() {
				return "Comparable_compareTo [laptop=" + laptop + ", ram=" + ram + ", price=" + price + "]";
			}
		@Override
			public int compareTo(ComparableIntrf_compareTo o) {
				if(this.getRam()>o.getRam()) 
					return 1;	
				else
					return -1;}
		
		
		// ------------------------------------- Execution starts here -----------------------------------------
		
	public static void main(String[] args) {
		
		/* Class objects list  */
				ComparableIntrf_compareTo clso = new ComparableIntrf_compareTo("Apple", 128, 700);
				ComparableIntrf_compareTo clso1 = new ComparableIntrf_compareTo("Surface", 3256, 1599);
				ComparableIntrf_compareTo clso2 = new ComparableIntrf_compareTo("Acer", 256, 667);
				
		/* Arraylist object inside which the all of the above class objects are added to:  */	
				ArrayList<ComparableIntrf_compareTo> ar = new ArrayList<ComparableIntrf_compareTo>();
					ar.add(clso);
					ar.add(clso1);
					ar.add(clso2);
		/* List is sorted --->  compareTo() should be defined :*/	
				Collections.sort(ar);
		
		/* Iterate through the List and print them  */
				for(ComparableIntrf_compareTo str: ar) {
					System.out.println(str);
				}
		}
} 