package pfc.natacio.logica;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import pfc.natacio.exepcions.noHayInternet;

/**
 *
 * @author raul
 * @version 1.2
 */
public class Conexio {

    private Connection conn = null;
    private String bd = null;
    private String server;
    private String user;
    private String pass;

    /**
     * Crea un objecte que conCecta amb el server i taule perdefecte
     */
    public Conexio() throws noHayInternet{
        /*this.server = "db4free.net";
        this.bd = "bdraul";
        this.user = "raulalkla";
        this.pass = "42954295";*/
        
        
        this.server = "localhost";
        this.bd = "natacio";
        this.user = "natacio";
        this.pass = "esports gandia";

        /*this.server = "www.freesql.org";
        this.bd = "natacio";
        this.user = "raulalkla";
        this.pass = "42954295";*/
     
        creaConexio();
    }

    /**
     * Crea un objecte que conCecta amb el server
     * @param server    direccio del servidor ex: localhost
     * @param bd        nom de la base de dades
     * @param user      usuari per a accedir a la base de dades
     * @param pwd       contrasenya per a accedir a la base de dades
     * @throws noHayInternet
     */
    public Conexio(String server, String bd, String user, String pwd) throws noHayInternet{
        this.server = server;
        this.bd = bd;
        this.user = user;
        this.pass = pwd;
        creaConexio();
    }

    /**
     * Crea la conexio
     * @throws noHayInternet si no pot conectar 
     */
    private void creaConexio() throws noHayInternet{
         try {
            //Carregem el controlador de la base de dades
            String driver = "com.mysql.jdbc.Driver";
            Class.forName(driver).newInstance();

            //System.out.println("Driver "+driver+" carregat correctament!");

            //Abrir la conexion con la Base de Datos
            //System.out.println("Conectant amb la Base de dades...");
            DriverManager.setLoginTimeout(30);
            String jdbcUrl = "jdbc:mysql://"+server+":3306/"+bd;
            conn = DriverManager.getConnection(jdbcUrl,user,pass);
            //System.out.println("Conexio establerta amb la Base de dades "+bd);

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Conexio.class.getName()).log(Level.SEVERE, null, ex);
        } catch(SQLException se) {
            System.err.println("...Error al crear la conexio... \n"+ se);
            throw new noHayInternet();
            //Logger.getLogger(Conexio.class.getName()).log(Level.SEVERE, null, se);
        }
    }

    /**
     * Tanca la conexio, si no ho esta ja
     */
    public void tancaConexio(){
        try {
            if(!conn.isClosed()) conn.close();
        } catch (SQLException e) {
            System.err.println("Error al tancar la conexio: "+e.toString());
            Logger.getLogger(Conexio.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    /**
     * Fa una select a la base de dades
     * @param cons Consulta SQL
     * @return array bidimensional de Strings amb el resultats de la SQL
     */
    public String[][] Consultar(String cons){
        
        String dades[][] = null;
        try{
            int col=0, fil=0;
            ResultSet rs = null;
            Statement stmt = conn.createStatement();
            stmt.setQueryTimeout(30);
            
            //System.out.println(cons);

            //El objecte ResultSet almacena el resultat de la consulta
            if(stmt!=null){
                rs = stmt.executeQuery(cons);
                ResultSetMetaData metaDatos = rs.getMetaData();

                col = metaDatos.getColumnCount();
                rs.last();
                fil = rs.getRow();
                rs.first();
                //System.out.println("Files: "+fil+" Columnes: "+col);
                dades = new String[fil][col];

                for(int i=0; i < fil ; i++){
                    for(int j=0; j < col ; j++){
                        dades[i][j]=rs.getString(j+1);
                    }
                    rs.next();
                }
                if(!rs.isClosed())   rs.close();
            }
            if(!stmt.isClosed()) stmt.close();
        } catch (SQLException ex) {
            //Logger.getLogger(Conexio.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Error!! -> Conexio.Consulta \n"+ex);
        }

        return dades;
    }
    
    /**
     * Fa una select a la base de dades
     * @param cons Consulta SQL
     * @return ResultSet
     */
    public ResultSet consultarResulSet(String cons){
        ResultSet rs = null;
        Statement stmt;
        
        try{
            stmt = conn.createStatement();
            stmt.setQueryTimeout(30);
            
            //System.out.println(cons);

            //El objecte ResultSet almacena el resultat de la consulta
            if(stmt!=null){
                rs = stmt.executeQuery(cons);
            }
            if(!stmt.isClosed()) stmt.close();
        } catch (SQLException ex) {
            //Logger.getLogger(Conexio.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Error!! -> Conexio.Consulta "+ex);
        }

        return rs;
    }

    /**
     * Insert en <i>Proves</i>
     * @param taula on vols introduir
     * @param nomCols nom de les comlumnes en les que vas a introduir un valor
     * @param valors lalor de les comlumnes
     * @return int 1 == Insertat correctament
     */
    public int Insert(String taula, String nomCols[], String valors[][]){
        int insertat_correctament=-1, numCamps=nomCols.length, cols=valors.length, fils=valors[0].length;

        if(numCamps == cols){
            String ins="INSERT INTO "+taula+" (";
            for(int i=0; i<numCamps; i++){
                ins+=nomCols[i];
                if(i+1!=numCamps)
                    ins+=", ";
            }
                    ins+=") VALUES (";

            for(int i=0; i<cols; i++){
                for(int j=0; j<fils; j++){
                    ins+=valors[i][j];
                }
            }
            ins = ins.trim().substring(0, ins.length()-1);//Lleva l'ultima coma
            ins+=" )";

            System.out.println("Insert: \n"+ins);

            try{
                Statement stmt = conn.createStatement();
                insertat_correctament = stmt.executeUpdate(ins);
                if(!stmt.isClosed()) stmt.close();
            }catch(SQLException e){
                //Logger.getLogger(conexio.class.getName()).log(Level.SEVERE, null, e);
                System.err.println("No san pogut introduir els valors!\n"+e.getMessage());
            }
        }
        //System.out.println(insertat_correctament);
        return insertat_correctament; //1 si sa fet el insert correctament
    }

    /**
     * Fa un insert en la Base de dades
     * @param sql instruccio sql
     * @return true si sa fet el insert
     */
    public boolean Insert(String sql) throws Exception{
        return exec(sql);
    }

    /**
     * Fa un delete en la base de dades
     * @param sql instruccio sql
     * @return true si sa fet el delete
     */
    public boolean Delete(String sql) throws Exception{
        return exec(sql);
    }

    private boolean exec(String sql) throws Exception{
        try{
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            if(!stmt.isClosed()) stmt.close();
        }catch(SQLException e){
            throw new Exception(e);
        }
        return true;
    }

    /**
     * Cambia de base de dades
     * @param nom nom de la nova base dadades
     * @throws noHayInternet si no nia conexio a internet
     */
    public void setBD(String nom) throws noHayInternet{
        tancaConexio();
        bd=nom;
        creaConexio();
    }

    /**
     * Reinicia la conexio a la base dades
     * @throws noHayInternet sin no hi ha conexio a internet
     */
    public void reconectar() throws noHayInternet{
        tancaConexio();
        creaConexio();
    }

    /**
     * torna el nom del la base de dades
     * @return String nom de la base de dades
     */
    public String getBD(){
        return bd;
    }

}