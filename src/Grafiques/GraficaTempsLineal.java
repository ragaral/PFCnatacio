package Grafiques;

import java.awt.BorderLayout;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.time.Day;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import pfc.natacio.logica.Data;
import pfc.natacio.logica.Temps;

/**
 *
 * @author Raul
 * @version 1.0 (16/06/11)
 */
public class GraficaTempsLineal extends JPanel {
    private ArrayList<Temps> valors;
    private ArrayList<Data> nomGrups;
    //private XYDataset dataset;
    private TimeSeriesCollection dataset;
    
    /**
     * crea una grafica tipo temps dd/mm/aaaa (X) i valors numerics (Y)
     */
    public GraficaTempsLineal() {
        super();
        dataset = new TimeSeriesCollection();
        valors = new ArrayList<>();
        nomGrups = new ArrayList<>();
    }
    
    /**
     * crea una grafica tipo temps dd/mm/aaaa (X) i valors numerics (Y)
     */
    public GraficaTempsLineal(Temps valor[], Data nomGrup[], String titol,
                        String titolGrafica, String subtitol, String eixX, String eixY) {
        this();
        setData(valor, nomGrup, titol);
        createChart(titolGrafica, subtitol, eixX, eixY);
    }
    
    /**
     * 
     * @param valor
     * @param nomGrup
     * @param titol que apareixera cuan pases el ratoli per damunt d'un punt
     */
    public void setData(Temps valor[], Data nomGrup[], String titol) {
        TimeSeries s1 = new TimeSeries(titol);
        
        if(valor.length != nomGrup.length){
            JOptionPane.showMessageDialog(null, "Numero de valor diferens");
            System.err.println("Error en addData, el numero de valors es diferent!");
        }
        
        for(int i = 0; i < valor.length; i++){
            s1.add(new Day(nomGrup[i].getDia(), nomGrup[i].getMes(), nomGrup[i].getAny()), valor[i].toSegons());
        }
        
        TimeSeriesCollection dataset = new TimeSeriesCollection();
        dataset.addSeries(s1);
        this.dataset = dataset;
    }
    
    public void setData(ArrayList<Temps> valor, ArrayList<Data> nomGrup, String titol) {
        TimeSeries s1 = new TimeSeries(titol);
        
        if(valor.size() != nomGrup.size()){
            JOptionPane.showMessageDialog(null, "Numero de valor diferens");
            System.err.println("Error en addData, el numero de valors es diferent!");
        }
        
        for(int i = 0; i < valor.size(); i++){
            s1.add(new Day(nomGrup.get(i).getDia(), nomGrup.get(i).getMes(), nomGrup.get(i).getAny()), valor.get(i).toSegons());
        }
        
        TimeSeriesCollection dataset = new TimeSeriesCollection();
        dataset.addSeries(s1);
        this.dataset = dataset;
    }
    
    public void setData(Temps valor, Data nomGrup, String titol){
        valors.add(valor);
        nomGrups.add(nomGrup);
        setData(valors, nomGrups, titol);
    }
    
    public void createChart(String titolGrafica, String subtitol, String eixX, String eixY) {
        JFreeChart chart;
        ChartPanel chartPanel = null;
        // create the chart...
        chart = ChartFactory.createTimeSeriesChart(
            titolGrafica, // chart title
            eixX, // domain axis label
            eixY, // range axis label
            dataset, // data
            false, // include legend
            true, // tooltips
            false // urls
        );
        if(subtitol.equals("") || subtitol != null) 
            chart.addSubtitle(new TextTitle(subtitol));

        //chart.setBackgroundPaint(Color.white);
        XYPlot plot = (XYPlot) chart.getPlot();
        //plot.setBackgroundPaint(Color.lightGray);
        //plot.setDomainGridlinePaint(Color.white);
        //plot.setRangeGridlinePaint(Color.white);
        //plot.setAxisOffset(new RectangleInsets(5.0, 5.0, 5.0, 5.0));
        //plot.setDomainCrosshairVisible(true);
        //plot.setRangeCrosshairVisible(true);
        XYItemRenderer r = plot.getRenderer();
        if (r instanceof XYLineAndShapeRenderer) {
            XYLineAndShapeRenderer renderer = (XYLineAndShapeRenderer) r;
            renderer.setBaseShapesVisible(true);
            renderer.setBaseShapesFilled(true);
        }
        DateAxis axis = (DateAxis) plot.getDomainAxis();
        axis.setDateFormatOverride(new SimpleDateFormat("dd-MMM-yyyy"));
        
        //AFEGIM LA GRAFICA AL PANEL
        this.setLayout(new BorderLayout());
        chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(this.getSize());
        this.add(chartPanel, BorderLayout.CENTER);

    }

    /*
    public static void main(String args[]){
        Temps valor[] = {new Temps("1:45:05"), new Temps("1:35:35"), new Temps("1:30:01"), 
                        new Temps("1:25:54"), new Temps("1:15:23"), };
        Data nom[]   = {new Data(17, 05, 2011), new Data(21, 05, 2011), new Data(6, 06, 2011), 
                        new Data(13, 06, 2011), new Data(20, 06, 2011) };
        
        GraficaTempsLineal g = new GraficaTempsLineal();
        g.setSize(600, 400);
        //g.setData(valor, nom, "Prova Graf");
        g.setData(new Temps(0, 0, 0), new Data(27, 04, 2011), "titol");
        for (int i = 0; i < valor.length; i++) {
            g.setData(valor[i], nom[i], "titol");
        }
        g.createChart("Proba Grafica", "", "mesos", "numeros");
        g.setVisible(true);
        JFrame p = new JFrame();
        p.setContentPane(g);
        p.pack();
        RefineryUtilities.centerFrameOnScreen(p);
        p.setVisible(true);
        p.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    }
    */
    
}
