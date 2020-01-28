import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Collections1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		ArrayList col = new ArrayList();
		
		
		
		

	}

}



public class Task implements Runnable {
	private String name;
	public Task(String name) {
		super();
		this.name = name;		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub		
	}
	
}
public class runnables {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
	
	
	Thread t1 = new Thread(new Task("This is the Task 1"));
	t1.start();
	Thread t2 = new Thread(new Task("This is the Task 2"));
	t2.start();

}}

