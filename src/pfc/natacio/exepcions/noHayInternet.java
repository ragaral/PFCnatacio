/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pfc.natacio.exepcions;

import java.sql.SQLException;

/**
 *
 * @author Raul
 */
public class noHayInternet extends SQLException {

    private String err;

    public noHayInternet() {
        this.err = "Fallo al realizar la conexion. \nNo hay conexion a internet? ";
    }

    public noHayInternet(String err){
        this.err = err;
    }

    @Override
    public String toString(){
        return err;
    }

}
