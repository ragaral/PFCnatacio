package pfc.natacio.dades;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import pfc.natacio.exepcions.noHayInternet;
import pfc.natacio.logica.Conexio;
import pfc.natacio.logica.Data;

/**
 *
 * @author raul
 */
public class Nadador implements Comparable<Nadador> {
    private String nom;
    private String cognom;
    private Data fetxNaix;
    private String numFitxFed;
    private ArrayList<Prova> proves;

    private String carrer;
    private String poblacio;
    private String provincia;
    private String cp;
    private String telefon;
    private String correu;

    /**
     * 
     * @param numFitxFed numero de llicencia
     * @param nom
     * @param cognom
     * @param fetxNaix Data
     * @param carrer
     * @param pobl
     * @param provin
     * @param cp
     * @param telf
     * @param correu
     */
    public Nadador(String numFitxFed, String nom, String cognom, Data fetxNaix , String carrer, 
            String pobl, String provin, String cp, String telf, String correu){
        this.nom=nom;
        this.cognom=cognom;
        this.fetxNaix=fetxNaix;
        this.numFitxFed=numFitxFed;
        this.carrer=carrer;
        this.poblacio=pobl;
        this.provincia=provin;
        this.cp=cp;
        this.telefon=telf;
        this.correu=correu;

        proves = new ArrayList<>();
//        initProves();
    }

