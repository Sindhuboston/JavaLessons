package Interface_Inheritance;

public class ImplementsInheritance implements Inheritance {

	public void iterable() {
		System.out.println("collection -- extends iterable");
	}

	public void collection() {
		System.out.println("Queue -- extends collection");	
		System.out.println("List --  extends collection");
		System.out.println("Set --  extends collection");
	}

	public void Queue() {
		System.out.println("Priority implements Queue");
		System.out.println("Deque --  extends Queue");
	}

	public void List() {
		System.out.println("ArrayList --  implements List");
		System.out.println("LinkedList --  implements List");
		System.out.println("Vector --  implements List");
	}
	public void Vector() {
		System.out.println("Stack --  extends Vector");
	}
	
	public void Deque() {
		System.out.println("ArrayDeque --  implements Deque");
	}

	public void Set() {
		System.out.println("HashSet --  implements Set");
		System.out.println("LinkedHashSet --  implements Set");
		System.out.println("SortedSet --  extends Set");
	}

	public void SortedSet() {
		System.out.println("TreeSet --  implements SortedSet");		
	}
	public void LinkedList() {
		System.out.println("LinkedList --  also implements Deque");
	}
	
}
