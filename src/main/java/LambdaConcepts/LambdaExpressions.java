package LambdaConcepts;

public class LambdaExpressions {

				interface IntroToLambda{
					void perform();}      /* ---->>>  before lambda:   public void perform();} */
	
				interface addTwoNos{
					int twoNos(int a, int b);}					/* ---->>>  before lambda:   public int twoNos(int a, int b);} */
				
				interface divTwoNos{
					int divNos(int a, int b);}
				
				interface stringLength{
					int sLength(String s);}
				
	
	public static void main(String[] args) {
		IntroToLambda var1 = ()-> System.out.println("Learning Lambda is excitint !!!");
			var1.perform();
	
		addTwoNos var2 = (a, b)->   (a+b);
			int c = var2.twoNos(2, 5);
			System.out.println("Sum is: "+c);
			
		divTwoNos var3 =(a, b)-> {if(a != 0 && b != 0) {
										return (a/b);
											}else {
												System.out.println("Error ---- one of the integer is zero.");
												return 0;
								}};
			int s = var3.divNos(5, 0);
			System.out.println("Answer is: "+s);
		
		stringLength var4 =t-> t.length();
			int len = var4.sLength("Sindhu Sudhakaran");
			System.out.println("Total length of the string is: "+len);
	}
	
}
