package Utilitats;

import pfc.natacio.dades.Club;

/**
 *
 * @author Raul
 */
public class NomPredictiu extends javax.swing.JComboBox {
    private Club club;
    
    /**
     * Creates new form NomPredictiu
     */
    public NomPredictiu() {
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
    
    public NomPredictiu(Club club) {
        this();
        this.club = club;
        initElements();
    }
    
    /**
     * Afegeix el club per a mostrar el noms dels nadadors
     * @param club 
     */
    public void addClub(Club club){
        this.club = club;
        initElements();
    }
    
    private void initElements(){
        addItem("");
        for(int i = 0; i < club.getNumNadadors(); i++)
            addItem(club.getNadador(i).getNom());
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
    }// </editor-fold>//GEN-END:initComponents

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        setPopupVisible(true);
        showPopup();
    }//GEN-LAST:event_formFocusGained

    private void formKeyReleased(java.awt.event.KeyEvent evt){
        this.selectWithKeyChar(evt.getKeyChar());
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    /*
    public static void main(String args[]){
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(300, 100);
        f.setLocationRelativeTo(null);
        
        NomPredictiu np = new NomPredictiu(new Club("Natacio i Esports Gandia"));
        np.setSize(70, 20);
        f.add(np);
        
        f.setVisible(true);
    }
    */
}