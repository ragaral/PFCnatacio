package pfc.natacio.logica;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author raul
 */
public class Data implements Comparable<Data> {
    private int d, m, a;
    
    public Data(){
        Calendar c = new GregorianCalendar();
        this.d = c.get(Calendar.DATE);
        this.m = c.get(Calendar.MONTH)+1;
        this.a = c.get(Calendar.YEAR);
    }

    public Data( String str )
    {
            fromString( str );
    }
    public Data( int d, int m, int a )
    {
            this.d=d;
            this.m=m;
            this.a=a;
    }

    public int getAny(){
        return a;
    }

    public int getMes(){
        return m;
    }

    public int getDia(){
        return d;
    }

    private int toInt() {
        return (a*360)+(m*30)+d;
    }

    @Override
    public int compareTo( Data altra ) {
        return this.toInt() - altra.toInt();
    }

    public boolean equals( Data altra ) {
        return compareTo(altra) == 0;
    }

    @Override
    public String toString() {
        return String.format( "%02d/%02d/%04d", d, m, a );
    }
    
    /**
     * Per a la base de dades MySQL
     * @return String tipo: AAAA/MM/DD
     */
    public String toStringBD() {
        return String.format( "%04d/%02d/%02d", a, m, d );
    }

    @Override
    public Data clone()
    {
        return new Data( d, m, a );
    }

    private void fromString(String str){
        String desc[] = str.split("[/:. -]", 3);//L'espai te que anar pel mig, sino no va

        if(desc[0].length()==2){ //comprova si el primer parametre te 2 cifres (dia)
            d = Integer.parseInt( desc[0] );
            m = Integer.parseInt( desc[1] );
            a = Integer.parseInt( desc[2] );
        }
        else if(desc[0].length()==4){ //comprova si el primer parametre te 4 cifres (any)
            a = Integer.parseInt( desc[0] );
            m = Integer.parseInt( desc[1] );
            d = Integer.parseInt( desc[2] );
        }
    }
}
