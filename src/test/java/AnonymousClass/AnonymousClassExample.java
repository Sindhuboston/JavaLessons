package AnonymousClass;


//--------------------------------------------------- Class Override with Anonymous Class : ----------------------------------------------------
//--------------------------------------------------- Class Override with Anonymous Class : ----------------------------------------------------
class outsideClass{
	public void oClass() {
		System.out.println("outside --- AnonymousClassExample");
	}
}

class AnonymousClassExample{
	
	public static void main(String[] args) {
		outsideClass oc = new outsideClass() {
			public void oClass() {
				 System.out.println("inside --- AnonymousClassExample");
			}
		};
		oc.oClass();
	}
}
//--------------------------------------------------- Interface with Anonymous Class : ----------------------------------------------------
//--------------------------------------------------- Interface with Anonymous Class : ----------------------------------------------------
 interface DirectUse{
	 public void perform(); }
 
 class classDirectInterfaceUse{
	 public static void main(String[] args) {									// Interface direct implement in class object execution.
		 DirectUse inr = new DirectUse() 
						 {																			 // One time use only. 
							 public void perform() {
								 System.out.println("Interface method from Class directly.");}
						 };
		 inr.perform();
	 } 
 }
// Types of Interface:
// 1. Normal = interface that has more than MORE than one method is normal Interface( >1 method).
// 2. Single abstract method = interface that contains only ONE method. 
// 3. Marker = Interface that has NONE method. It's empty .. eg:system interface = " seraializable" 
 
 // Important in 1.8 Java version ---->> 
 //  * Single abstract Interface-  "Functional Interface" -- Lambda expression - from language Scala<<---------------
 // "FUNTIONAL INTERFACE has been added for Lambda expression, starting from 1.8 version of Java."