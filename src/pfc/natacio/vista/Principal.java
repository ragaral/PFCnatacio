/*
 * Principal.java
 *
 * Created on 01-dic-2011, 15:26:43
 */
package pfc.natacio.vista;

import java.awt.Component;
import javax.swing.ImageIcon;
import pfc.natacio.logica.Club;
import pfc.natacio.logica.Data;
import pfc.natacio.logica.Nadador;

/**
 *
 * @author Raul
 */
public class Principal extends javax.swing.JFrame {
    private Club club;
    
    public Principal() {
        this(null);
    }

    public Principal(Club c) {
        club = c;
        initComponents();
        initPropClub();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        barraHerramientas = new javax.swing.JToolBar();
        barraBotons = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        barraBuscar = new javax.swing.JToolBar();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        peu = new javax.swing.JPanel();
        labelBaix = new javax.swing.JLabel();
        barraProgres = new javax.swing.JProgressBar();
        marc = new javax.swing.JSplitPane();
        dreta = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        detaDalt = new javax.swing.JPanel();
        nomClub = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        numMinimesNacionals = new javax.swing.JLabel();
        numNadadors = new javax.swing.JLabel();
        numMinimesAutonomiques = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        escut = new javax.swing.JLabel();
        dretaBaix = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        calendariNotes = new CalendariNotes.Vista();
        centre = new Utilitats.JTabbedPanePersonalized();
        barraMenu = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        archivoGuardar = new javax.swing.JMenuItem();
        archivoImprimir = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        archivoSalir = new javax.swing.JMenuItem();
        menuEditar = new javax.swing.JMenu();
        editarNadador = new javax.swing.JMenu();
        añadirNadador = new javax.swing.JMenuItem();
        modificarNadador = new javax.swing.JMenuItem();
        borrarNadador = new javax.swing.JMenuItem();
        editarTiempo = new javax.swing.JMenu();
        añadirTiempo = new javax.swing.JMenuItem();
        modificarTiempo = new javax.swing.JMenuItem();
        borrarTiempo = new javax.swing.JMenuItem();
        editarParcial = new javax.swing.JMenu();
        añadirParcial = new javax.swing.JMenuItem();
        modificarParcial = new javax.swing.JMenuItem();
        borrarParcial = new javax.swing.JMenuItem();
        menuVer = new javax.swing.JMenu();
        verListaNadadores = new javax.swing.JMenuItem();
        verBuscarTiempos = new javax.swing.JMenuItem();
        verRanking = new javax.swing.JMenuItem();
        verEstadistica = new javax.swing.JMenu();
        verEstadisticaHistorica = new javax.swing.JMenuItem();
        verEstadisticaParciales = new javax.swing.JMenuItem();
        menuCronometro = new javax.swing.JMenu();
        cronoAñadirTiempo = new javax.swing.JMenuItem();
        cronoAñadirMultiplesTiempos = new javax.swing.JMenuItem();
        cronoAñadirParciales = new javax.swing.JMenuItem();
        menuAyuda = new javax.swing.JMenu();
        ayudaActualizar = new javax.swing.JMenuItem();
        ayudaVersion = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        ayudaAcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EstNat");
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(800, 500));

        barraHerramientas.setFloatable(false);
        barraHerramientas.setRollover(true);

        barraBotons.setRollover(true);

