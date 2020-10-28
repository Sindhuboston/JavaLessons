package CollectionIterators;

import java.util.ArrayList;

public class ForLoopsTypes {

	public static void main(String[] args) {
		
		ArrayList <String> ar=new ArrayList<String>();
			ar.add("DesignatedSurvivor");
			ar.add("GameOfThrones");
			ar.add("MoneyHeist");
			ar.add("You");
					
		/* forEach loop in Java8: */ System.out.println("************ forEach loop in Java8 ************");
		ar.forEach(System.out::println);
		
		/* using lambda forEach loop in Java8: */ System.out.println("************ lambda -> forEach loop in Java8 ************");
		ar.forEach(p->System.out.println(p));

	}

}
