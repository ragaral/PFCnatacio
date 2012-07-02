package pfc.natacio.dades;

import java.util.Objects;
import javax.swing.JOptionPane;
import pfc.natacio.exepcions.noHayInternet;
import pfc.natacio.logica.Conexio;
import pfc.natacio.logica.Data;
import pfc.natacio.logica.Temps;

/**
 * @author raul
 */
public class Prova implements Comparable<Prova>{
    private int id, metres, braçades, metresPicina;
    private String estil, lloc;
    private Temps temps;
    private Data fetxa;
    private boolean boolParcials;
    private Parcials parcials;

    /**
     * obté les dades de la base de dades
     * @param id id que te la prova en la base de dades
     */
    public Prova(int id){
        this.id = id;
        initDades();
    }
    /**
     * Guarda els parcials en memoria
     * @param id
     * @param metres
     * @param estil
     * @param temps
     * @param data
     * @param lloc
     * @param metresPicina
     * @param braçades
     * @param parcials 
     * @see setDataBase()
     */
    public Prova(int id, int metres, String estil, String temps, String data, String lloc, int metresPicina, int braçades, boolean parcials){
        this(metres, estil, temps, data, lloc, metresPicina, braçades);
        this.id = id;
        this.boolParcials = parcials;
        if(parcials)
            this.parcials = new Parcials(id);
    }
    
    public Prova (int metres, String estil, String temps, String data, String lloc, int metresPicina, int braçades){
        this.id = 0;
        this.metres =  metres;
        this.estil  =  estil;
        this.temps  =  new Temps(temps);
        this.fetxa  =  new Data(data);
        this.lloc   =  lloc;
        this.metresPicina   = metresPicina;
        this.braçades = braçades;
        this.boolParcials = false;
        this.parcials = null;
    }
    
    private void initDades() {
        try {
            Conexio conn = new Conexio();
            String dades[][] = conn.Consultar("SELECT p.metres, p.estil, np.temps, np.fetxa, np.lloc, np.metrespicina, np.brazades, par.id"
                    + "FROM nadador_prova np, proves p LEFT JOIN parcials par ON p.id = par.id"
                    + "WHERE np.proba = p.id and id = "+id);
            conn.tancaConexio();
            for(int i = 0; i < dades[0].length; i++){
                this.metres =  Integer.parseInt(dades[0][0]);
                this.estil  =  dades[0][1];
                this.temps  =  new Temps(dades[0][2]);
                this.fetxa  =  new Data(dades[0][3]);
                this.lloc   =  dades[0][4];
                this.metresPicina   = Integer.parseInt(dades[0][5]);
                this.braçades = Integer.parseInt(dades[0][6]);
                this.boolParcials = !dades[0][7].equals("NULL");
                this.parcials = null;
                if(boolParcials)
                    this.parcials = new Parcials(id);
            }
        }catch (noHayInternet ex) {
            JOptionPane.showMessageDialog(null, "No se an podido recuperar los parciales.\n"+ex);
        }
    }

    public int getID(){
        return id;
    }
    public int getMetres(){
        return metres;
    }
    public String getEstil(){
        return estil;
    }
    public Temps getTemps(){
        return temps;
    }
    public Data getData(){
        return fetxa;
    }
    public String getLloc(){
        return lloc;
    }
    public int getMetresPicina(){
        return metresPicina;
    }
    public int getBraçades(){
        return braçades;
    }
    public boolean conteParcials(){
        return boolParcials;
    }
    public Parcials getParcials(){
        return parcials;
    }
    
    public void setParcial(Parcials parcials){
        this.boolParcials = true;
        this.parcials = parcials;
    }
    
    /**
     * Guarda la prova en la base de dades i, si hi han parcials, també.<br>
     * Plena la variable id amb la id de la prova introduida
     */
    public void setDataBase(Nadador nadador) throws Exception{
        String insert = "INSERT INTO `nadador_prova`(`nadador`, `proba`, `temps`, `fetxa`, `lloc`, `metrespicina`, `brazades`) "
                + "VALUES ('"+nadador.getNumFitxFed()+"', (SELECT id FROM proves WHERE metres = "+this.metres+" AND estil = '"+this.estil+"'), "
                + "'"+this.temps+"', '"+this.fetxa.toStringBD()+"', '"+this.lloc+"', '"+this.metresPicina+"', '"+this.braçades+"')";
        
//        System.out.println(">> Insert Prova: "+insert);
        
        Conexio conn = new Conexio();
        try{
            conn.Insert(insert);
        }catch(Exception ex){
            throw new Exception("Error al guardar la prueba!", ex);
        }

        String idProvaGuardada[][];
        String consulta = "SELECT id FROM `nadador_prova` "
                + "WHERE nadador = "+nadador.getNumFitxFed()+" AND proba = (SELECT id FROM proves WHERE metres = "+this.metres+" AND estil = '"+this.estil+"') AND "
                + "temps = '"+this.temps+"' AND fetxa = '"+this.fetxa.toStringBD()+"'";
//        System.out.println(">> Select idProva: "+consulta);
        
        idProvaGuardada = conn.Consultar(consulta);
        conn.tancaConexio();
        this.id = Integer.parseInt(idProvaGuardada[0][0]);

        if(this.boolParcials && idProvaGuardada.length == 1){
            parcials.setID(Integer.parseInt(idProvaGuardada[0][0]));
            parcials.setDataBase();
        }
    }

    @Override
    public String toString(){
        return String.format("\t %5d %15s %15s %15s\n", metres, estil, temps, fetxa);
    }

    @Override
    public int compareTo(Prova proba){
        int resul;
        resul = this.metres - proba.getMetres();
        if(resul == 0){
            resul = this.estil.compareTo(proba.getEstil());
            if(resul == 0){
                resul = this.temps.compareTo(proba.getTemps());
                if(resul == 0){
                    resul = this.fetxa.compareTo(proba.getData());
                }
            }
        }
        return resul;
    }
    
    @Override
    public boolean equals(Object prova){
        if(prova instanceof Prova && compareTo((Prova)prova) == 0)
            return true;
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.metres;
        hash = 97 * hash + Objects.hashCode(this.estil);
        hash = 97 * hash + Objects.hashCode(this.lloc);
        hash = 97 * hash + Objects.hashCode(this.temps);
        hash = 97 * hash + Objects.hashCode(this.fetxa);
        return hash;
    }
}
