package kata5;

public class ConsoleHistogramViewer<T> extends HistogramViewer<T>{

    public ConsoleHistogramViewer(Histogram<T> histogram) {
        super(histogram);
    }
    
    public void show(){
        for (T item : getHistogram().keySet()) {
            System.out.println(item+ " " + getHistogram().get(item));
        }
    }
}

