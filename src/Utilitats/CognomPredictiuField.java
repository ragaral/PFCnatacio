package Utilitats;

import javax.swing.JTextField;
import pfc.natacio.dades.Club;
import pfc.natacio.dades.Nadador;

/**
 *
 * @author Raul
 */
public class CognomPredictiuField extends JTextField {
    private Club club;
    private NomPredictiuField nom;
    
    /**
     * Creates new form CognomPredictiuField
     */
    public CognomPredictiuField() {
        initComponents();
    }
    
    public CognomPredictiuField(Club club, NomPredictiuField nom) {
        this();
        this.club = club;
        this.nom = nom;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
        String partCognom = this.getText();
//                                            !reroceso             !suprimir
        if (!evt.isActionKey() && evt.getKeyCode() != 8 && evt.getKeyCode() != 127) {
            Nadador n = club.predirCognom(nom.getText(), partCognom);
            if (n != null) {
//                System.out.println("rep "+n.getCognom());
                this.setText(n.getCognom());
                this.select(partCognom.length(), this.getText().length());
            }
        }
    }//GEN-LAST:event_formKeyReleased

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        Nadador n = club.predirCognom(nom.getText(), "");
        if (n != null) {
//                System.out.println("rep "+n.getCognom());
            this.setText(n.getCognom());
            this.selectAll();
        }
    }//GEN-LAST:event_formFocusGained

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
