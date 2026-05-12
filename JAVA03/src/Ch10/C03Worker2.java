package Ch10;

public class C03Worker2 implements Runnable {
	
	C03GUI gui2;
	
	
	public C03Worker2(C03GUI c03gui2) {
		this.gui2 = c03gui2;
	}


	@Override
	public void run() {
		
		try{
		
		for(int i=0;;i++) {
			System.out.println("TASK02..."+i);
			gui2.area2.append("Task02..."+i+"\n");
			Thread.sleep(500);
		}
			}catch(InterruptedException e) {
				e.printStackTrace();
				System.out.println("[EXCEPTION] WORKER02 THREAD INTERUPTED..");
				
			}
		}
		
	}




