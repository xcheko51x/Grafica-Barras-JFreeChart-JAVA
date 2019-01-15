/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplograficabarrasjfreechart;

import java.lang.reflect.InvocationTargetException;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author xcheko51x
 */
public class EjemploGraficaBarrasJFreeChart extends JFrame{

    public EjemploGraficaBarrasJFreeChart() {
        
        // Propiedades necesarias para la grafica
        CategoryDataset dataset = createDataset();
        
        JFreeChart chart = ChartFactory.createBarChart("Grafica de barra Ejemplo", 
                "X", 
                "Y", 
                dataset,
                PlotOrientation.VERTICAL,
                true, true, false
        );
        
        ChartPanel panel = new ChartPanel(chart);
        setContentPane(panel);
    
    }

    // Datos a mostrar en la grafica
    private CategoryDataset createDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        dataset.addValue(1, "1", "1");
        dataset.addValue(10, "1", "2");
        dataset.addValue(5, "1", "3");
        
        return dataset;
    }
    
    // Comportamiento de la ventana con la grafica
    public static void main(String[] args) throws InterruptedException, InvocationTargetException {
        SwingUtilities.invokeAndWait(()->{
            EjemploGraficaBarrasJFreeChart ejemplo = new EjemploGraficaBarrasJFreeChart();
            ejemplo.setSize(800, 400);
            ejemplo.setLocationRelativeTo(null);
            ejemplo.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            ejemplo.setVisible(true);
        });
    }
    
}
