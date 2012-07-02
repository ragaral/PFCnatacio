package pfc.natacio.vista;

import Grafiques.GraficaLineal;
import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import pfc.natacio.dades.Club;
import pfc.natacio.dades.Nadador;
import pfc.natacio.dades.Parcials;
import pfc.natacio.dades.Prova;
import pfc.natacio.logica.Data;
import pfc.natacio.logica.Temps;

/**
 *
 * @author Raul
 */
public class AddTempsCrono extends javax.swing.JPanel {
    private Principal principal;
    private Club club;
    private GraficaLineal gl;
    private float contradorMetres;
    private double aux = 7.5;
    private ArrayList<Double> metres;
    private ArrayList<Temps> temps;

    /**
     * Creates new form AddTempsCrono
     */
    public AddTempsCrono(Club club, Principal principal) {
        this.principal = principal;
        this.club = club;
        metres = new ArrayList<>();
        temps = new ArrayList<>();
        Data d = new Data();
        this.contradorMetres = 0;
        initComponents();
        fieldData.setText(d.toString());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        comboMPiscina = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        fieldMetres = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        comboEstil = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        fieldBrasades = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        fieldData = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        fieldLloc = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        fitxFed = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        nom = new Utilitats.NomPredictiuField(club);
        cognom = new Utilitats.CognomPredictiuField(club, nom);
        jPanel3 = new javax.swing.JPanel();
        panellBotons = new javax.swing.JPanel();
        empezar = new javax.swing.JButton();
        parar = new javax.swing.JButton();
        eixidaTemps = new javax.swing.JPanel();
        cronometro = new pfc.natacio.vista.Cronometro();
        reset = new javax.swing.JButton();
        guardar = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setText("Piscina:");

        comboMPiscina.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "25", "50" }));

        jLabel2.setText("Metros:");

        jLabel3.setText("Estilo:");

        comboEstil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Espalda", "Braza", "Mariposa", "Libres", "Estilos" }));

        jLabel5.setText("Brazadas:");
        jLabel5.setToolTipText("Brazadas realizada en un largo");

        fieldBrasades.setToolTipText("Brazadas realizada en un largo");

        jLabel8.setText("Fecha:");

        fieldData.setToolTipText("dd/mm/yyyy");

        jLabel9.setText("Lugar:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                                .addGap(26, 26, 26)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fieldData, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                            .addComponent(fieldLloc, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(15, 15, 15)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboEstil, javax.swing.GroupLayout.Alignment.TRAILING, 0, 66, Short.MAX_VALUE)
                            .addComponent(fieldBrasades, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                            .addComponent(comboMPiscina, javax.swing.GroupLayout.Alignment.TRAILING, 0, 66, Short.MAX_VALUE)
                            .addComponent(fieldMetres, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(comboMPiscina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fieldMetres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comboEstil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(fieldBrasades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(fieldData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(fieldLloc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setText("Nombre: ");

        fitxFed.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fitxFedFocusLost(evt);
            }
        });
        fitxFed.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fitxFedKeyReleased(evt);
            }
        });

        jLabel7.setText("Ficha federativa:");

        nom.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nomFocusGained(evt);
            }
        });

        cognom.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cognomFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cognom, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fitxFed)
                .addGap(16, 16, 16))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(fitxFed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cognom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        panellBotons.setLayout(new java.awt.GridBagLayout());

        empezar.setText("Empezar");
        empezar.setEnabled(false);
        empezar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empezarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 139, 0, 0);
        panellBotons.add(empezar, gridBagConstraints);

        parar.setText("Parar");
        parar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pararActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 28;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 142);
        panellBotons.add(parar, gridBagConstraints);

        eixidaTemps.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eixidaTemps, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panellBotons, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(cronometro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(cronometro, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panellBotons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(eixidaTemps, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                .addContainerGap())
        );

        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        guardar.setText("Guardar");
        guardar.setEnabled(false);
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(guardar, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                            .addComponent(reset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {guardar, reset});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                        .addComponent(reset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guardar)))
                .addGap(28, 28, 28))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {guardar, reset});

    }// </editor-fold>//GEN-END:initComponents

    private void fitxFedKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fitxFedKeyReleased
        String f = fitxFed.getText();
        if (f.length() >= 8) {
            Nadador nadador = club.buscaNadador(f);
            if (nadador != null) {
                nom.setText(nadador.getNom());
                cognom.setText(nadador.getCognom());
                principal.setTextLabelExit("");
            } else {
                fitxFed.requestFocus();
                fitxFed.selectAll();
                principal.setTextLabelExit("El nadador no existe!");
            }
        }
    }//GEN-LAST:event_fitxFedKeyReleased

    private void empezarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empezarActionPerformed
        int mtrs = Integer.parseInt(fieldMetres.getText());
        int metresPiscina = Integer.parseInt(comboMPiscina.getSelectedItem().toString());
        int numParcials = ((mtrs / metresPiscina) * 3);
