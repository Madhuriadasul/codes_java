package Assignment;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class javaCallable implements Callable{

	@Override
	public Object call() throws Exception {
		
		Random randObj= new Random();
		Integer randNo= randObj.nextInt(10);
		
		Thread.sleep(randNo *100);
		return randNo;
		
	}
	
}

public class CallableEg {
public static void main(String[] args) throws InterruptedException, ExecutionException {
	FutureTask[] randomNoTask=new FutureTask[10];
	
	for(int i=0;i<10;i++) {
		Callable cle= new javaCallable();
		randomNoTask[i]=new FutureTask(cle);
		
		
		Thread th= new Thread(randomNoTask[i]);
		th.start();
	}
	for (int i=0;i<10;i++) {
		Object o=randomNoTask[i].get();
		
		System.out.println("the random number is" + o);
		
	}
	
	
}
}
