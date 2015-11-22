package hu.bme.mit.vmdistribution.app.ssh;

import java.util.logging.Logger;

import com.jcraft.jsch.SftpProgressMonitor;

public class CopyProgressMonitor implements SftpProgressMonitor {
	
	private static final Logger logger = Logger.getLogger(CopyProgressMonitor.class.getName());
	private long currentbyte = 0;
	private int hundredmegs = 1;

    public CopyProgressMonitor() {
    	
    }
   
    public void init(final int op, final String src, final String dest, final long max) 
    {
    }

    public boolean count(final long bytes)
    {
    	this.currentbyte += bytes;
    	if(currentbyte > 100000000 * hundredmegs){
    		logger.info("Copied "+String.valueOf(currentbyte/1000000)+"MBytes of ?");
    		hundredmegs++;
    	}
    	
        return(true);
    }

    public void end()
    {
    	logger.info("\nFINISHED!");
    }

}
