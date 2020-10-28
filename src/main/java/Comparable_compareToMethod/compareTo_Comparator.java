package Comparable_compareToMethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class compareTo_Comparator implements Comparable <compareTo_Comparator>{
	String laptop;
	int ram;
	int price;
	
	public compareTo_Comparator(String laptop, int ram, int price) {
		this.laptop=laptop;
		this.ram=ram;
		this.price=price;}
	
	//------------- Setters ----------------------
			public void setLaptop(String laptop) {
				this.laptop = laptop;}
			public void setRam(int ram) {
				this.ram = ram;}
			public void setPrice(int price) {
				this.price = price;}

	//------------- Getters ----------------------
			public String getLaptop() {
				return laptop;}
			public int getRam() {
				return ram;}
			public int getPrice() {
				return price;}
	//------------- Override ----------------------
			@Override
			public int compareTo(compareTo_Comparator o) {
				if (this.getPrice()> o.getPrice())
					return 1;
				else 
					return -1;}
			@Override
			public String toString() {
				return "compareTo_Comparator [laptop=" + laptop + ", ram=" + ram + ", price=" + price + "]";
			}

	public static void main(String[] args) {
		
		ArrayList<compareTo_Comparator> ar = new ArrayList<compareTo_Comparator>();
		
		ar.add(new compareTo_Comparator("Apple", 700, 2189));
		ar.add(new compareTo_Comparator("Surface", 3558, 1500));
		ar.add(new compareTo_Comparator("Acer", 1250, 800));
		
		Comparator<compareTo_Comparator> com = new Comparator<compareTo_Comparator>() {
											public int compare(compareTo_Comparator L1, compareTo_Comparator L2) {
												if (L1.getRam() > L2.getRam())
													return 1;
												else
													return -1;
												}};
		Collections.sort(ar, com);
		
		for(compareTo_Comparator str: ar) {
			System.out.println("print out of sorted list"+ str);
		}
	}
}
