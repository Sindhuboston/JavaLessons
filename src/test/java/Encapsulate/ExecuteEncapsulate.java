package Encapsulate;

public class ExecuteEncapsulate {
	
	public static void main(String[] args) {
		
		Encapsulate en= new Encapsulate();
		en.setEmail("newemailaddress");
		en.setPassword("newpassword");
		en.setDepartment("newdepartment");
		
		System.out.println(en.getEmail());
		System.out.println(en.getPassword());
		System.out.println(en.getDepartment());
		
	}

}
