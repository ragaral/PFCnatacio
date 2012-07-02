package pfc.natacio.dades;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import pfc.natacio.exepcions.noHayInternet;
import pfc.natacio.logica.Conexio;
import pfc.natacio.logica.Temps;

/**
 *
 * @author Raul
 */
public class Parcials implements Comparable<Parcials>{
    private int id;
    private ArrayList<Posta> postes;
    
    /**
     * Obté les dades de la base de dades
     * @param idProva id que te la prova en la base de dades
     */
    public Parcials(int idProva){
        this.id = idProva;
        postes = new ArrayList<>();
        initTemps();
    }
    
    /**
     * Guarda els parcials en memoria
     * @param id id de la prova
     * @param metres ArryList de metres dels parcials
     * @param temps ArrayList de temps dels parcials
     * @see setDataBase()
     */
    public Parcials(int id, ArrayList<Double> metres, ArrayList<Temps> temps){
        this.id = id;
        postes = new ArrayList<>();
        for (int i = 0; i < temps.size(); i++) {
            try{
                postes.add( new Posta(metres.get(i), temps.get(i)) );
            }catch(IndexOutOfBoundsException ex){ }
        }
    }
    
    /**
     * Guarda els parcials en memoria
     * @param metres metres
     * @param temps temps
     * @see setDataBase()
     */
    public Parcials(ArrayList<Double> metres, ArrayList<Temps> temps){
        for (int i = 0; i < metres.size(); i++) {
            try{
                postes.add( new Posta(metres.get(i), temps.get(i)) );
            }catch(IndexOutOfBoundsException ex){ }
        }
    }
    
    private void initTemps() {
        try {
            Conexio conn = new Conexio();
            String dades[][] = conn.Consultar("SELECT * FROM parcials WHERE prova_nadada = "+id);
            conn.tancaConexio();
            for(int i = 0; i < dades.length; i++){
                postes.add( new Posta( Double.parseDouble(dades[i][2]), new Temps(dades[i][3]) ) );
            }
        } catch (noHayInternet ex) {
            JOptionPane.showMessageDialog(null, "No se an podido recuperar los parciales.\n"+ex);
        }
    }
    
    /**
     * 
     * @return id en la taula de la base de dades
     */
    public int getId(){
        return id;
    }
    
    /**
     * 
     * @return numero de parcials que te una prova
     */
    public int getNumPostes(){
        return postes.size();
    }
    
    public Temps getTemps(int num){
        return postes.get(num).temps;
    }
    
    public double getMetres(int num){
        return postes.get(num).metres;
    }
    
    /**
     * 
     * @param num numero del parcial
     * @return posta - double metres, Temps temps
     */
    public Posta getPosta(int num){
        return postes.get(num);
    }
    
    /**
     * 
     * @param id id de la prova a la que fa referencia
     */
    public void setID(int id){
        this.id = id;
    }
    
    /**
     * Guarda els parcials en la base de dades
     */
    public void setDataBase() throws Exception{
        String insert = "INSERT INTO `parcials` (`prova_nadada`, `metres`, `temps`) VALUES ";
        
        for (int i = 0; i < postes.size(); i++) {
            insert += "("+id+", "+postes.get(i).metres+", '"+postes.get(i).temps+"'), ";
        }
        
        insert = insert.substring(0, insert.length()-2); //lleva l'ultima coma i espai
        System.out.println(">> Insert Parcial: "+insert);
        try {
            Conexio conn = new Conexio();
            if(!conn.Insert(insert))
                System.err.println("Error al guardar el parcial!");
            conn.tancaConexio();
        } catch (noHayInternet ex) {
            postes = null;
            throw new Exception("No se an podido guardar los parciales", ex);
        }
    }
    
    @Override
    public int compareTo(Parcials o) {
        return this.id-o.getId();
    }
    
    /**
     * Classe auxiliar per a almacenar metres i temps del parcial
     */
    public class Posta{
        double metres;
        Temps temps;
        
        public Posta(double metres, Temps temps){
            this.metres = metres;
            this.temps = temps;
        }
    }
}