//        System.out.println("num Parcials: "+numParcials);

        if (contradorMetres == 0) {
            cronometro.comensa();
            empezar.setText("Parcial");
            gl.setData(0, "TiempoActual", "0");
        } else {
            Temps t = new Temps(cronometro.toString());
            
            if (contradorMetres == 1) {
                gl.setData(t.toSegons(), "TiempoActual", "12.0");
                metres.add(12.0);
            }else {
                if ((contradorMetres) % 3 == 0) {
                    aux = ((contradorMetres) / 3) * metresPiscina;
                } else if (aux % metresPiscina == 0) {
                    aux += 7.5;
                } else {
                    aux += 10;
                    if(metresPiscina == 50)
                        aux += 25;
                }
                gl.setData(t.toSegons(), "TiempoActual", "" + aux);
                metres.add(aux);
            }
            this.temps.add(t);
//            System.out.println(contradorMetres+" >> "+aux+" - "+t);
        }
        if (contradorMetres == numParcials - 1){
            empezar.setEnabled(false);
            parar.requestFocus();
        }
        contradorMetres++;
        eixidaTemps.removeAll();
        gl.createChart("", "", "Metros", "Tiempo");
        gl.setVisible(true);
        eixidaTemps.add(gl, BorderLayout.CENTER);
    }//GEN-LAST:event_empezarActionPerformed

    private void pararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pararActionPerformed
        cronometro.para();
        Temps t = new Temps(cronometro.toString());
        this.temps.add(t);
        metres.add( Double.valueOf(fieldMetres.getText()) );
        eixidaTemps.removeAll();
        gl.setData(t.toSegons(), "TiempoActual", fieldMetres.getText()+".0");
        gl.createChart("", "", "Metros", "Tiempo");
        gl.setVisible(true);
        eixidaTemps.add(gl, BorderLayout.CENTER);
        repaint();
        guardar.setEnabled(true);
        
        contradorMetres = 0;
        aux = 7.5;
    }//GEN-LAST:event_pararActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        nom.setText("");
        cognom.setText("");
        fitxFed.setText("");
        cronometro = new Cronometro();
        eixidaTemps.removeAll();
        eixidaTemps.repaint();
    }//GEN-LAST:event_resetActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        if(fieldBrasades.getText().equals("") && fieldLloc.getText().equals(""))
            JOptionPane.showMessageDialog(null, "Rellene todos los campos", "Revise campos", JOptionPane.INFORMATION_MESSAGE);
        else{
            this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            try {
                int brasades = 0;
                if(!fieldBrasades.getText().isEmpty()){
                    brasades = Integer.parseInt(fieldBrasades.getText());
                }
                Nadador nadaux = club.buscaNadador(fitxFed.getText());
                Prova prvAux = new Prova(Integer.parseInt(fieldMetres.getText()), comboEstil.getSelectedItem().toString(), temps.get(temps.size()-1).toString(), fieldData.getText(), fieldLloc.getText(), Integer.parseInt(comboMPiscina.getSelectedItem().toString()), brasades);
                prvAux.setDataBase(nadaux);

                while(prvAux.getID() == 0){ Thread.sleep(10); }
                Parcials parcialAux = new Parcials(prvAux.getID(), metres, temps);
                parcialAux.setDataBase();
                prvAux.setParcial(parcialAux);

                nadaux.setProva(prvAux);

                principal.setTextLabelExit("Guardado satisfactoriamente!");
                principal.setValueProgresBar(100);
                this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            } catch (Exception ex) {
                Logger.getLogger(AddTempsCrono.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Error! Tiempo no guardado!\n"+ex.getLocalizedMessage());
            }
            this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        }
    }//GEN-LAST:event_guardarActionPerformed

    private void fitxFedFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fitxFedFocusLost
        if (eixidaTemps.getComponentCount() == 0) {
            creaGrafica();
        }
    }//GEN-LAST:event_fitxFedFocusLost

    private void nomFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nomFocusGained
        if(fieldMetres.getText().isEmpty()){
            Toolkit.getDefaultToolkit().beep();
            fieldMetres.requestFocus();
        }
    }//GEN-LAST:event_nomFocusGained

    private void cognomFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cognomFocusLost
        String n = nom.getText();
        String c = cognom.getText();
        Nadador nadador = club.buscaNadador(n, c);
