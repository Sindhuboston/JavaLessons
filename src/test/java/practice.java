import java.util.ArrayList;

public class practice {
	private ArrayList<String> collection;
	private int NoOfInterfaces;
	private int NoOfClasses;
						//---------------------- Setters ------------------------------------------
						public void setNoOfInterfaces(int noOfInterfaces) {
							this.NoOfInterfaces = noOfInterfaces;}
						public void setCollection(ArrayList<String> collection) {
							this.collection = collection;}
						public void setNoOfClasses(int noOfClasses) {
							this.NoOfClasses = noOfClasses;}
						//---------------------- Getters ------------------------------------------
						public ArrayList<String>  getCollection() {
							return collection;}
						public int getNoOfInterfaces() {
							return NoOfInterfaces;}
						public int getNoOfClasses() {
							return NoOfClasses;}
	public static void main(String[] args) {
		
		practice pr = new practice();
		
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("iterable");
		ar.add("collection");
		ar.add("List");
		ar.add("Queue");
		ar.add("Set");
		ar.add("Deque");
		ar.add("SortedSet");
		
		pr.setCollection(ar);
		pr.setNoOfClasses(9);
		pr.setNoOfInterfaces(7);
		
		System.out.println(pr.getCollection());
		System.out.println(pr.getNoOfClasses());
		System.out.println(pr.getNoOfInterfaces());
	}
}
