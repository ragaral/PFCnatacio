/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pfc.natacio.logica;

import java.util.Calendar;

/**
 *
 * @author Raul
 */
public class ThreadCrono extends Thread{
    private int min, seg, cent;
    private boolean parar;
    
    public ThreadCrono(){
        min = seg = cent = 0;
        parar = false;
    }
    
    @Override
    public void run(){
        Calendar c = Calendar.getInstance();
        long tInicial = System.currentTimeMillis();
        
        while(!parar){
            c.setTimeInMillis( System.currentTimeMillis() - tInicial );
            min = c.get( Calendar.MINUTE );
            seg = c.get( Calendar.SECOND );
            cent = c.get( Calendar.MILLISECOND)/10;
            try {
                ThreadCrono.sleep(9);
            } catch (InterruptedException ex) {}
            //System.out.println(Calendar.SECOND+" - "+this.toString());
        }
    }
    
    public void parar(){
        parar = true;
    }
    
    public void restart(){
        parar = false;
        this.run();
    }
    
    public int getMinuts(){
        return min;
    }
    
    public int getSegons(){
        return seg;
    }
    
    public int getCentecimes(){
        return cent;
    }
    
    @Override
    public String toString(){
        return String.format("%02d:%02d:%02d", min, seg, cent);
    }
}
