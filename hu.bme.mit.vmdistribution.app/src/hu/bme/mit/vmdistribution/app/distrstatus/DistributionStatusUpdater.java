package hu.bme.mit.vmdistribution.app.distrstatus;

public class DistributionStatusUpdater implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			try {
				System.out.println("work.");
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
