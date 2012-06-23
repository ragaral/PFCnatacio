package pfc.natacio.logica;

import pfc.natacio.exepcions.noHayInternet;
import pfc.natacio.vista.Login;

/**
 *
 * @author Raul
 */
public class ComprovarLogin extends Thread {
    private String nomClub;
    private String passwd;
    private Club club;
    private Login login;

    public ComprovarLogin(String nomC, String pass, Login login) {
        this.nomClub = nomC;
        this.passwd = pass;
        this.login = login;
        club = null;
    }
    
    
    public void run(){
        try{
            String sql = "SELECT nom FROM club WHERE user=\'" + nomClub + "\' && pass= md5(\'" + passwd + "\')";
            String[][] dada;
            login.setValueProgresBar(10);
            
            Conexio con = new Conexio();
            login.setValueProgresBar(30);
            dada = con.Consultar(sql);
            con.tancaConexio();
            login.setValueProgresBar(60);
            
            
            if (dada.length == 1) {
                club = new Club(dada[0][0]);
                login.setValueProgresBar(100);
                login.setClub(club);
            }
        }catch(noHayInternet ex){
            System.err.println(ex);
            login.setException(ex);
        }
    }
    
    public Club getClub(){
        return club;
    }
    
}
