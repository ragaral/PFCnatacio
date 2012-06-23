/*
 * LlistatNadadors.java
 *
 * Created on 03-jul-2011, 15:43:02
 */
package pfc.natacio.vista;

import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import pfc.natacio.logica.Club;
import pfc.natacio.logica.Nadador;

/**
 *
 * @author Raul
 */
public class LlistatNadadors extends javax.swing.JPanel {
     private Club club;
     private Principal principal;

    /** Creates new form LlistatNadadors */
    public LlistatNadadors(Club club) {
        super();
        this.club=club;
        initComponents();
        llistar();
    }
    public LlistatNadadors(Club club, Principal principal) {
        this(club);
        this.principal = principal;
    }
    
    private void llistar(){
        DefaultTableModel modelo = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        };
        final JTable tabla = new JTable(modelo);
        JScrollPane scroll = new JScrollPane(tabla);
        
        scroll.setSize(panel.getSize());
        tabla.setSize(scroll.getSize());
        tabla.setAutoCreateRowSorter(true);
        
        Object iden[] = {"Ficha","Nombre","Apellidos","Fetxa nac."};
        modelo.setColumnIdentifiers(iden);

        for(int i=0; i<club.getNumNadadors(); i++){
            Nadador nad = club.getNadador(i);
            Object fil[] = {nad.getNumFitxFed(),nad.getNom(),nad.getCognom(),nad.getFetxNaix()};
            modelo.addRow(fil);
        }

        tabla.getColumnModel().getColumn(2).setPreferredWidth(200);
        tabla.getColumnModel().getColumn(3).setPreferredWidth(100);

        //tabla.setEnabled(false);
        panel.setLayout(new BorderLayout());
        panel.add(scroll, BorderLayout.CENTER);

        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt){
                mostraDades(tabla,evt);
            }
        });
        
    }
    
    private void mostraDades(JTable tabla, java.awt.event.MouseEvent evt){
        if(evt.getClickCount()==2){
            Object numFitx = tabla.getValueAt(tabla.getSelectedRow(), 0);
            new MostrarInfoNadador(club.buscaNadador(numFitx.toString()), principal);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
