/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Resum.java
 *
 * Created on 09-nov-2011, 10:40:48
 */
package Grafiques;

/**
 *
 * @author Raul
 */
public class Resum extends javax.swing.JPanel {

    /** Creates new form Resum */
    public Resum() {
        initComponents();
    }
    
    public Resum(String titol, String b, String tv, String tn, String v, String lb, String e, String a, String vi, String n){
        this.titol.setText(titol);
        numBrasades.setText(b);
        tViratje.setText(tv);
        tNado.setText(tn);
        velocitat.setText(v);
        logBras.setText(lb);
        eixida.setText(e);
        arribada.setText(a);
        viratje.setText(vi);
        nado.setText(n);
    }
    
    public void setTitol(String titol){
        this.titol.setText(titol);
    }
    
    public void setData(String data){
        this.data.setText(data);
    }
    
    public void setBraçades(String braçades){
        this.numBrasades.setText(braçades);
    }
    public void setTempsViretje(String tViratje){
        this.tViratje.setText(tViratje);
    }
    public void setTempsNado(String tNado){
        this.tNado.setText(tNado);
    }
    public void setVelocitat(String velocitat){
        this.velocitat.setText(velocitat);
    }
    public void setLongitudBraçada(String longBraç){
        this.logBras.setText(longBraç);
    }
    public void setPercentEixida(String pEixida){
        this.eixida.setText(pEixida);
    }
    public void setPercentArribada(String pArribada){
        this.arribada.setText(pArribada);
    }
    public void setPercentViratje(String pViratje){
        this.viratje.setText(pViratje);
    }
    public void setPercentNado(String pNado){
        this.nado.setText(pNado);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titol = new javax.swing.JLabel();
        data = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        numBrasades = new javax.swing.JLabel();
        tViratje = new javax.swing.JLabel();
        tNado = new javax.swing.JLabel();
        velocitat = new javax.swing.JLabel();
        logBras = new javax.swing.JLabel();
        eixida = new javax.swing.JLabel();
        arribada = new javax.swing.JLabel();
        viratje = new javax.swing.JLabel();
        nado = new javax.swing.JLabel();

        titol.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        titol.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel2.setText("Brazadas: ");

        jLabel3.setText("Tiempo medio viraje: ");

        jLabel4.setText("Tiempo medio nado: ");

        jLabel5.setText("Velocidad media: ");

        jLabel6.setText("Logitud de brazada: ");

        jLabel7.setText("Tiempo Salida: ");

        jLabel8.setText("Tiempo Llegada: ");

        jLabel9.setText("Tiempo Virajes: ");

        jLabel10.setText("Tiempo Nado: ");

        tViratje.setToolTipText("Tiempo medio en el que el nadador a realizado todos los virajes. ");

        tNado.setToolTipText("Tiempo medio en el que el nadador no ha estado en el viraje, salida y llegada.");

        velocitat.setToolTipText("Velocidad media del nadador en la prueba.");

        logBras.setToolTipText("Metros que el nadador recorre con una brazada. ");

        eixida.setToolTipText("Porcentaje de tiempo total que el nadador tarda en completar la distancia de salida. ");

        arribada.setToolTipText("Porcentaje de tiempo total que el nadador tarda en completar la distancia de llegada.");

        viratje.setToolTipText("Porcentaje de tiempo total que el nadador tarda en recorrer la distancia de aproximación y despegue de la pared.");

        nado.setToolTipText("Porcentaje de tiempo total que el nadador esta nadando sin contar la salida, virajes y llegada.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tNado, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(velocitat, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(logBras, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(eixida, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(arribada, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(viratje, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(nado, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(tViratje, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(numBrasades, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
                .addGap(115, 115, 115))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titol, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titol, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(numBrasades, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tViratje, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tNado, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(velocitat, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(logBras, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(eixida, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(arribada, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(viratje, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(nado, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel arribada;
    private javax.swing.JLabel data;
    private javax.swing.JLabel eixida;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel logBras;
    private javax.swing.JLabel nado;
    private javax.swing.JLabel numBrasades;
    private javax.swing.JLabel tNado;
    private javax.swing.JLabel tViratje;
    private javax.swing.JLabel titol;
    private javax.swing.JLabel velocitat;
    private javax.swing.JLabel viratje;
    // End of variables declaration//GEN-END:variables
}
