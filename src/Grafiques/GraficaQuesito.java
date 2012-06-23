package Grafiques;

import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import org.jfree.chart.*;
import org.jfree.data.general.*;

/**
 *
 * @author Raul
 * @version 1.0 (16/06/2011)
 */
public class GraficaQuesito extends JPanel{
    
    private DefaultPieDataset dataset;
    
    public GraficaQuesito( ){
        super();
        dataset = new DefaultPieDataset();
    }
    
    public GraficaQuesito(String[] nom, Double[] valors, String titol){
        super();
        dataset = new DefaultPieDataset();
        setData(nom, valors);
        createChart(titol);
    }
    
    public void setData(String[] nom, Double[] valors){
        if(valors.length != nom.length){
            JOptionPane.showMessageDialog(null, "Numero de valor diferens");
            System.err.println("Error en addData, el numero de valors es diferent en Quesito!\n"
                    + valors.length+" "+nom.length);
        }
        
        for(int i = 0; i < valors.length; i++){
            dataset.setValue(nom[i], valors[i]);
        }
    }
    
    public void setData(String nom, Double valors){
        dataset.setValue(nom, valors);
    }
    
    public void createChart(String titol){
        JFreeChart chart = ChartFactory.createPieChart3D(
            titol,
            dataset,
            true, // legend?
            true, // tooltips?
            false // URLs?
        );

        //AFEGIM LA GRAFICA AL PANEL
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(this.getSize());
        this.add(chartPanel);
        
        /******* PEGAR EL PANEL AL CANTONS DEL CONTENEDOR ***************/
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chartPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chartPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addContainerGap())
        );
    }
    
    /*
    public static void main(String args[]){
        String[] noms = { "nom1", "nom2", "nom3"};
        Double[] valors = { 12.4, 16.9, 30.0};
        
        GraficaQuesito g = new GraficaQuesito(noms, valors, "Prova");
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
