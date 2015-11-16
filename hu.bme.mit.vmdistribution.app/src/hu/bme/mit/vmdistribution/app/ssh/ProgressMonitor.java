package hu.bme.mit.vmdistribution.app.ssh;

import java.util.logging.Logger;

import com.jcraft.jsch.SftpProgressMonitor;

public class ProgressMonitor implements SftpProgressMonitor {
	
	private static final Logger logger = Logger.getLogger(ProgressMonitor.class.getName());
	private long currentbyte = 0;
	private double hundredmbcounter = 1;

    public ProgressMonitor() {;}
   
    public void init(int op, String src, String dest, long max) 
    {
    }

    public boolean count(long bytes)
    {
    	this.currentbyte += bytes;
    	if(currentbyte > 10000000 * hundredmbcounter){
    		logger.info("Copied "+String.valueOf(currentbyte/1000000.0)+"MB of ?");
    		hundredmbcounter++;
    	}
    	
        return(true);
    }

    public void end()
    {
    	logger.info("\nFINISHED!");
    }

}
