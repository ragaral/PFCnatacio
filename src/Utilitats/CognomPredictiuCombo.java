package Utilitats;

import pfc.natacio.dades.Club;

/**
 *
 * @author Raul
 */
public class CognomPredictiuCombo extends javax.swing.JComboBox {
    private Club club;
    private NomPredictiuCombo nom;
    
    /**
     * Creates new form CognomPredictiuCombo
     */
    public CognomPredictiuCombo() {
        super();
        initComponents();
        getEditor().getEditorComponent().addKeyListener( new java.awt.event.KeyAdapter() {
                    public void keyReleased(java.awt.event.KeyEvent evt) {
                        formKeyReleased(evt);
                    } });
        getEditor().getEditorComponent().addFocusListener( new java.awt.event.FocusAdapter() {
                    public void focusGained(java.awt.event.FocusEvent evt) {
                        formFocusGained(evt);
                    } });
    }
    public CognomPredictiuCombo(Club club, NomPredictiuCombo nom) {
        this();
        this.club = club;
        this.nom = nom;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setEditable(true);
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

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        setPopupVisible(true);
        showPopup();
        initElements();
    }//GEN-LAST:event_formFocusGained

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
        this.selectWithKeyChar(evt.getKeyChar());
    }//GEN-LAST:event_formKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    private void initElements() {
        this.removeAllItems();
        for(int i = 0; i < club.getNumNadadors(); i++)
            if(club.getNadador(i).getNom().equals(nom.getSelectedItem().toString()))
                addItem(club.getNadador(i).getCognom());
    }
}
