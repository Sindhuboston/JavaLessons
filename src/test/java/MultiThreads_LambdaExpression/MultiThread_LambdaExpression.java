package MultiThreads_LambdaExpression;


		//1. Thread is a class it can run multiple threads of execution as defined/called.
		//2. Disadvantage - extend can accept only ONE class.  Important classes can not be called if Thread is already passed as extend.
		//3. Solution is to use Runnnable Interface.   class allows multiple interfaces to be implemented to a class.
		
		// Thread:class  method:"start()" -> uses method:"run()"
		// Runnable: interface method: does NOT have start().

/*
		class Run_ThreadOne implements Runnable {
			public void run() {
				for(int i=0; i<5; i++) {
					System.out.println("Hi -- ThreadOne");
						try {Thread.sleep(1000);}catch (InterruptedException e) {}
			}}
		}
			
		class Run_ThreadTwo implements Runnable  {
			public void run() {
				for(int j=0; j<5; j++) {
					System.out.println("Hello -- ThreadTwo");
					try {Thread.sleep(500);}catch (InterruptedException e) {}
			}}
		}*/
			
public class MultiThread_LambdaExpression{
	
	public static void main(String[] args) {
	/* --- can be replaced with Lambda expresion---	
		Runnable r1 = new Runnable() {
						public void run() {
							for(int i=0; i<5; i++) {
								System.out.println("Hi -- ThreadOne");
								try {Thread.sleep(1000);}catch (InterruptedException e) {}}
					}};
	*//* ------------------------------------LAMBDA EXPRESION------------------------------------ */
		//Runnable interface anonymous class is directly inserted inside Thread class:
		// lambda expression
		Thread t1= new Thread(()->{  for(int i=0; i<5; i++) {
										System.out.println("Hi -- ThreadOne");
										try {Thread.sleep(1000);}catch (InterruptedException e) {}}
									 }
							 		 );
		Thread t2= new Thread(()->{	for(int j=0; j<5; j++) {
										System.out.println("Hello -- ThreadTwo");
										try {Thread.sleep(1000);}catch (InterruptedException e) {}}
									}
									);
		t1.start();	
			try {Thread.sleep(20);}catch(Exception e) {};
		t2.start();
	}
}