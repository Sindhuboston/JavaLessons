package Forloops_Ifstatements;

class If_statements {

}
class If_AndOr{
	    public static void main(String[] args) {

	        int width = 10;
	        int height = 5;

	        // Both expressions must evaluate to true.
	        if (width == 10 && height == 5) {
	            System.out.println("width 10 and height 5");
	        }

	        // Only one expression must be true.
	        if (width == 100 || height > 0) {
	            System.out.println("width 100 or height greater than 0");
	        }
	    }
class If_EqualNotEqual{
	    public void main(String[] args) {

	        int value = 5;

	        // This expression...
	        if (value != 6) {
	            System.out.println("Not 6!");
	        }

	        // Is the same as this one.
	        if (!(value == 6)) {
	            System.out.println("Not 6!");
	        }
	    }
}

class If_BooleanCheck{
		public void main(String[] args) {
	
	        int width = 10;
	        int height = 15;
	        int weight = 200;
	
	        // Use a boolean to store computed result.
	        boolean fits = width <= 10 && height <= 20;
	
	        // We can use the boolean, not a complex expression.
	        if (fits && weight <= 150) {
	            System.out.println("It fits");
	        } else {
	            System.out.println("Does not fit");
	        }
	    }
}
	
class If_TrueFalse{
	
	public  void main(String[] args) {

        boolean vacant = true;
        boolean occupied = false;

        // Test boolean variables.
        if (vacant && !occupied) {
            System.out.println(true);
        }
    }

}
}
