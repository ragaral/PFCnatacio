package pfc.natacio.dades;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import pfc.natacio.exepcions.noHayInternet;
import pfc.natacio.logica.Conexio;
import pfc.natacio.logica.Data;


/**
 *
 * @author raul
 */
public class Club {
    private int id;
    private String nom;
    private TreeSet<Nadador> nadadors;
    private int numNadadors;

    /**
     * 
     * @param nom Nom del club
     */
    public Club(String nom){
        this.nom=nom;
        numNadadors=0;
        nadadors = new TreeSet<>();
        lligBD();
    }

    private void lligBD() {
        try {
            String[][] dades;
            String sql;
            /*sql="SELECT nadadors.numfitxfed, nadadors.nom, nadadors.cognoms, nadadors.fetxnaix  " +
            "FROM nadadors, club "+
            "WHERE club.id=nadadors.club && club.nom=\""+nom+"\" ORDER BY nadadors.nom";*/
            sql = "SELECT * " + "FROM nadadors, club " + "WHERE club.id=nadadors.club && club.nom=\"" + nom + "\" ORDER BY nadadors.nom;";
//            System.out.println("Consulta Club.java: \n"+sql);
            Conexio con = new Conexio();
            dades = con.Consultar(sql);
            con.tancaConexio();
            if (dades.length != 0) {
                id = Integer.parseInt(dades[0][4]);
                //System.out.print("files: "+info.length+"\n");
                for (int i = 0; i < dades.length; i++) {
                    setNadador(dades[i][0], dades[i][1], dades[i][2], new Data(dades[i][3]),
                            dades[i][5], dades[i][6], dades[i][7], dades[i][9],
                            dades[i][10], dades[i][11]);
                }
            } else {
                System.err.println("No s'ha trobat cap nadador!");
            }
        } catch (noHayInternet ex) {
            //Logger.getLogger(Club.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    /**
     * 
     * @param numFitxFed
     * @return
     */
    public Nadador buscaNadador(String numFitxFed) {
        Iterator<Nadador> llista = nadadors.iterator();
        Nadador n = null, aux;
        boolean trobat = false;
        while(llista.hasNext() && !trobat){
            aux = llista.next();
            if(aux.getNumFitxFed().equalsIgnoreCase(numFitxFed)){
                n = aux;
                trobat = true;
            }
        }
        return n;
    }

    /**
     * Busca el nadador amb en nom i cognom indicats
     *
     * @param nom       Nom del nadador
     * @param cognom    Gognom del nadador
     * @return Nadador
     */
    public Nadador buscaNadador(String nom, String cognom){
        Iterator<Nadador> llista = nadadors.iterator();
        Nadador n = null, aux;
        boolean trobat = false;
        while(llista.hasNext() && !trobat){
            aux = llista.next();
            if(aux.getNom().equalsIgnoreCase(nom.trim()) && aux.getCognom().equalsIgnoreCase(cognom.trim())){
                n = aux;
                trobat = true;
            }
        }
        return n;
    }
    
    /**
     * (Predictor) Busca un cognom que coicidisca amb les lletres pasades
     * @param partCognom primeres lletres del cognom a buscar
     * @return Nadador trobat
     */
    public Nadador predirCognom(String partCognom){
        Iterator<Nadador> llista = nadadors.iterator();
        Nadador n = null, aux;
        
        boolean trobat = false;
        while(llista.hasNext() && !trobat){
            aux = llista.next();
//            System.out.println("aux = "+aux.getCognom()+" vs "+partCognom);
            trobat = aux.getCognom().toLowerCase().startsWith(partCognom.toLowerCase());
//            System.out.println(trobat);
            if(trobat){
                n = aux; trobat = true;
//                System.out.println("return "+n.getCognom());
            }
        }
        
        return n;
    }
   
    /**
     * (Predictor) Busca un cognom que coicidisca amb les lletres pasades
     * @param partCognom primeres lletres del cognom a buscar
     * @return Nadador trobat
     */
    public Nadador predirCognom(String nom ,String partCognom){
        Iterator<Nadador> llista = nadadors.iterator();
        Nadador n = null, aux;
        
        boolean trobat = false;
        while(llista.hasNext() && !trobat){
            aux = llista.next();
//            System.out.println("aux = "+aux.getCognom()+" vs "+partCognom);
            if(aux.getNom().toLowerCase().equals(nom.toLowerCase()))
                trobat = aux.getCognom().toLowerCase().startsWith(partCognom.toLowerCase());
//            System.out.println(trobat);
            if(trobat){
                n = aux; trobat = true;
//                System.out.println("return "+n.getCognom());
            }
        }
        
        return n;
    }
    
    /**
     * (Predictor) Busca un Nom que coicidisca amb les lletres pasades 
     * @param partNom primeres lletres del nom a buscar
     * @return Nadador trobat
     */
    public Nadador predirNom(String partNom){
        Iterator<Nadador> llista = nadadors.iterator();
        Nadador n = null, aux;
        
        boolean trobat = false;
        while(llista.hasNext() && !trobat){
            aux = llista.next();
//            System.out.println("aux = "+aux.getCognom()+" vs "+partCognom);
            trobat = aux.getNom().toLowerCase().startsWith(partNom.toLowerCase());
//            System.out.println(trobat);
            if(trobat){
                n = aux; trobat = true;
//                System.out.println("return "+n.getCognom());
            }
        }
        
        return n;
    }
    
    /**
     * 
     * @param num
     * @return
     */
    public Nadador getNadador(int num){
        Iterator<Nadador> llista = nadadors.iterator();
        Nadador n = null;
        
        for(int i = 0; i <= num && llista.hasNext(); i++){
            n = llista.next();
        }
        return n;
    }

    /**
     * Inserta un nadador en la Base da dades i l'array
     *
     * @param numFitxFed
     * @param nom
     * @param cognom
     * @param fetxNaix
     * @param club
     * @param carrer
     * @param poblacio
     * @param provincia
     * @param pais
     * @param cp
     * @param telf
     * @param correu
     * @return boolean <ul>True - Nadador inserit correctament</ul>
     *                 <ul>False - Nadador NO s'ha inserit</ul>
     */
    public boolean inserirNadador(String numFitxFed, String nom, String cognom, String fetxNaix,
                    String club, String carrer, String poblacio, String provincia, String pais,
                    String cp, String telf, String correu) throws Exception {
        boolean inserit=false;
        
        if(carrer.isEmpty()) carrer = null;
        if(poblacio.isEmpty()) poblacio = null;
        if(provincia.isEmpty()) provincia = null;
        if(pais.isEmpty()) pais = null;
        if(cp.isEmpty()) cp = null;
        if(telf.isEmpty()) telf = null;
        if(correu.isEmpty()) correu = null;

        try{
            String sql = "INSERT INTO nadadors VALUES (\'" + numFitxFed + "\', \"" + nom + "\", "
                    + "\"" + cognom + "\", \'" + fetxNaix + "\', " + "(SELECT id FROM club WHERE nom=\'" + club + "\'),"
                    + " \"" + carrer + "\", \"" + poblacio + "\", \"" + provincia + "\", \""+pais+"\", " + cp + ", "
                    + "" + telf + ", \"" + correu + "\")";
            System.out.println("SQL: "+sql);

            Conexio con = new Conexio();
            inserit = con.Insert(sql);
            con.tancaConexio();
        } catch (noHayInternet ex) {
            Logger.getLogger(Club.class.getName()).log(Level.SEVERE, null, ex);
        }

        if(inserit) 
            setNadador(numFitxFed, nom, cognom, new Data(fetxNaix), carrer, poblacio,
                    provincia, cp, telf, correu);
        
        return inserit;
    }

    /**
     * Inserta un nadador en la Base de dades
     *
     * @param numFitxFed    Numero de la fitxa federativa
     * @param nom           Nom del nadador
     * @param cognom        Cognom del nadador
     * @param fetxNaix      Fetxa de naixement
     * @param carrer        Direccio on viu
     * @param poblacio
     * @param provincia
     * @param cp            Codig Postal
     * @param telf          Telefon fixe
     * @param correu        Correu electronic
     */
    private void setNadador(String numFitxFed, String nom, String cognom, Data fetxNaix,
                    String carrer, String poblacio, String provincia, 
                    String cp, String telf, String correu) {

        nadadors.add(new Nadador(numFitxFed, nom, cognom, fetxNaix, carrer, poblacio, provincia, cp,
                telf, correu));
        numNadadors++;
    }


    /**
     * Borra el nadador de l'array i la base de dades
     * 
     * @param nada 
     * @return true Si el nadador sa esborrat correctament
     */
    public boolean delNadador(Nadador nada) throws Exception{
        boolean eliminat = false;
        try {
            String sql;
            Conexio con = new Conexio();
            if (nada.getNumProbes() != 0) {
                sql = "DELETE FROM nadadprob WHERE nadador=\"" + nada.getNumFitxFed() + "\"";
                con.Delete(sql);
            }
            sql = "DELETE FROM nadadors WHERE numfitxfed=\"" + nada.getNumFitxFed() + "\"";
            //System.out.println("SQL: "+sql);
            eliminat = con.Delete(sql);
            
            if (eliminat) {
                nadadors.remove(nada);
                numNadadors--;
            }
            con.tancaConexio();
        } catch (noHayInternet ex) {
            //Logger.getLogger(Club.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }
        return eliminat;
    }

    /**
     * Resetetja el objecte
     */
    public void recarega(){
        numNadadors=0;
        nadadors.removeAll(nadadors);
        lligBD();
    }

    /**
     * Retorna una String amb tots els nadadors
     *
     * @return format: "%-13s\t %-10s\t %-20s \n"
     */
    @Override
    public String toString(){
        return nadadors.toString();
    }

    /**
     *
     * @return String Nom del Club
     */
    public String getNom(){
        return nom;
    }

    /**
     *
     * @return int Numero de nadadors en l'array
     */
    public int getNumNadadors(){
        return numNadadors;
    }

    /**
     * 
     * @return int id del club en la base de datos
     */
    public int getId(){
        return id;
    }
}
