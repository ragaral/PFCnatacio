/*
 * LlistarTemps.java
 *
 * Created on 07-dic-2011, 11:14:40
 */
package pfc.natacio.vista;

import java.awt.Point;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import pfc.natacio.logica.Data;
import pfc.natacio.logica.Nadador;
import pfc.natacio.logica.Prova;

/**
 *
 * @author Raul
 */
public class LlistarTemps extends javax.swing.JPanel {
    private Nadador nadador;
    private Principal principal;

    /** Creates new form MostrarTemps */
    public LlistarTemps() {
        initComponents();
        this.setVisible(true);
    }

    public LlistarTemps(Nadador n, Principal principal){
        this();
        this.nadador = n;
        this.principal = principal;
        nadador.initProves();
        buscaProbes();
    }
    
    private void buscaProbes(){
        titol.setText(titol.getText()+nadador.getNom());
        Prova prova;

        //String[][] dades = new String[nadador.getNumProbes()][4];
        Object[][] dades = new Object[nadador.getNumProbes()][7];
        String[] capsalera={"Metros","Estilo","Tiempo","Fecha","Lugar","Piscina","Parciales"};

        for(int i=0; i<nadador.getNumProbes(); i++){
            prova = nadador.getProba(i);
            dades[i][0] = prova.getMetres();
            dades[i][1] = prova.getEstil();
            dades[i][2] = prova.getTemps();
            dades[i][3] = prova.getData();
            dades[i][4] = prova.getLloc();
            dades[i][5] = prova.getMetresPicina();
            dades[i][6] = "no";
            if(prova.conteParcials())
                dades[i][6] = "SI";
        }

        tabla.setModel(new DefaultTableModel(dades,capsalera){
            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu = new javax.swing.JPopupMenu();
        menuItemVerEstadisticas = new javax.swing.JMenuItem();
        titol = new javax.swing.JLabel();
        scrollPanel = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        popupMenu.setMinimumSize(new java.awt.Dimension(50, 20));

        menuItemVerEstadisticas.setText("Ver estadisticas");
        menuItemVerEstadisticas.setFocusPainted(true);
        menuItemVerEstadisticas.setFocusable(true);
        menuItemVerEstadisticas.setHideActionText(true);
        menuItemVerEstadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemVerEstadisticasActionPerformed(evt);
            }
        });
        popupMenu.add(menuItemVerEstadisticas);

        titol.setFont(new java.awt.Font("DejaVu Sans", 0, 24)); // NOI18N
        titol.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titol.setText("Tiempos de ");

        scrollPanel.setAutoscrolls(true);

        tabla.setAutoCreateRowSorter(true);
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Metros", "Estilo", "Tiempo", "Fecha", "Lugar", "Piscina", "Parciales"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        scrollPanel.setViewportView(tabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(titol, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                    .addComponent(scrollPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titol, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        menuItemVerEstadisticas.setEnabled(true);
        Point p = evt.getPoint();
        int row = tabla.rowAtPoint(p);
        int col = tabla.columnAtPoint(p);
        int rowAux;

        // The autoscroller can generate drag events outside the Table's range.
        if ((col == -1) || (row == -1)) {
            return;
        }

        if (SwingUtilities.isRightMouseButton(evt)) {
            tabla.setRowSelectionInterval(row, row);
            rowAux = tabla.convertRowIndexToModel(row);
            if(tabla.getModel().getValueAt(rowAux, tabla.getColumnCount()-1).equals("no")){
                menuItemVerEstadisticas.setEnabled(false);
            }
            popupMenu.setLocation(evt.getLocationOnScreen());
            popupMenu.setVisible(true);
        }
    }//GEN-LAST:event_tablaMouseClicked

    private void menuItemVerEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemVerEstadisticasActionPerformed
        int row = tabla.convertRowIndexToModel(tabla.getSelectedRow());
        
        int metres = Integer.parseInt(tabla.getModel().getValueAt(row, 0).toString());
        String estil = tabla.getModel().getValueAt(row, 1).toString();
        Data data = new Data(tabla.getModel().getValueAt(row, 3).toString());
        principal.addPestanyaEstadistiquesParcials(nadador, metres, estil, data);
    }//GEN-LAST:event_menuItemVerEstadisticasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem menuItemVerEstadisticas;
    private javax.swing.JPopupMenu popupMenu;
    private javax.swing.JScrollPane scrollPanel;
    private javax.swing.JTable tabla;
    private javax.swing.JLabel titol;
    // End of variables declaration//GEN-END:variables
}
