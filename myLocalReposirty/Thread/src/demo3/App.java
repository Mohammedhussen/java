package demo3;


public class App {

	public static void main(String args[]){
		Thread t1=new Thread(new Runnable(){

			@Override
			public void run() {
				for (int i=0;i<10;i++){
					
					System.out.println("out put from thread5 " +"for "+i+" time "+i);
					
					try {
						Thread.sleep(400);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			
			}
			
		});
				t1.start();
	}
	
	
}
