package kata5;

import java.awt.PopupMenu;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

public class GraphicalHistogramViewer<T> extends HistogramViewer<T>{

    public GraphicalHistogramViewer(Histogram<T> histogram) {
        super (histogram);
    }
    
    @Override
    public void show() {
        ApplicationFrame frame = new ApplicationFrame("Histogram");
        frame.add(createChartPanel());
        frame.pack();
        frame.setVisible(true);
    }

    private ChartPanel createChartPanel() {
       ChartPanel panel = new ChartPanel(createChart());
       return panel;
    }

    private JFreeChart createChart() {
        JFreeChart chart = ChartFactory.createBarChart("Histogram", "Categories", "Frequency", createDataset());
        return chart;
    }

    private CategoryDataset createDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (T item : getHistogram().keySet()) {
            dataset.addValue(getHistogram().get(item), "Categories", (Comparable) item);
        }
        return dataset;
    }
    
}
