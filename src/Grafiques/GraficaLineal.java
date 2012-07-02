package Grafiques;

import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Raul
 * @version 1.0 (11/06/11)
 */
public class GraficaLineal extends JPanel {

    private DefaultCategoryDataset dataset;

    public GraficaLineal() {
        super();
        dataset = new DefaultCategoryDataset();
    }

    public GraficaLineal(Number valor[], String nomGrup[], String nomPunt[],
            String titolGrafica, String subtitol, String eixX, String eixY) {
        this();
        setData(valor, nomGrup, nomPunt);
        createChart(titolGrafica, subtitol, eixX, eixY);
    }

    public void setData(Number valor[], String nomGrup[], String nomPunt[]) {
        if (valor.length != nomGrup.length || nomGrup.length != nomPunt.length) {
            JOptionPane.showMessageDialog(null, "Numero de valor diferens");
            System.err.println("Error en addData, el numero de valors es diferent!");
        }

        for (int i = 0; i < valor.length; i++) {
            dataset.addValue(valor[i], nomGrup[i], nomPunt[i]);
        }
    }

    public void setData(Number valor, String nomGrup, String nomPunt) {
        dataset.addValue(valor, nomGrup, nomPunt);
    }

    public void setData(ArrayList<Double> valor, String nomGrup, ArrayList<String> nomPunt) {
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();

        if (valor.size() != nomPunt.size()) {
            JOptionPane.showMessageDialog(null, "Numero de valor diferens");
            System.err.println("Error en addData, el numero de valors es diferent!");
        }

        for (int i = 0; i < valor.size(); i++) {
            dataSet.addValue(valor.get(i), nomGrup, nomPunt.get(i));
        }

        this.dataset = dataSet;
    }

    public final void createChart(String titolGrafica, String subtitol, String eixX, String eixY) {
        JFreeChart chart;
        ChartPanel chartPanel;
        // create the chart...
        chart = ChartFactory.createLineChart(
                titolGrafica, // chart title
                eixX, // domain axis label
                eixY, // range axis label
                dataset, // data
                PlotOrientation.VERTICAL, // orientation
                false, // include legend
                true, // tooltips
                false // urls
                );
        if (!subtitol.equals("") || subtitol != null) {
            chart.addSubtitle(new TextTitle(subtitol));
        }

        // customise the range axis...
//        CategoryPlot plot = (CategoryPlot) chart.getPlot();
//        NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
//        rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
//        rangeAxis.setAutoRangeIncludesZero(false);

//        LineAndShapeRenderer renderer = (LineAndShapeRenderer) plot.getRenderer();
//        renderer.setShapesVisible(true);
//        renderer.setDrawOutlines(true);
//        renderer.setUseFillPaint(true);


        //AFEGIM LA GRAFICA AL PANEL
        this.removeAll();
        this.setLayout(new BorderLayout());
        chartPanel = new ChartPanel(chart);
        chartPanel.setSize(this.getSize());
        this.add(chartPanel, BorderLayout.CENTER);
    }
    
//      public static void main(String args[]){ 
//          GraficaLineal g = new
//          GraficaLineal();
//     
//          //g.setData(valor, nom, "Prova Graf"); 
//          for (int i = 0; i < 10; i++) {
//            g.setData(2, "grup1", ""+i); 
//          } 
//          g.setData(3, "grup2", "0"); 
//          g.setData(3,"grup2", "2"); 
//          g.setData(3, "grup2", "4"); 
//          for (int i = 0; i < 3; i++) {
//            g.setData(i+3, "grup2", ""+i); 
//          } 
//          g.createChart("", "", "mesos","numeros"); 
//          g.setVisible(true); 
//          javax.swing.JFrame p = new javax.swing.JFrame(); 
//          p.setSize(600, 400); 
//          p.setContentPane(g); 
//          org.jfree.ui.RefineryUtilities.centerFrameOnScreen(p);
//          p.setVisible(true);
//          p.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE); 
//      }
     
}