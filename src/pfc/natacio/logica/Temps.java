package pfc.natacio.logica;

/**
 *
 * @author Raul
 */
public class Temps implements Comparable<Temps>{
    private int m,s,c;

    /**
     * Crea un abjecte amb minuts, segons i centecimes
     * @param temps String amb el temps
     */
    public Temps( String temps )
    {
            fromString( temps );
    }
    /**
     * Crea un abjecte amb minuts, segons i centecimes
     * @param m minuts
     * @param s segons
     * @param c centecimes
     */
    public Temps( int m, int s, int c )
    {
            this.m=m;
            this.s=s;
            this.c=c;
    }
    
    /**
     * 
     * @param temps segons totals
     */
    public Temps( double temps ){
        this.m = (int) (temps/60);
        this.s = (int) (temps-(this.m*60));
        this.c = (int) (((temps-(this.m*60))-this.s)*100);
    }
    
    /**
     * Pasa el temps a centecimes
     * @return int amb les centecimes totals
     */
    private int toCentecimes()
    {
        return (((m*60)+s)*100)+c;
    }
    public double toSegons(){
        return ((m*60.0)+s)+(c/100.0);
    }

    /**
     * Compara dos Temps
     * @param t temps a comparar
     * @return -1 si t major this <br> 0 si t igual this <br> 1 si t menor this
     */
    @Override
    public int compareTo( Temps t )
    {
            return this.toCentecimes() - t.toCentecimes();
    }
    
    /**
     * Compara si son tos temps iguals
     * @param t temps a comparar
     * @return true si son iguals
     */
    public boolean equals( Temps t )
    {
            return compareTo(t) == 0;
    }
    
    /**
     * Tranforma el temps en una string del tipo mm:ss:dd
     * @return String
     */
    @Override
    public String toString()
    {
            return String.format( "%02d:%02d:%02d", m, s, c );
    }
    
    /**
     * Crea un objecte igual
     * @return Temps
     */
    @Override
    public Temps clone()
    {
            return new Temps( m, s, c );
    }
    
    /**
     * Pasa la string a temps
     * @param str
     */
    private void fromString( String str )
    {
        String descomp[] = str.split("[:/. -]");
        
        if(descomp.length == 3){
            this.m = Integer.parseInt( descomp[0] );
            this.s = Integer.parseInt( descomp[1] );
            this.c = Integer.parseInt( descomp[2] );
        }
        if(descomp.length == 2){
            this.m = 0;
            this.s = Integer.parseInt( descomp[0] );
            this.c = Integer.parseInt( descomp[1] );
        }
        
    }
}
