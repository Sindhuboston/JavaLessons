package ArrayList;
import java.util.ArrayList;

public class Important_clsObjectEncapArrayLIst {

	private String teacher;
	private String subject;
	private int noOfStudents;
	private ArrayList<String> names;
	
	public Important_clsObjectEncapArrayLIst(String teacher, String subject, int noOfStudents, ArrayList<String> names) {
		this.setTeacher(teacher);
		this.setSubject(subject);
		this.setNoOfStudents(noOfStudents);
		this.setNames(names);	}
	//---------------------------------------------------- Setters --------------------------------------
					public void setTeacher(String teacher) {
						this.teacher = teacher;}
					public void setSubject(String subject) {
							this.subject = subject;}
					public void setNoOfStudents(int noOfStudents) {
							this.noOfStudents = noOfStudents;}
					public void setNames(ArrayList<String>names) {
							this.names = names;}
		//---------------------------------------------------- Getters --------------------------------------
					public String getTeacher() {
						return teacher;}
					public String getSubject() {
						return subject;}
					public int getNoOfStudents() {
						return noOfStudents;}
					public ArrayList<String> getNames() {
						return names;}
	
	public static void main(String[] args) {
	
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Sindhu");
		ar.add("Pratham");
		ar.add("Tom");
		
//Note : important ... ar is an arraylist passed as a paramter to this class.		
		Important_clsObjectEncapArrayLIst cl= new Important_clsObjectEncapArrayLIst("Ms.Stockwell","java",25,ar);
		Important_clsObjectEncapArrayLIst cl1= new Important_clsObjectEncapArrayLIst("Ms.Bartlett","python",20,ar);
		
	System.out.println("Teacher: "+cl.getTeacher());
	System.out.println("Subject: "+cl.getSubject());
	System.out.println("No of students: "+cl.getNoOfStudents());
	System.out.println("Top 3 students: "+cl.getNames());
	System.out.println("****************************************************");
	System.out.println("Teacher: "+cl1.getTeacher());
	System.out.println("Subject: "+cl1.getSubject());
	System.out.println("No of students: "+cl1.getNoOfStudents());
	System.out.println("Top 3 students: "+cl1.getNames());
	
	}
	
}