    /**
     * Plena l'array amb les probes del nadador
     */
    public void initProves(){
        if(proves.isEmpty())
        try {
            String[][] info;
            String sql;
            sql = "SELECT DISTINCT np.id, p.metres, p.estil, np.temps, np.fetxa, np.lloc, np.metrespicina, np.brazades, pa.prova_nadada " 
                    + "FROM proves p, nadadors n, nadador_prova np left join parcials pa ON (pa.prova_nadada = np.id)  "
                    + "WHERE np.nadador = n.numfitxfed && np.proba = p.id && n.numfitxfed = " + numFitxFed +" "
                    + "ORDER BY p.metres, p.estil, np.fetxa";
//            System.out.println("Consulta Nadador.initProves: \n"+sql);

            Conexio con = new Conexio();
            info = con.Consultar(sql);
            con.tancaConexio();
            
            if (info.length != 0) {
                boolean parcials;
                for (int i = 0; i < info.length; i++) {
                    parcials = false;
                    if(info[i][8] != null)
                        parcials = true;
                    if(info[i][7] == null) //si no s'han apuntat  les braçades 
                        info[i][7] = "0";
                    //                                          id,                            metres      estil       temps       data        lloc                         picina                       braçades 
                    Prova provAux = new Prova(Integer.parseInt(info[i][0]), Integer.parseInt(info[i][1]), info[i][2], info[i][3], info[i][4], info[i][5], Integer.parseInt(info[i][6]), Integer.parseInt(info[i][7]), parcials);
                    proves.add(provAux);
                }
            } else {
                System.err.println("No s'ha trobat cap proba de " + nom + "!");
            }
        } catch (noHayInternet ex) {
            //Logger.getLogger(Nadador.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public Prova buscaProva(int metres, String estil, Data data){
        Prova p = null;
        for(int i = 0; i < proves.size(); i++){
            if(proves.get(i).getMetres() == metres && proves.get(i).getEstil().contains(estil) && proves.get(i).getData().equals(data))
                p = proves.get(i);
        }
        return p;
    }
    
    /**
     * 
     * @return ArrayList<Proba> amb totes les probes
     */
//    public ArrayList<Prova> getProves(){
//        return proves;
//    }
    
    /**
     * 
     * @param metres
     * @param estil
     * @param metresPiscina 
     * @return Prova amb millor temps
     */
    public Prova getMillorProva(int metres, String estil, int metresPiscina){
        Prova aux = null;
        for(int i = 0; i < proves.size(); i++){
            if(proves.get(i).getMetres() == metres && proves.get(i).getEstil().equals(estil) && proves.get(i).getMetresPicina() == metresPiscina)
                if(aux == null) aux = proves.get(i);
                else if(proves.get(i).getTemps().compareTo(aux.getTemps()) < 0)
                    aux = proves.get(i);
        }
//        System.out.println(aux);
        return aux;
    }

    /**
     * 
     * @return
     */
    public int getNumProbes(){
        return proves.size();
    }

    /** Torna en una String, la prova num
     * 
     * @param num
     * @return Prova
     */
    public Prova getProba(int num){
        return this.proves.get(num);
    }
    
    public String getNom(){
        return nom;
    }

    /**
     * 
     * @return
     */
    public String getCognom(){
        return cognom;
    }

    /**
     * 
     * @return
     */
    public String getNumFitxFed(){
        return numFitxFed;
    }

    /**
     * 
     * @return
     */
    public String getFetxNaix(){
        return fetxNaix.toString();
    }
    
    /**
     * 
     * @return
     */
    public String getCarrer(){
        return carrer;
    }

    /**
     * 
     * @return
     */
    public String getProblacio(){
        return poblacio;
    }

    /**
     * 
     * @return
     */
    public String getProvincia(){
        return provincia;
    }

    /**
     * 
     * @return
     */
    public String getCP(){
        return cp;
    }

    /**
     * 
     * @return
     */
    public String getTelefon(){
        return telefon;
    }

    /**
     * 
     * @return
     */
    public String getCorreu(){
        return correu;
    }
    
    /**
     * Guarga al nadador en la base de dades
     */
    public void setDataBase(Club club) throws Exception{
        String pais = "España";
        String insert = "INSERT INTO `nadadors`(`numfitxfed`, `nom`, `cognoms`, `fetxnaix`, `club`, `carrer`, `poblacio`, `provincia`, `pais`, `cp`, `telefon`, `correu`) "
                + "VALUES ('"+this.numFitxFed+"', '"+this.nom+"', '"+this.cognom+"', '"+this.fetxNaix.toStringBD()+"', "
                + ""+club.getId()+", '"+this.carrer+"', '"+this.poblacio+"', '"+this.provincia+"', '"+pais+"', '"+this.cp+"', '"+this.telefon+"', '"+this.correu+"'";
        
        System.out.println(">> Insert Prova: "+insert);
        
        Conexio conn = new Conexio();
        if(!conn.Insert(insert))
            System.err.println("Error al guardar la prueba!");
    }

    /**
     * Afegeix una prova 
     * @param prova 
     */
    public void setProva(Prova prova){
        this.proves.add(prova);
    }

    /**
     * Retorna una string amb la fitxa, nom, cognom i les probes del nadador
     *
     * @return Format: "%-12s\t %10s\t %20s\n"
     */
    public String toStringIProb(){
        String str="";

        str=String.format("%-12s\t %10s\t %20s\n",numFitxFed ,nom, cognom);

        for(int i=0; i<proves.size(); i++){
            str+=proves.get(i).toString();
        }

        return str;
    }

    /**
     * Retorna una strin amb la fitxa, nom i cognom del nadador
     *
     * @return format: "%-13s\t %-10s\t %-20s \n"
     */
    @Override
    public String toString(){
        String str="";

        str=String.format("%-13s\t %-10s\t %-20s \n",numFitxFed ,nom, cognom);

        return str;
    }

    /**
     * Compara entre dos nadadors
     * @param n nadador a comparar
     * @return -1 n es major<br> 1 n es menos<br> 0 son iguals
     */
    @Override
    public int compareTo(Nadador n){
        return this.numFitxFed.compareTo(n.getNumFitxFed());
    }

    /**
     * Compara si dos Nadadors son iguals
     * @param n nadador a comparar
     * @return true si son igual
     */
    public boolean equals(Nadador n){
        return this.numFitxFed.equals(n.getNumFitxFed());
    }

}
