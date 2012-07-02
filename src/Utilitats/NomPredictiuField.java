package Utilitats;

import javax.swing.JTextField;
import pfc.natacio.dades.Club;
import pfc.natacio.dades.Nadador;

/**
 *
 * @author Raul
 */
public class NomPredictiuField extends JTextField {
    private Club club;
    
    /**
     * Creates new form NomPredictiuField
     */
    public NomPredictiuField() {
        initComponents();
        this.setText("");
    }
    
    public NomPredictiuField(Club club) {
        this();
        this.club = club;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setMinimumSize(new java.awt.Dimension(10, 20));
        setPreferredSize(new java.awt.Dimension(16, 20));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
        String text = this.getText();
//        System.out.println(evt.getKeyCode());
//                                             !reroceso            !suprimir
        if (!evt.isActionKey() && evt.getKeyCode() != 8 && evt.getKeyCode() != 127) {
            Nadador n = club.predirNom(text);
            if (n != null) {
//                System.out.println("rep "+n.getCognom());
                this.setText(n.getNom());
                this.select(text.length(), this.getText().length());
            }
        }
    }//GEN-LAST:event_formKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
