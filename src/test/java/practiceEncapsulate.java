
public class practiceEncapsulate {

	private String machine;
	private int price;
	private String utility;
		//---- Setters......	
			public String getMachine() {
				return machine;}
			public void setMachine(String machine) {
				this.machine = machine;}
			public void setUtility(String utility) {
				this.utility = utility;}
		
		//---- Getters......
			public void setPrice(int price) {
				this.price = price;}
			public int getPrice() {
				return price;}
			public String getUtility() {
				return utility;}

			

public static void main(String[] args) {
	practiceEncapsulate en = new practiceEncapsulate();
		
		en.setMachine("Vitamix");
		en.setPrice(200);
		en.setUtility("grinder");
		
		
		System.out.println(en.getMachine());
		System.out.println(en.getPrice());
		System.out.println(en.getUtility());
}
}