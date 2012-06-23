/*
 * Cronometro.java
 *
 * Created on 29-jun-2011, 22:59:54
 */
package pfc.natacio.vista;

import java.util.logging.Level;
import java.util.logging.Logger;
import pfc.natacio.logica.ThreadCrono;


/**
 *
 * @author Raul
 */
public class Cronometro extends javax.swing.JPanel{
    private ThreadCrono c;
    private boolean parar;
    
    /** Creates new form Cronometro */
    public Cronometro() {
        c = new ThreadCrono();
        parar = false;
        initComponents();
    }
    
    private void go(){
        Runnable miRunnable = new Runnable(){
            @Override
            public void run()
            {
                //System.out.println("  go - entre");
                while(!parar){
                    temps.setText(c.toString());
                    try {
                        Thread.sleep(9);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Cronometro.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                //System.out.println("  go - ixc");
            }
        };
        Thread hilo = new Thread (miRunnable);
        hilo.start();
    }
    
    public void comensa(){
        c.start();
        this.go();
//        System.out.println("Start!");
    }
    
    public void para(){
        c.parar();
        parar = true;
//        System.out.println("Stop!");
    }
    
    public void continua(){
        parar = false;
        this.go();
        c.restart();
        System.out.println("Restart!");
    }
    
    @Override
    public String toString(){
        return c.toString();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        temps = new javax.swing.JLabel();

        temps.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        temps.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        temps.setText("00:00:00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(temps, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(temps, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel temps;
    // End of variables declaration//GEN-END:variables
}
