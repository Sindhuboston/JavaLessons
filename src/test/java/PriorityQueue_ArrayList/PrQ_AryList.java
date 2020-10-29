package PriorityQueue_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PrQ_AryList implements Comparable<PrQ_AryList> {

	String firstname;
	String lastname;
	int id;
	
	public PrQ_AryList(String firstname, String lastname, int id) {
		this.firstname=firstname;
		this.lastname=lastname;
		this.id=id;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;}
	public void setLastname(String lastname) {
		this.lastname = lastname;}
	public void setId(int id) {
		this.id = id;}
	
	public String getFirstname() {
		return firstname;}
	
	public String getLastname() {
		return lastname;}
	public int getId() {
			return id;}
	
	
	@Override
	public String toString() {
		return "PrQ_AryList [firstname=" + firstname + ", lastname=" + lastname + ", id=" + id + "]";
	}
	@Override
	public int compareTo(PrQ_AryList o) {
		return this.getLastname().compareTo(o.getLastname());
	}
	
	public static void main(String[] args) {
		PrQ_AryList cls = new PrQ_AryList("John","Loomis",66);
		PrQ_AryList cls1 = new PrQ_AryList("Carl","Magnuson",54);
		PrQ_AryList cls2 = new PrQ_AryList("Peggy","Douglas",64);
		PrQ_AryList cls3 = new PrQ_AryList("Mary","Sottile",62);
		PrQ_AryList cls4 = new PrQ_AryList("Erica","Rider",34);
	
	System.out.println("*------------------------------------PriorityQueue starts: ----------------------------------*");	
	PriorityQueue<PrQ_AryList> pq = new PriorityQueue<PrQ_AryList>();
		pq.add(cls3);
		pq.add(cls4);
		pq.add(cls);
		pq.add(cls2);
		pq.add(cls1);
		
	Iterator <PrQ_AryList> it = pq.iterator();
	
	while(it.hasNext()) {
		System.out.println("Sorted by lastname --- compareTo() + no Collections() --- :"+ pq.poll().toString());
	}
	System.out.println("*------------------------------------ArrayList starts: ----------------------------------*");
	ArrayList <PrQ_AryList> ar = new ArrayList<PrQ_AryList>();
		ar.add(cls3);
		ar.add(cls4);
		ar.add(cls2);
		ar.add(cls);
		ar.add(cls1);
		
	Comparator<PrQ_AryList> com = new Comparator<PrQ_AryList>() {
																@Override
																public int compare(PrQ_AryList o1, PrQ_AryList o2) {
																	if(o1.getId() > o2.getId())
																		return 1;
																	else 
																		return -1;}};
	Collections.sort(ar, com);
	
	for(PrQ_AryList str: ar) {
		System.out.println("Sorted by ID --- Comparator() + Collections --- :"+str);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
	}
	

}
