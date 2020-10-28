package Comparable_compareToMethod; //https://youtu.be/oAp4GYprVHM

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PracticeComparable implements Comparable<PracticeComparable>{
	String laptop;
	int ram;
	int price;
	
	public  PracticeComparable(String laptop, int ram, int price) {
		this.laptop=laptop;
		this.ram=ram;
		this.price=price;}
	
	//---------------- Setters -----------------
			public void setLaptop(String laptop) {
				this.laptop = laptop;}
			public void setRam(int ram) {
				this.ram = ram;}
			public void setPrice(int price) {
				this.price = price;}
		
	//---------------- Getters -----------------	
			public String getLaptop() {
				return laptop;}
			public int getRam() {
				return ram;}
			public int getPrice() {
				return price;}
			
	//---------------- Override -----------------	
	@Override
			public int compareTo(PracticeComparable o) {
				if(this.getRam()>o.getRam())
					return 1;
				else 
					return -1;
			}
		
	@Override
			public String toString() {
				return "PracticeComparable [laptop=" + laptop + ", ram=" + ram + ", price=" + price + "]";
			}
	
	// ------------------------- Execution starts here ------------------------------------------

	public static void main(String[] args) {
	
	//Class Objects defined inside the Array objects: 	
			ArrayList<PracticeComparable> ary = new ArrayList<PracticeComparable>();
					ary.add(new PracticeComparable("Apple",128,700));
					ary.add(new PracticeComparable("Surface",3500,1500));
					ary.add(new PracticeComparable("Acer",256,657));

					// ------------------------- Comparator is used: ------------------------------------------
	//Comparator : built-in sorting -- situations when it is used:
					// 1. to override the compareTo sorting.   In case a different column needs to be soreted. 
					// 2. when it is a third party class and Comparable Interface is not implemented
					
			Comparator<PracticeComparable> com = new Comparator<PracticeComparable>() {
				
				public int compare(PracticeComparable L1, PracticeComparable L2) {
					if(L1.getPrice()>L2.getPrice())
							return 1;
					else 
							return -1;
				}
			};
				
	//sorting of data with logic defined in the compareTo() method:
			Collections.sort(ary, com);
			for(PracticeComparable str: ary) {
				System.out.println(str);
			}
	}
}