//        System.out.println(nadador);
        if (nadador != null) {
            fitxFed.setText(nadador.getNumFitxFed());
            principal.setTextLabelExit("");
        } else {
            principal.setTextLabelExit("El nadador no existe!");
            nom.requestFocus();
//            nom.selectAll();
        }
        creaGrafica();
    }//GEN-LAST:event_cognomFocusLost

    private void creaGrafica() {
        gl = new GraficaLineal();
        Nadador nadAux = club.buscaNadador(fitxFed.getText());
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        nadAux.initProves();
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));

        int mtrs = Integer.parseInt(fieldMetres.getText());
        int metresPiscina = Integer.parseInt(comboMPiscina.getSelectedItem().toString());
        int numParcials = (mtrs / metresPiscina) * 3;
//         System.out.println("numero de parcials: "+numParcials);

        //** Pintem la grafica del millor temps **
        Prova millorProva = nadAux.getMillorProva(mtrs, comboEstil.getSelectedItem().toString(), metresPiscina);
        if (millorProva != null) {
            if (millorProva.conteParcials()) {
                gl.setData(0, "MejorPrueba", "0");
                for (int i = 0; i < millorProva.getParcials().getNumPostes(); i++) {
                    gl.setData(millorProva.getParcials().getTemps(i).toSegons(), "MejorPrueba", String.valueOf(millorProva.getParcials().getMetres(i)));
//                    this.metres.add(millorProva.getParcials().getMetres(i));
                }
            } else {
                //nia q fer aço perq si afegixes 2 valors solts (0 i el final) no es pinten
                double increment = (millorProva.getTemps().toSegons() / numParcials);
                gl.setData(0, "MejorPrueba", "0");
                gl.setData(increment, "MejorPrueba", "12.0");
//                this.metres.add(12.0);
                for (int i = 1; i < numParcials; i++) {
                    if ((i + 1) % 3 == 0) {
                        aux = ((i + 1) / 3) * metresPiscina;
                    } else if (aux % metresPiscina == 0) {
                        aux += 7.5;
                    } else {
                        aux += 10;
                        if(metresPiscina == 50)
                            aux += 25;
                    }
                    gl.setData((i + 1) * increment, "MejorPrueba", "" + aux);
//                    this.metres.add(aux);
                }
            }
//            System.out.println("Grafica creada");
        }

        aux = 7.5;
        gl.createChart("", "", "Metros", "Tiempo");
        gl.setVisible(true);
        eixidaTemps.removeAll();
        eixidaTemps.add(gl, BorderLayout.CENTER);

        empezar.setEnabled(true);

        this.getParent().repaint();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Utilitats.CognomPredictiuField cognom;
    protected javax.swing.JComboBox comboEstil;
    protected javax.swing.JComboBox comboMPiscina;
    private pfc.natacio.vista.Cronometro cronometro;
    protected javax.swing.JPanel eixidaTemps;
    protected javax.swing.JButton empezar;
    protected javax.swing.JTextField fieldBrasades;
    protected javax.swing.JTextField fieldData;
    protected javax.swing.JTextField fieldLloc;
    protected javax.swing.JTextField fieldMetres;
    protected javax.swing.JTextField fitxFed;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    protected javax.swing.JPanel jPanel3;
    private Utilitats.NomPredictiuField nom;
    private javax.swing.JPanel panellBotons;
    protected javax.swing.JButton parar;
    private javax.swing.JButton reset;
    // End of variables declaration//GEN-END:variables
}
