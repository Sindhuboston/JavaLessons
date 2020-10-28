package LambdaConcepts;

public class LambdaLessons {

	interface IntroToLambda{
		 void perform();}
	
	interface addTwoNos{
		 int addNos(int a, int b);}
	
	interface divTwoNos{
		 int divNos(int c, int d);}

	interface stringLength{
		 int sLength(String s);}
	
	
	public static void main(String[] args) {
/* 1. Print */	
		IntroToLambda var1 = ()-> System.out.println("Learning Lambda is exciting !!!");
			var1.perform();
/* 2. Add 2 Integers */		
		addTwoNos var2 = (a,b)-> (a+b);
			int vSum =var2.addNos(10, 11);
			System.out.println("Sum of the two values: "+vSum);
/* 3. Div (with If check for zero) 2 Integers */		
		divTwoNos var3 = (c,d)->{ 
								if(c != 0 && d != 0){
									return c/d; 	
										}else{
											System.out.println("Error ---- zero cannot be divided.");
											return 0;
											}};
			int vAns = var3.divNos(16, 4);
			System.out.println("Answer is: "+vAns);
/* 4. Function to measure the length of a string*/		
		stringLength var4 = (s)->s.length();
			System.out.println("Total length of the string: "+var4.sLength("Sindhu Sudhakaran"));
	}

}

class Experiment{
	
	interface StringLength{
		int SLength(String s);}
	interface AddTwoNos{
		int AddNos(int a, int b);}
	
	
			public static void PrintLength(StringLength s) {
				System.out.println("Total characters: "+s.SLength("This string will be measured."));
			}
			
			public static void AddTwoNumbers( AddTwoNos int a, int b) {
				System.out.println("Result : "+(2, 4));
			}
	
	
	public static void main(String[] args) {
		
		PrintLength(s->s.length());
		
		AddTwoNumbers((a,b)->(a+b));
	}
}