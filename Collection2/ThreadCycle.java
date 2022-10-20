package Collection2;



class Thread1 extends Thread{

	@Override
	public void run() {
		m2();
	}
 void m2() {
			System.out.println(" in run method..");
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for(int i=0;i<=20;i++) {
			System.out.println(Thread.currentThread().getName()+" i value "+i);
		}
	
		
	
		
		}
}

public class ThreadCycle {
	public static void main(String[] args) {
		Thread t1= new Thread();
		t1.start();             // start method internally run method call karate
		
		Thread t2=new Thread();
		t2.start();
		
	}

}

