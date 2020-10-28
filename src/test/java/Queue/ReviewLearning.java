package Queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class ReviewLearning implements Comparable{
	
	private String name;
	private int rank;
	private String subject;
	
	public  ReviewLearning(String name,int rank,String subject) {
		this.name=name;
		this.rank=rank;
		this.subject=subject;
	}	
	
	@Override
	public String toString() {
		return "ReviewLearning [name=" + name + ", rank=" + rank + ", subject=" + subject + "]";
	}
	@Override
	public int compareTo(ReviewLearning st) {
		if(this.rank > st) {
			return 1;
			else {
				return -1;
			}
		
		return 0;}
	}
	

	
	public static void main(String[] args) {
		/* Create class object of the constructor :*/
		ReviewLearning clo = new ReviewLearning("Tom",5,"Java");
		ReviewLearning clo1 = new ReviewLearning("Sam",1,"Java");
		ReviewLearning clo2 = new ReviewLearning("Nancy",3,"Java");
		ReviewLearning clo3 = new ReviewLearning("Sheril",2,"Java");
		
		/* Create PriorityQueue object to add all above class objects to it :*/
		PriorityQueue <ReviewLearning> pQ = new PriorityQueue<ReviewLearning>();
			pQ.add(clo);
			pQ.add(clo1);
			pQ.add(clo2);
			pQ.add(clo3);
		
		Iterator<ReviewLearning> it = pQ.iterator();
		
		while(it.hasNext()) {
			//ReviewLearning vData = it.next();
			System.out.println("data printed from PriorityQueue: "+pQ.poll().toString());
		}
	}



	
}
