package pfc.natacio.vista;

import pfc.natacio.dades.Parcials;
import pfc.natacio.dades.Prova;
import pfc.natacio.dades.Club;
import pfc.natacio.dades.Nadador;
import Utilitats.CognomPredictiuCombo;
import Utilitats.NomPredictiuCombo;
import java.awt.event.FocusEvent;
import javax.swing.JOptionPane;
import pfc.natacio.logica.*;

/**
 *
 * @author Raul
 */
public class EstadistiquesParcials extends javax.swing.JPanel {
    private Club club;
    
    /**
     * Creates new form EstadistiquesParcials
     */
    public EstadistiquesParcials(Club club) {
        this.club = club;
        initComponents();
        this.setVisible(true);
        
    }
    
    public EstadistiquesParcials(Club club, Nadador nadador, int metres, String estil, Data data) {
        this(club);
        nomPredictiu.setSelectedItem(nadador.getNom());
        cognomPredictiu.setSelectedItem(nadador.getCognom());
        comboMetres.setSelectedItem(metres);
        comboEstil.setSelectedItem(estil);
        fieldData.setText(data.toString());
        initGrafiques(nadador, metres, estil, data);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogCalendari = new javax.swing.JDialog();
        calendari = new Utilitats.Calendari();
        buttonAceptarCalendari = new javax.swing.JButton();
        spaneContenedor = new javax.swing.JSplitPane();
        spaneEsquerra = new javax.swing.JSplitPane();
        tempsParcials = new Grafiques.GraficaLineal();
        acceleracio = new Grafiques.GraficaLineal();
        spaneDreta = new javax.swing.JSplitPane();
        velocitat = new Grafiques.GraficaLineal();
        tarta = new Grafiques.GraficaQuesito();
        toolBar = new javax.swing.JToolBar();
        jLabel1 = new javax.swing.JLabel();
        nomPredictiu = new NomPredictiuCombo(club);
        cognomPredictiu = new CognomPredictiuCombo(club,nomPredictiu);
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jLabel2 = new javax.swing.JLabel();
        comboMetres = new javax.swing.JComboBox();
        comboEstil = new javax.swing.JComboBox();
        fieldData = new javax.swing.JTextField();
        buttonCalendari = new javax.swing.JButton();

        dialogCalendari.setLocationByPlatform(true);
        dialogCalendari.setMinimumSize(new java.awt.Dimension(320, 270));
        dialogCalendari.setModal(true);
        dialogCalendari.setResizable(false);

        buttonAceptarCalendari.setText("Aceptar");
        buttonAceptarCalendari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAceptarCalendariActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dialogCalendariLayout = new javax.swing.GroupLayout(dialogCalendari.getContentPane());
        dialogCalendari.getContentPane().setLayout(dialogCalendariLayout);
        dialogCalendariLayout.setHorizontalGroup(
            dialogCalendariLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(calendari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(dialogCalendariLayout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(buttonAceptarCalendari))
        );
        dialogCalendariLayout.setVerticalGroup(
            dialogCalendariLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogCalendariLayout.createSequentialGroup()
                .addComponent(calendari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonAceptarCalendari)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        spaneContenedor.setDividerLocation(350);
        spaneContenedor.setResizeWeight(0.5);

        spaneEsquerra.setDividerLocation(230);
        spaneEsquerra.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        spaneEsquerra.setResizeWeight(0.5);
        spaneEsquerra.setLeftComponent(tempsParcials);
        spaneEsquerra.setRightComponent(acceleracio);

        spaneContenedor.setLeftComponent(spaneEsquerra);

        spaneDreta.setDividerLocation(230);
        spaneDreta.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        spaneDreta.setResizeWeight(0.5);
        spaneDreta.setLeftComponent(velocitat);

        javax.swing.GroupLayout tartaLayout = new javax.swing.GroupLayout(tarta);
        tarta.setLayout(tartaLayout);
        tartaLayout.setHorizontalGroup(
            tartaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 344, Short.MAX_VALUE)
        );
        tartaLayout.setVerticalGroup(
            tartaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 233, Short.MAX_VALUE)
        );

        spaneDreta.setRightComponent(tarta);

        spaneContenedor.setRightComponent(spaneDreta);

        toolBar.setFloatable(false);
        toolBar.setRollover(true);

        jLabel1.setText("Nadador:");
        toolBar.add(jLabel1);

        nomPredictiu.setMaximumSize(new java.awt.Dimension(100, 20));
        nomPredictiu.setMinimumSize(new java.awt.Dimension(70, 20));
        toolBar.add(nomPredictiu);

        cognomPredictiu.setMaximumSize(new java.awt.Dimension(125, 20));
        toolBar.add(cognomPredictiu);
        toolBar.add(jSeparator1);

        jLabel2.setText("Prueba:");
        toolBar.add(jLabel2);

        comboMetres.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "50", "100", "200", "400", "800", "1500" }));
        comboMetres.setMaximumSize(new java.awt.Dimension(50, 20));
        toolBar.add(comboMetres);

        comboEstil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Espalda", "Braza", "Mariposa", "Libres", "Estilos" }));
        comboEstil.setMaximumSize(new java.awt.Dimension(70, 20));
        toolBar.add(comboEstil);

        fieldData.setText("dd/mm/aaaa");
        fieldData.setMaximumSize(new java.awt.Dimension(90, 20));
        fieldData.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fieldDataFocusLost(evt);
            }
        });
        toolBar.add(fieldData);

        buttonCalendari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imatges/calendario.gif"))); // NOI18N
        buttonCalendari.setFocusable(false);
        buttonCalendari.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonCalendari.setMaximumSize(new java.awt.Dimension(20, 20));
        buttonCalendari.setMinimumSize(new java.awt.Dimension(1, 1));
        buttonCalendari.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonCalendari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCalendariActionPerformed(evt);
            }
        });
        toolBar.add(buttonCalendari);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spaneContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(toolBar, javax.swing.GroupLayout.DEFAULT_SIZE, 702, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(toolBar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spaneContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void fieldDataFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldDataFocusLost
        int metres = Integer.parseInt(comboMetres.getSelectedItem().toString());
        String estil = comboEstil.getSelectedItem().toString();
        Data data = new Data(fieldData.getText());
        Nadador nad = club.buscaNadador(nomPredictiu.getSelectedItem().toString(), cognomPredictiu.getSelectedItem().toString());
        nad.initProves();

        initGrafiques(nad, metres, estil, data);
    }//GEN-LAST:event_fieldDataFocusLost

    private void buttonCalendariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCalendariActionPerformed
        dialogCalendari.setVisible(true);
        fieldData.setText(calendari.toString());
        fieldData.requestFocus();
        fieldDataFocusLost(new FocusEvent(dialogCalendari, 0));
    }//GEN-LAST:event_buttonCalendariActionPerformed

    private void buttonAceptarCalendariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAceptarCalendariActionPerformed
        dialogCalendari.dispose();
    }//GEN-LAST:event_buttonAceptarCalendariActionPerformed

    private void initGrafiques(Nadador nad, int metres, String estil, Data data){
        try{
            Prova prova = nad.buscaProva(metres, estil, data);
            Parcials parcials = prova.getParcials();

            initGraficaTempsParcial(parcials, estil);
            initGraficaVelocitat(parcials, estil);
            initGraficaAcceleracio(parcials, estil);
            initGraficaTarta(parcials);

            repaint();
        }catch(NullPointerException ex){
            JOptionPane.showMessageDialog(null, "No hay parciales en ese dia" );
        }
    }
    
    private void initGraficaTempsParcial(Parcials parcial, String estil) {
        for(int i = 0; i < parcial.getNumPostes(); i++){
            tempsParcials.setData(parcial.getTemps(i).toSegons(), estil, parcial.getMetres(i)+"");
        }
        tempsParcials.createChart("Tiempo", "", "Metros", "Tiempo (seg)");
    }
    
    private void initGraficaVelocitat(Parcials parcial, String estil) {
        double metresAnterior = 0, metres;
        double tempsAnterior = 0, temps;
        double aux;
        
        for(int i = 0; i < parcial.getNumPostes(); i++){
            metres = parcial.getMetres(i) - metresAnterior;
            temps = parcial.getTemps(i).toSegons() - tempsAnterior;
            aux = metres/temps;
            velocitat.setData(aux, estil, parcial.getMetres(i)+"");
            
            metresAnterior = parcial.getMetres(i);
            tempsAnterior = parcial.getTemps(i).toSegons();
        }
        
        velocitat.createChart("Velocidad", "", "Metros", "Velocidad (m/s)");
    }
    
    private void initGraficaAcceleracio(Parcials parcial, String estil){
        double metresAnterior = 0, metres;
        double tempsAnterior = 0, temps;
        double aux;
        
        for(int i = 0; i < parcial.getNumPostes(); i++){
            metres = parcial.getMetres(i) - metresAnterior;
            temps = parcial.getTemps(i).toSegons() - tempsAnterior;
            //a = (velFinal - velIni)/(tFinal - tIni)
            double v1 = (metresAnterior/tempsAnterior)==Double.NaN?(metresAnterior/tempsAnterior):0;
            aux = ((metres/temps) - v1) / (temps - tempsAnterior);
            acceleracio.setData(aux, estil, parcial.getMetres(i)+"");
            
            metresAnterior = parcial.getMetres(i);
            tempsAnterior = parcial.getTemps(i).toSegons();
        }
        
        acceleracio.createChart("Aceleración", "", "Metros", "Aceleracion (m/s^2)");
    }
    
    private void initGraficaTarta(Parcials parcials){
        Double pEixida = 0.0, pArrivada = 0.0, pViratges = 0.0, pNado = 0.0, tempsTotal = 0.0;
        
        tempsTotal = parcials.getTemps(parcials.getNumPostes()-1).toSegons();
        pEixida = parcials.getTemps(0).toSegons();
        pArrivada = tempsTotal - parcials.getTemps(parcials.getNumPostes()-2).toSegons();
        
        for (int i = 3; i < parcials.getNumPostes()-2; i+=3) { // el -2 es per a no contar l'aplagada
            pViratges += parcials.getTemps(i).toSegons() - parcials.getTemps(i-2).toSegons();
        }
        
        for (int i = 1; i < parcials.getNumPostes()-2; i+=3) { // el -2 es per a no contar l'aplagada
            pNado += parcials.getTemps(i).toSegons() - parcials.getTemps(i-1).toSegons();
        }
        
        tarta.setData("Salida", (pEixida/tempsTotal)*100);
        tarta.setData("Virajes", (pViratges/tempsTotal)*100);
        tarta.setData("Nado", (pNado/tempsTotal)*100);
        tarta.setData("Llegada", (pArrivada/tempsTotal)*100);
        tarta.createChart("Resumen");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Grafiques.GraficaLineal acceleracio;
    private javax.swing.JButton buttonAceptarCalendari;
    private javax.swing.JButton buttonCalendari;
    private Utilitats.Calendari calendari;
    private Utilitats.CognomPredictiuCombo cognomPredictiu;
    private javax.swing.JComboBox comboEstil;
    private javax.swing.JComboBox comboMetres;
    private javax.swing.JDialog dialogCalendari;
    private javax.swing.JTextField fieldData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JToolBar.Separator jSeparator1;
    private Utilitats.NomPredictiuCombo nomPredictiu;
    private javax.swing.JSplitPane spaneContenedor;
    private javax.swing.JSplitPane spaneDreta;
    private javax.swing.JSplitPane spaneEsquerra;
    private Grafiques.GraficaQuesito tarta;
    private Grafiques.GraficaLineal tempsParcials;
    private javax.swing.JToolBar toolBar;
    private Grafiques.GraficaLineal velocitat;
    // End of variables declaration//GEN-END:variables

}
