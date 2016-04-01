package demo1;

class Runner extends Thread{

	@Override
	public void run() {// put you program  here that you want to run by thread 

			for (int i=0;i<20;i++){
				
				System.out.println("out put from thread1 " +"for "+i+" time "+i);
				
				try {
					Runner.sleep(6000); // thread sleeps for 6 seconds 
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
		super.run();//S super.run() calls the run method of Thread.
	}
	
}

public class App {

	public static void main(String[] args) {
			
		Runner runner1= new Runner();// create  thread
				runner1.start();// this is proper way starting thread
 
				Runner runner2= new Runner();
				runner2.start();
	}

}