        jButton1.setText("ListaNadadores");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verListaNadadoresActionPerformed(evt);
            }
        });
        barraBotons.add(jButton1);

        jButton2.setText("Ranking");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        barraBotons.add(jButton2);

        barraHerramientas.add(barraBotons);

        barraBuscar.setRollover(true);
        barraBuscar.setMaximumSize(new java.awt.Dimension(200, 25));
        barraBuscar.setMinimumSize(new java.awt.Dimension(55, 25));

        jLabel2.setText("Buscar:");
        barraBuscar.add(jLabel2);
        barraBuscar.add(jTextField1);

        barraHerramientas.add(barraBuscar);

        peu.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout peuLayout = new javax.swing.GroupLayout(peu);
        peu.setLayout(peuLayout);
        peuLayout.setHorizontalGroup(
            peuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, peuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelBaix, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 250, Short.MAX_VALUE)
                .addComponent(barraProgres, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        peuLayout.setVerticalGroup(
            peuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(barraProgres, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
            .addComponent(labelBaix, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
        );

        marc.setDividerLocation(210);
        marc.setResizeWeight(0.4);

        dreta.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jSplitPane1.setDividerLocation(280);
        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        jSplitPane1.setResizeWeight(0.7);

        jScrollPane1.setMinimumSize(new java.awt.Dimension(200, 200));

        detaDalt.setPreferredSize(new java.awt.Dimension(200, 270));

        nomClub.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nomClub.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nomClub.setText("Nom Club");

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Nadadores: ");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 52;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        jPanel1.add(jLabel1, gridBagConstraints);

        numMinimesNacionals.setText("0");
        numMinimesNacionals.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 29;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 11, 15);
        jPanel1.add(numMinimesNacionals, gridBagConstraints);

        numNadadors.setText("0");
        numNadadors.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 29;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 15);
        jPanel1.add(numNadadors, gridBagConstraints);

        numMinimesAutonomiques.setText("0");
        numMinimesAutonomiques.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 29;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 0, 15);
        jPanel1.add(numMinimesAutonomiques, gridBagConstraints);

        jLabel4.setText("Minimas Autonomicas: ");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 0, 0);
        jPanel1.add(jLabel4, gridBagConstraints);

        jLabel6.setText("Minimas Nacionales: ");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 11, 0);
        jPanel1.add(jLabel6, gridBagConstraints);

        escut.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        escut.setText("Escut");

        javax.swing.GroupLayout detaDaltLayout = new javax.swing.GroupLayout(detaDalt);
        detaDalt.setLayout(detaDaltLayout);
        detaDaltLayout.setHorizontalGroup(
            detaDaltLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detaDaltLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(detaDaltLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomClub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(escut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        detaDaltLayout.setVerticalGroup(
            detaDaltLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detaDaltLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nomClub, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(7, 7, 7)
                .addComponent(escut, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane1.setViewportView(detaDalt);

        jSplitPane1.setLeftComponent(jScrollPane1);

        jScrollPane2.setMinimumSize(new java.awt.Dimension(100, 100));
        jScrollPane2.setViewportView(calendariNotes);

        javax.swing.GroupLayout dretaBaixLayout = new javax.swing.GroupLayout(dretaBaix);
        dretaBaix.setLayout(dretaBaixLayout);
        dretaBaixLayout.setHorizontalGroup(
            dretaBaixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
        );
        dretaBaixLayout.setVerticalGroup(
            dretaBaixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
        );

        jSplitPane1.setBottomComponent(dretaBaix);

        javax.swing.GroupLayout dretaLayout = new javax.swing.GroupLayout(dreta);
        dreta.setLayout(dretaLayout);
        dretaLayout.setHorizontalGroup(
            dretaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        dretaLayout.setVerticalGroup(
            dretaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
        );

        marc.setLeftComponent(dreta);
        marc.setRightComponent(centre);

        menuArchivo.setText("Archivo");

        archivoGuardar.setText("Guardar");
        archivoGuardar.setEnabled(false);
        menuArchivo.add(archivoGuardar);

        archivoImprimir.setText("Imprimir");
        archivoImprimir.setEnabled(false);
        menuArchivo.add(archivoImprimir);
        menuArchivo.add(jSeparator2);

        archivoSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        archivoSalir.setText("Salir");
        archivoSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                archivoSalirActionPerformed(evt);
            }
        });
        menuArchivo.add(archivoSalir);

        barraMenu.add(menuArchivo);

        menuEditar.setText("Editar");

        editarNadador.setText("Nadador");

        añadirNadador.setText("Añadir nadador");
        añadirNadador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirNadadorActionPerformed(evt);
            }
        });
        editarNadador.add(añadirNadador);

        modificarNadador.setText("Modificar nadador");
        editarNadador.add(modificarNadador);

        borrarNadador.setText("Borrar nadador");
        editarNadador.add(borrarNadador);

        menuEditar.add(editarNadador);

        editarTiempo.setText("Tiempo");

        añadirTiempo.setText("Añadir tiempo");
        editarTiempo.add(añadirTiempo);

        modificarTiempo.setText("Modificar tiempo");
        editarTiempo.add(modificarTiempo);

        borrarTiempo.setText("Borrar tiempo");
        editarTiempo.add(borrarTiempo);

        menuEditar.add(editarTiempo);

        editarParcial.setText("Parcial");

        añadirParcial.setText("Añadir parcial");
        editarParcial.add(añadirParcial);

        modificarParcial.setText("Modificar parcial");
        editarParcial.add(modificarParcial);

        borrarParcial.setText("Borrar parcial");
        editarParcial.add(borrarParcial);

        menuEditar.add(editarParcial);

        barraMenu.add(menuEditar);

        menuVer.setText("Ver");

        verListaNadadores.setText("Lista nadadores");
        verListaNadadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verListaNadadoresActionPerformed(evt);
            }
        });
        menuVer.add(verListaNadadores);

        verBuscarTiempos.setText("Buscar tiempo");
        menuVer.add(verBuscarTiempos);

        verRanking.setText("Ranking");
        menuVer.add(verRanking);

        verEstadistica.setText("Estadistica");

        verEstadisticaHistorica.setText("Historica");
        verEstadistica.add(verEstadisticaHistorica);

        verEstadisticaParciales.setText("Parciales");
        verEstadisticaParciales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verEstadisticaParcialesActionPerformed(evt);
            }
        });
        verEstadistica.add(verEstadisticaParciales);

        menuVer.add(verEstadistica);

        barraMenu.add(menuVer);

        menuCronometro.setText("Cronometro");

        cronoAñadirTiempo.setText("Añadir tiempo");
        cronoAñadirTiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cronoAñadirTiempoActionPerformed(evt);
            }
        });
        menuCronometro.add(cronoAñadirTiempo);

        cronoAñadirMultiplesTiempos.setText("Añadir multiples tiempos");
        menuCronometro.add(cronoAñadirMultiplesTiempos);

        cronoAñadirParciales.setText("Añadir tiempo con parciales");
        menuCronometro.add(cronoAñadirParciales);

        barraMenu.add(menuCronometro);

        menuAyuda.setText("Ayuda");

        ayudaActualizar.setText("Actualizar");
        menuAyuda.add(ayudaActualizar);

        ayudaVersion.setText("Versión");
        menuAyuda.add(ayudaVersion);
        menuAyuda.add(jSeparator1);

        ayudaAcercaDe.setText("Acerca de");
        menuAyuda.add(ayudaAcercaDe);

        barraMenu.add(menuAyuda);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(barraHerramientas, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
            .addComponent(peu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(marc, javax.swing.GroupLayout.DEFAULT_SIZE, 990, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(barraHerramientas, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(marc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(peu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-1016)/2, (screenSize.height-572)/2, 1016, 572);
    }// </editor-fold>//GEN-END:initComponents

    private void initPropClub(){
        nomClub.setText(club.getNom());
        escut.setText("");
        escut.setIcon(new ImageIcon("src/imatges/"+club.getNom()+".gif"));
    }
    
    private void verListaNadadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verListaNadadoresActionPerformed
        LlistatNadadors llistatNadadors = new LlistatNadadors(club, this);
        centre.addTab("Listado nadadores",llistatNadadors);
    }//GEN-LAST:event_verListaNadadoresActionPerformed

    private void archivoSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_archivoSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_archivoSalirActionPerformed

    private void añadirNadadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirNadadorActionPerformed
        AddNadador addNadador = new AddNadador(club);
    }//GEN-LAST:event_añadirNadadorActionPerformed

    private void cronoAñadirTiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cronoAñadirTiempoActionPerformed
        AddTempsCrono addTempsCrono = new AddTempsCrono(club, this);
        centre.addTab("Cronómetro", addTempsCrono);
    }//GEN-LAST:event_cronoAñadirTiempoActionPerformed

    private void verEstadisticaParcialesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verEstadisticaParcialesActionPerformed
        EstadistiquesParcials estadistiquesParcials = new EstadistiquesParcials(club);
        centre.addTab("Estadisticas", estadistiquesParcials);
    }//GEN-LAST:event_verEstadisticaParcialesActionPerformed

    public void addPestanya(String titol, Component comp){
        centre.addTab(titol, comp);
//        centre.setTabPlacement(centre.getTabCount());
        centre.setSelectedIndex(centre.getTabCount()-1);
        comp.requestFocus();
    }
    
    void addPestanyaEstadistiquesParcials(Nadador nadador, int metres, String estil, Data data) {
        EstadistiquesParcials estadistiquesParcials = new EstadistiquesParcials(club, nadador, metres, estil, data);
        centre.addTab("Estadisticas", estadistiquesParcials);
        centre.setSelectedIndex(centre.getTabCount()-1);
    }
    
    public void setValueProgresBar(int value){
        barraProgres.setValue(value);
    }
    
    public void setTextLabelExit(String text){
        labelBaix.setText(text);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem archivoGuardar;
    private javax.swing.JMenuItem archivoImprimir;
    private javax.swing.JMenuItem archivoSalir;
    private javax.swing.JMenuItem ayudaAcercaDe;
    private javax.swing.JMenuItem ayudaActualizar;
    private javax.swing.JMenuItem ayudaVersion;
    private javax.swing.JMenuItem añadirNadador;
    private javax.swing.JMenuItem añadirParcial;
    private javax.swing.JMenuItem añadirTiempo;
    private javax.swing.JToolBar barraBotons;
    private javax.swing.JToolBar barraBuscar;
    private javax.swing.JToolBar barraHerramientas;
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JProgressBar barraProgres;
    private javax.swing.JMenuItem borrarNadador;
    private javax.swing.JMenuItem borrarParcial;
    private javax.swing.JMenuItem borrarTiempo;
    private CalendariNotes.Vista calendariNotes;
    private Utilitats.JTabbedPanePersonalized centre;
    private javax.swing.JMenuItem cronoAñadirMultiplesTiempos;
    private javax.swing.JMenuItem cronoAñadirParciales;
    private javax.swing.JMenuItem cronoAñadirTiempo;
    private javax.swing.JPanel detaDalt;
    private javax.swing.JPanel dreta;
    private javax.swing.JPanel dretaBaix;
    private javax.swing.JMenu editarNadador;
    private javax.swing.JMenu editarParcial;
    private javax.swing.JMenu editarTiempo;
    private javax.swing.JLabel escut;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel labelBaix;
    private javax.swing.JSplitPane marc;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JMenu menuCronometro;
    private javax.swing.JMenu menuEditar;
    private javax.swing.JMenu menuVer;
    private javax.swing.JMenuItem modificarNadador;
    private javax.swing.JMenuItem modificarParcial;
    private javax.swing.JMenuItem modificarTiempo;
    private javax.swing.JLabel nomClub;
    private javax.swing.JLabel numMinimesAutonomiques;
    private javax.swing.JLabel numMinimesNacionals;
    private javax.swing.JLabel numNadadors;
    private javax.swing.JPanel peu;
    private javax.swing.JMenuItem verBuscarTiempos;
    private javax.swing.JMenu verEstadistica;
    private javax.swing.JMenuItem verEstadisticaHistorica;
    private javax.swing.JMenuItem verEstadisticaParciales;
    private javax.swing.JMenuItem verListaNadadores;
    private javax.swing.JMenuItem verRanking;
    // End of variables declaration//GEN-END:variables
}
