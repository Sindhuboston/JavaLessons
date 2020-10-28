package ArrayList;

import java.util.ArrayList;

public class Pass_ArrayList_In_Setter {

	ArrayList<String> furnitures;
	int noOffurnitures;
	String wallHangings;
	int noOfEachWallHangings;
							// ----------------------------------------------- Setters -------------------
							public void setFurnitures(ArrayList<String> furnitures) {
								this.furnitures = furnitures;
							}
							public void setNoOffurnitures(int noOffurnitures) {
								this.noOffurnitures = noOffurnitures;
							}
							public void setWallHangings(String wallHangings) {
								this.wallHangings = wallHangings;
							}
							public void setNoOfEachWallHangings(int noOfEachWallHangings) {
								this.noOfEachWallHangings = noOfEachWallHangings;
							}
	
							// ------------------------------------------------ Getters ------------------
							public ArrayList<String> getFurnitures() {
								return furnitures;
							}
							public int getNoOffurnitures() {
								return noOffurnitures;
							}
							public String getWallHangings() {
								return wallHangings;
							}
							public int getNoOfEachWallHangings() {
								return noOfEachWallHangings;
							}
							
	public static void main(String[] args) {
		
		Pass_ArrayList_In_Setter ps = new Pass_ArrayList_In_Setter();
		
		
		ArrayList<String> ar = new ArrayList<String>();
			ar.add("Dinning Set, Livingroom Set, Formalroom Set, Kitchen Set, Bedroom Set");
		
		ps.setFurnitures(ar);
		ps.setNoOffurnitures(20);
		ps.setNoOfEachWallHangings(15);
		ps.setWallHangings("paintings");
			
			
			
		System.out.println(ps.getFurnitures());
		System.out.println(ps.getNoOffurnitures());
		System.out.println(ps.getWallHangings());
		System.out.println(ps.getNoOfEachWallHangings());
		
		
	}
	
	
	
	
}
