/*
 * AddNadador.java
 *
 * Created on 14-jul-2010, 22:26:07
 */

package pfc.natacio.vista;

import pfc.natacio.dades.Club;
import java.awt.Color;
import java.awt.Cursor;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author raul
 */
public class AddNadador extends javax.swing.JFrame {

    private Club club;

    public AddNadador(Club club) {
        initComponents();
        this.setVisible(true);
        this.club=club;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        numFitx = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nom = new javax.swing.JTextField();
        Cognom = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        dia = new javax.swing.JTextField();
        mes = new javax.swing.JTextField();
        any = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        foto = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        boto = new javax.swing.JButton();
        carrer = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        poblacio = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        provincia = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        telf = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        correu = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        cp = new javax.swing.JTextField();
        eixidaErr = new javax.swing.JLabel();
        progressBar = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Intruducir Nadador");
        setResizable(false);

        numFitx.setColumns(20);
        numFitx.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel1.setText("Ficha fed.:");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Apellidos:");

        nom.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        Cognom.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel5.setText("Fecha nac.:");

        jLabel7.setText("/");

        jLabel6.setText("/");

        foto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        foto.setText("Foto");
        foto.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        foto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        foto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addFoto(evt);
            }
        });

        jLabel2.setText("Calle: ");

        boto.setText("Introducir");
        boto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoIntroduir(evt);
            }
        });

        jLabel8.setText("Poblacion: ");

        jLabel9.setText("Provincia: ");

        jLabel10.setText("Telefono: ");

        telf.setColumns(9);

        jLabel12.setText("Correo e: ");

        jLabel13.setText("CP: ");

        cp.setColumns(5);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(correu, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(any, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(carrer, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                    .addComponent(Cognom, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                    .addComponent(poblacio, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(telf, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(provincia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addGap(33, 33, 33)
                        .addComponent(cp, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
                    .addComponent(boto, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(nom, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numFitx, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                        .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(numFitx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Cognom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(any, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(carrer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(poblacio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(provincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(cp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(telf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(correu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(boto)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        eixidaErr.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(eixidaErr, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eixidaErr, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-472)/2, (screenSize.height-466)/2, 472, 466);
    }// </editor-fold>//GEN-END:initComponents

    private void botoIntroduir(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoIntroduir
        progressBar.setValue(0);

        Runnable miRunnable = new Runnable()
        {
            @Override
            public void run()
            {
             boolean inserit=false, campsOK=false;
             
             progressBar.setValue(10);
             jPanel1.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
             campsOK=comprovaCamps();
             progressBar.setValue(30);
             
             if(campsOK){
                 try{
                    inserit=club.inserirNadador(numFitx.getText(), nom.getText(), Cognom.getText(), any.getText()+"-"+mes.getText()+"-"+dia.getText(),
                                            club.getNom(), carrer.getText(), poblacio.getText(), provincia.getText(), "España",
                                            cp.getText(), telf.getText(), correu.getText());

                    progressBar.setValue(80);
                    if(inserit){
                        eixidaErr.setText("Nadador introducido correctamente!");
                        progressBar.setValue(100);

                        resetejaCamps();

                        jPanel1.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
                        try {
                            Thread.sleep(5000);
                            eixidaErr.setText("");
                            progressBar.setValue(0);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(AddNadador.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{
                        progressBar.setValue(0);
                        //con.tancaConexio();
                        eixidaErr.setText("ERROR! Nadador NO introducido!");
                    }
                 }catch(Exception ex){
                     JOptionPane.showMessageDialog(null, ex);
                 }
            }
                jPanel1.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
                progressBar.setValue(0);
            }
        };
        
        Thread hilo = new Thread (miRunnable);
            if(!hilo.isAlive()){
                hilo.start();
            }
    }//GEN-LAST:event_botoIntroduir

    private void addFoto(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addFoto
        JFileChooser jFileChooser = new JFileChooser();
        jFileChooser.showOpenDialog(new JPanel());
        jFileChooser.setSize(300, 200);
        jFileChooser.setVisible(true);
        

        System.out.println("ADD FOTO!");
    }//GEN-LAST:event_addFoto

    private boolean comprovaCamps(){
        boolean pasa=true;
        
        //NUMERO DE FITXA FEDERATIVA
        if(numFitx.getText().isEmpty() || numFitx.getText().length()>10){
            numFitx.setBorder(javax.swing.BorderFactory.createLineBorder(Color.red, 2));
            pasa=false;
        }
        else{
            numFitx.setBorder(javax.swing.BorderFactory.createEtchedBorder());
            pasa=true;
        }
        
        //NOM
        if(nom.getText().isEmpty() || nom.getText().length()>15){
            nom.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, Color.red));
            pasa=false;
        }
        else{
            nom.setBorder(javax.swing.BorderFactory.createEtchedBorder());
            pasa=true;
        }

        //COGNOM
        if(Cognom.getText().isEmpty()){
            Cognom.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, Color.red));
            pasa=false;
        }
        else{
            Cognom.setBorder(javax.swing.BorderFactory.createEtchedBorder());
            pasa=true;
        }

        //DIA
        if(dia.getText().isEmpty() || Integer.parseInt(dia.getText())<0 || Integer.parseInt(dia.getText())>31){
            dia.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, Color.red));
            pasa=false;
        }
        else{
            dia.setBorder(javax.swing.BorderFactory.createEtchedBorder());
            pasa=true;
        }

        //MES
        if(mes.getText().isEmpty() || Integer.parseInt(mes.getText())<0 || Integer.parseInt(mes.getText())>12){
            mes.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, Color.red));
            pasa=false;
        }
        else{
            mes.setBorder(javax.swing.BorderFactory.createEtchedBorder());
            pasa=true;
        }

        //ANY
        if(any.getText().isEmpty()){
            any.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, Color.red));
            pasa=false;
        }
        else{
            any.setBorder(javax.swing.BorderFactory.createEtchedBorder());
            pasa=true;
        }

        //CARRER
        /*
        if(carrer.getText().isEmpty()){
            carrer.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, Color.red));
            pasa=false;
        }
        else{
            carrer.setBorder(javax.swing.BorderFactory.createEtchedBorder());
            pasa=true;
        }
        */

        //POBLACIO
/*        if(poblacio.getText().isEmpty()){
            poblacio.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, Color.red));
            pasa=false;
        }
        else{
            poblacio.setBorder(javax.swing.BorderFactory.createEtchedBorder());
            pasa=true;
        }
 */

        //PROVINCIA
/*        if(provincia.getText().isEmpty()){
            provincia.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, Color.red));
            pasa=false;
        }
        else{
            provincia.setBorder(javax.swing.BorderFactory.createEtchedBorder());
            pasa=true;
        }
 */

        //CODIG POSTAL
/*        if(cp.getText().isEmpty() || cp.getText().length()>5){
            cp.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, Color.red));
            pasa=false;
        }
        else{
            cp.setBorder(javax.swing.BorderFactory.createEtchedBorder());
            pasa=true;
        }
 */

        //TELEFON
/*        if(telf.getText().isEmpty()){
            telf.setText("000000000");
        }

        if(telf.getText().length()>9){
            telf.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, Color.red));
            pasa=false;
        }
 */

        //CORREU ELECTRONIC
/*        if(correu.getText().isEmpty() || !correu.getText().contains("@")){
            correu.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, Color.red));
            pasa=false;
        }
        else{
            correu.setBorder(javax.swing.BorderFactory.createEtchedBorder());
            pasa=true;
        }
 */

        return pasa;
    }

    private void resetejaCamps(){
        numFitx.setText("");
        nom.setText("");
        Cognom.setText("");
        dia.setText("");
        mes.setText("");
        any.setText("");
        carrer.setText("");
        poblacio.setText("");
        provincia.setText("");
        cp.setText("");
        telf.setText("");
        correu.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Cognom;
    private javax.swing.JTextField any;
    private javax.swing.JButton boto;
    private javax.swing.JTextField carrer;
    private javax.swing.JTextField correu;
    private javax.swing.JTextField cp;
    private javax.swing.JTextField dia;
    private javax.swing.JLabel eixidaErr;
    private javax.swing.JLabel foto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField mes;
    private javax.swing.JTextField nom;
    private javax.swing.JTextField numFitx;
    private javax.swing.JTextField poblacio;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JTextField provincia;
    private javax.swing.JTextField telf;
    // End of variables declaration//GEN-END:variables

}
