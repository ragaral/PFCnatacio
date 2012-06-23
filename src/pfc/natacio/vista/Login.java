/*
 * Login.java
 *
 * Created on 01-dic-2011, 15:26:25
 */
package pfc.natacio.vista;

import java.awt.Cursor;
import javax.swing.JOptionPane;
import pfc.natacio.exepcions.noHayInternet;
import pfc.natacio.logica.Club;
import pfc.natacio.logica.ComprovarLogin;

/**
 *
 * @author Raul
 */
public class Login extends javax.swing.JFrame {

    /** Creates new form Login */
    public Login() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new Utilitats.PanelFondo();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        barraProgres = new javax.swing.JProgressBar();
        passwd = new javax.swing.JPasswordField();
        nomClub = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login - EstNat");
        setResizable(false);

        fondo.setImagen("");

        jLabel1.setText("Club:");

        jLabel2.setText("pass:");

        jLabel3.setFont(new java.awt.Font("DejaVu Sans", 0, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("EstNat");

        passwd.setText("planas");
        passwd.setToolTipText("pulse INTRO para finalizar");
        passwd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwdFocusGained(evt);
            }
        });
        passwd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passwdKeyTyped(evt);
            }
        });

        nomClub.setText("Gandia");
        nomClub.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nomClubFocusGained(evt);
            }
        });

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                        .addGap(0, 100, Short.MAX_VALUE)
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(barraProgres, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, fondoLayout.createSequentialGroup()
                                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(passwd)
                                    .addComponent(nomClub, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(104, 104, 104))))
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nomClub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(31, 31, 31)
                .addComponent(barraProgres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-435)/2, (screenSize.height-236)/2, 435, 236);
    }// </editor-fold>//GEN-END:initComponents

    private void nomClubFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nomClubFocusGained
        nomClub.selectAll();
    }//GEN-LAST:event_nomClubFocusGained

    private void passwdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwdFocusGained
        passwd.selectAll();
    }//GEN-LAST:event_passwdFocusGained

    private void passwdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwdKeyTyped
        if(evt.getKeyChar()=='\n'){
            barraProgres.setValue(0);
            barraProgres.setStringPainted(true);
            barraProgres.setString("Cargando...");
            this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            
            String nomC = nomClub.getText();
            String pass = String.valueOf(passwd.getPassword());
            ComprovarLogin cl = new ComprovarLogin(nomC, pass, this);
            cl.start();
        }
    }//GEN-LAST:event_passwdKeyTyped

    public void setClub(Club club) {
        this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        Principal principal = new Principal(club);
        principal.setVisible(true);
        this.dispose();
    }

    public void setException(noHayInternet ex) {
        this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        barraProgres.setValue(0);
        barraProgres.setString("Error al Conectar!");
        JOptionPane.showMessageDialog(null, ex);
    }
    
    public void setValueProgresBar(int valor){
        this.barraProgres.setValue(valor);
    }
    
    public static void main(String args[]){
        /* Set look and feel */
        try {
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        Login login = new Login();
        login.setVisible(true);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barraProgres;
    private Utilitats.PanelFondo fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField nomClub;
    private javax.swing.JPasswordField passwd;
    // End of variables declaration//GEN-END:variables

}
