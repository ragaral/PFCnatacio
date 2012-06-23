/*
 * PanelFondo.java
 *
 * Created on 25-oct-2011, 10:19:01
 */
package Utilitats;

import java.awt.*;
import javax.swing.ImageIcon;

/**
 *
 * @author Raul
 */
public class PanelFondo extends javax.swing.JPanel {
    
    private Image imagen;
    
    /** Creates new form PanelFondo */
    public PanelFondo(String nombreImagen) {
        initComponents();
        if (nombreImagen != null) {
            imagen = new ImageIcon( nombreImagen ).getImage();
        }
    }
    
    public PanelFondo(){
        initComponents();
    }
    
    /**
     * Pone una imagen centrada en el fondo 
     * @param nuevaImagen ruta de la imagen
     */
    public void setImagen(String nuevaImagen) {
        imagen = new ImageIcon( nuevaImagen ).getImage();
        repaint();
    }
    
    /**
     * Cambia la posicion de la imagen
     * @param x 
     * @param y 
     */
    public void setPosicionImagen(int x, int y) {
        Graphics g = null;
        g.drawImage(imagen, x, y, imagen.getWidth(this), imagen.getHeight(this), this);
        setOpaque(false);
        super.paint(g);
    }
    
    @Override
    public void paint(Graphics g) {
        if(imagen != null){ //Centra la image en el JPanel
            int amplePanel = this.getHeight()/2,
                ampleImage = imagen.getHeight(this)/2,
                altPanel = this.getWidth()/2,
                altImage = imagen.getWidth(this)/2;
            g.drawImage(imagen, altPanel-altImage, amplePanel-ampleImage, altImage*2, ampleImage*2, this);
        }
        else
            System.out.println("Imagen no valida!");
 
        setOpaque(false);
        super.paint(g);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

}
