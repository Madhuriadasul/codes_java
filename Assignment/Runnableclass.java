package Assignment;

import Multithreading.RunnableClass;

 class Runnableclass  implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread is ended");
				 
		
	}
	public static void main(String[] args) {
		RunnableClass ex= new RunnableClass();
		
		Thread t1= new Thread();
		t1.start();
		
	System.out.println("hello java");
		
		
	}
	 
 } 

